package tiles;

import main.GamePanel;
import main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

public class TileManager {

    GamePanel gp;
    public Tiles[] tiles;

    public int[][] mapTileNum;

    public TileManager(GamePanel gp) {
        this.gp = gp;
        tiles = new Tiles[100];
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];
        getTileImage();
        loadMap("/resources/maps/world1.txt");
    }

    public void getTileImage() {


        setup(0,"01water",true,false);
        setup(1,"02watercornerdl",false,false);
        setup(2,"03watercornerdr",false,false);
        setup(3,"04watercornerul",false,false);
        setup(4,"05watercornerur",false,false);
        setup(5,"06waterd",false,false);
        setup(6,"07wateru",false,false);
        setup(7,"08waterl",false,false);
        setup(8,"09waterr",false,false);
        setup(9,"0desert",false,false);
        setup(10,"10grass",false,false);
        setup(11,"11grass2",false,false);
        setup(12,"12grass3",false,false);
        setup(13,"13campsite1",false,false);
        setup(14,"13grass",false,false);
        setup(15,"14campsite2",false,false);
        setup(16,"15campsite3",false,false);
        setup(17,"16campsite4",false,false);
        setup(18,"17campsite",true,false);
        setup(19,"18rcdl",false,false);
        setup(20,"19rcdr",false,false);
        setup(21,"20rcul",false,false);
        setup(22,"21road2",false,false);
        setup(23,"22rcur",false,false);
        setup(24,"23road1",false,false);
        setup(25,"24road3",false,false);
        setup(26,"25roaddown",false,false);
        setup(27,"26roadup",false,false);
        setup(28,"27dooropened",false,false);
        setup(29,"28floor",false,false);
        setup(30,"29wall1",true,false);
        setup(31,"30wall2",true,false);
        setup(32,"31box",true,false);
        setup(33,"32barrel",true,false);
        setup(34,"33tire",true,false);
        setup(35,"34tree1",true,false);
        setup(36,"35tree2",true,false);
        setup(37,"36rock",true,false);
        setup(38,"37skulls",false,false);
        setup(39,"38skulls",false,false);
        setup(40,"39skulls",false,false);
        setup(41,"40skulls",false,false);
        setup(42,"41skulls",false,false);
        setup(43,"42skulls",false,false);
        setup(44,"43skulls",false,false);
        setup(45,"44skulls",false,false);
        setup(46,"45skulls",false,false);
        setup(47,"46canyon",true,false);
        setup(48,"47canyon",true,false);
        setup(49,"48canyon",true,false);
        setup(50,"49canyon",false,false);
        setup(51,"50canyon",false,false);
        setup(52,"51canyon",true,false);
        setup(53,"52rocks",false,false);
        setup(54,"53toxicvaste",false,true);

    }
    public void setup(int index,String imageName, boolean collision , boolean event){

        UtilityTool uTool = new UtilityTool();

        try{
            tiles[index] = new Tiles();
            tiles[index].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/resources/tiles/" + imageName+".png")));
            tiles[index].image = uTool.scaleImage(tiles[index].image,gp.tileSize,gp.tileSize);
            tiles[index].collision = collision;
            tiles[index].event = event;

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void loadMap(String filePath) {
        try {

            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col = 0;
            int row = 0;

            while (col < gp.maxWorldCol && row < gp.maxWorldRow) {

                String line = br.readLine();

                while (col < gp.maxWorldCol) {
                    String[] numbers = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);
                    mapTileNum[col][row] = num;
                    col++;
                }
                if (col == gp.maxWorldCol) {
                    col = 0;
                    row++;
                }

            }
            br.close();

        } catch (Exception ignored) {

        }
    }

    public void draw(Graphics2D g2) {
        int worldCol = 0;
        int worldRow = 0;

        while (worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {
            int tileNum = mapTileNum[worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

//            if (worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
//                    worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
//                    worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
//                    worldY - gp.tileSize < gp.player.worldY + gp.player.screenY)


                g2.drawImage(tiles[tileNum].image, screenX, screenY,gp.tileSize,gp.tileSize, null);
                worldCol++;



            if (worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;

            }
        }
    }
}
