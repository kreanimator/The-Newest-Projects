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
        loadMap("/resources/maps/world.txt");
    }

    public void getTileImage() {

        setup(0,"barrel",true);
        setup(1,"box",true);
        setup(2,"campsite",true);
        setup(3,"campsite1",false);
        setup(4,"campsite2",false);
        setup(5,"campsite3",false);
        setup(6,"campsite4",false);
        setup(7,"toxicvaste",false);
        setup(8,"desert",false);
        setup(9,"floor",false);
        setup(10,"grass",false);
        setup(11,"grass2",false);
        setup(12,"grass3",false);
        setup(13,"locker",true);
        setup(14,"lockeropened",true);
        setup(15,"rcdl",false);
        setup(16,"rcdr",false);
        setup(17,"rcul",false);
        setup(18,"rcur",false);
        setup(19,"road1",false);
        setup(20,"road2",false);
        setup(21,"road3",false);
        setup(22,"roaddown",false);
        setup(23,"rock",true);
        setup(24,"roadup",false);
        setup(25,"skulls",false);
        setup(26,"tire",true);
        setup(27,"tree1",true);
        setup(28,"tree2",true);
        setup(30,"wall1",true);
        setup(31,"wall2",true);
        setup(32,"dooropened",false);
        setup(34,"water",true);
        setup(35,"watercornerdl",false);
        setup(36,"watercornerdr",false);
        setup(37,"watercornerul",false);
        setup(38,"watercornerur",false);
        setup(39,"waterd",false);
        setup(40,"waterl",false);
        setup(41,"waterr",false);
        setup(42,"wateru",false);

    }
    public void setup(int index,String imageName, boolean collision){

        UtilityTool uTool = new UtilityTool();

        try{
            tiles[index] = new Tiles();
            tiles[index].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/resources/tiles/" + imageName+".png")));
            tiles[index].image = uTool.scaleImage(tiles[index].image,gp.tileSize,gp.tileSize);
            tiles[index].collision = collision;

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


                g2.drawImage(tiles[tileNum].image, screenX, screenY, null);
                worldCol++;



            if (worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;

            }
        }
    }
}
