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

    public int[][][] mapTileNum;
    boolean drawPath = true;

    public TileManager(GamePanel gp) {
        this.gp = gp;
        tiles = new Tiles[200];
        mapTileNum = new int[gp.maxMap][gp.maxWorldCol][gp.maxWorldRow];
        getTileImage();
        loadMap("/resources/maps/world1.txt", 0);
        loadMap("/resources/maps/cave.txt", 1);
        loadMap("/resources/maps/bunker1.txt", 2);
        loadMap("/resources/maps/bunker2.txt", 3);
    }

    public void getTileImage() {


        setup(0, "01water", true);
        setup(1, "02watercornerdl", false);
        setup(2, "03watercornerdr", false);
        setup(3, "04watercornerul", false);
        setup(4, "05watercornerur", false);
        setup(5, "06waterd", false);
        setup(6, "07wateru", false);
        setup(7, "08waterl", false);
        setup(8, "09waterr", false);
        setup(9, "0desert", false);
        setup(10, "10grass", false);
        setup(11, "11grass2", false);
        setup(12, "12grass3", false);
        setup(13, "13campsite1", false);
        setup(14, "13grass", false);
        setup(15, "14campsite2", false);
        setup(16, "15campsite3", false);
        setup(17, "16campsite4", false);
        setup(18, "17campsite", true);
        setup(19, "18rcdl", false);
        setup(20, "19rcdr", false);
        setup(21, "20rcul", false);
        setup(22, "21road2", false);
        setup(23, "22rcur", false);
        setup(24, "23road1", false);
        setup(25, "24road3", false);
        setup(26, "25roaddown", false);
        setup(27, "26roadup", false);
        setup(28, "27dooropened", false);
        setup(29, "28floor", false);
        setup(30, "29wall1", true);
        setup(31, "30wall2", true);
        setup(32, "31box", true);
        setup(33, "32barrel", true);
        setup(34, "33tire", true);
        setup(35, "34tree1", true);
        setup(36, "35tree2", true);
        setup(37, "36rock", true);
        setup(38, "37skulls", false);
        setup(39, "38skulls", false);
        setup(40, "39skulls", false);
        setup(41, "40skulls", false);
        setup(42, "41skulls", false);
        setup(43, "42skulls", false);
        setup(44, "43skulls", false);
        setup(45, "44skulls", false);
        setup(46, "45skulls", false);
        setup(47, "46canyon", true);
        setup(48, "47canyon", true);
        setup(49, "48canyon", true);
        setup(50, "49canyon", false);
        setup(51, "50canyon", false);
        setup(52, "51canyon", true);
        setup(53, "52rocks", false);
        setup(54, "53toxicvaste", false);
        setup(55, "54ladder", false);
        setup(56, "55cavefloor", false);
        setup(57, "56caveborderl", false);
        setup(58, "57caveborderr", false);
        setup(59, "58caveborderu", false);
        setup(60, "59caveborderd", false);
        setup(61, "60cavecorner", true);
        setup(62, "61cavecorner", true);
        setup(63, "62cavecorner", true);
        setup(64, "63cavecorner", true);
        setup(65, "64cavevoid", true);
        setup(66, "65cavewater", true);
        setup(67, "66cavewater", false);
        setup(68, "67cavewater", false);
        setup(69, "68cavewater", false);
        setup(70, "69cavewater", false);
        setup(71, "70cavewater", true);
        setup(72, "71cavewater", true);
        setup(73, "72cavewater", true);
        setup(74, "73cavewater", true);
        setup(75, "74cavewater", true);
        setup(76, "75cavewater", true);
        setup(77, "76bridge", false);
        setup(78, "77bridge", false);
        setup(79, "78wall", true);
        setup(80, "79ladderdown", false);
        setup(81, "80stalactite", true);
        setup(82, "81mushrooms", false);
        setup(83, "82greencrystals", false);
        setup(84, "83bluecrystals", false);
        setup(85, "84mushrooms", false);
        setup(86, "85rock", true);
        setup(87, "86rocks", true);
        setup(88, "87campfire", false);
        setup(89, "88campfire", false);
        setup(90, "89campfire", false);
        setup(91, "89campfire1", false);
        setup(92, "89campfire2", true);
        setup(93, "89ladderupright", false);
        setup(94, "89ladderupleft", false);
        setup(95, "907bunkerfence", true);
        setup(96, "908bunkerfence", true);
        setup(97, "909bunkerfence", true);
        setup(98, "910bunkerfence", true);
        setup(99, "911bunkerwall", true);
        setup(100, "911bunkerwater", true);
        setup(101, "912bunkerwall", true);
        setup(102, "912bunkerwaterhsu", true);
        setup(103, "913bunkerfloor", true);
        setup(104, "913bunkerwaterhsr", true);
        setup(105, "914bunkerfloor", true);
        setup(106, "914bunkerwatersh", true);
        setup(107, "915bunkerfloor", true);
        setup(108, "915bunkerwall", true);
        setup(109, "916bunkerfloor", true);
        setup(110, "916bunkerwall", true);
        setup(111, "917bunkerfence", true);
        setup(112, "917bunkerfloor", true);
        setup(113, "918bunkerfloor", true);
        setup(114, "94bunkerfloor", false);
        setup(115, "95bunkerfcl", true);
        setup(116, "96bunkerfcr", true);
        setup(117, "97bunkerfl", false);
        setup(118, "98bunkerfr", false);
        setup(119, "99bunkerwall", true);
        setup(120, "waf", false);
        setup(121, "waf2", false);
        setup(122, "wah", false);
        setup(123, "wak", true);
        setup(124, "wal", true);
        setup(125, "wall1", true);
        setup(126, "wall2", true);
        setup(127, "wall3", true);
        setup(128, "wall4", true);
        setup(129, "wb", true);
        setup(130, "wb2", true);
        setup(131, "wc", true);
        setup(132, "wc1", true);
        setup(133, "wc3", true);
        setup(134, "wh", true);
        setup(135, "wl", true);
        setup(136, "wr", false);
        setup(137, "wt", true);
        setup(138, "wt1", true);



    }

    public void setup(int index, String imageName, boolean collision) {

        UtilityTool uTool = new UtilityTool();

        try {
            tiles[index] = new Tiles();
            tiles[index].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/resources/tiles/" + imageName + ".png")));
            tiles[index].image = uTool.scaleImage(tiles[index].image, gp.tileSize, gp.tileSize);
            tiles[index].collision = collision;


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void loadMap(String filePath, int map) {
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
                    mapTileNum[map][col][row] = num;
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
            int tileNum = mapTileNum[gp.currentMap][worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            if (worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
                    worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
                    worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
                    worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {


                g2.drawImage(tiles[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
            }

                worldCol++;


                if (worldCol == gp.maxWorldCol) {
                    worldCol = 0;
                    worldRow++;


                }
            }
        if(drawPath){
            g2.setColor(new Color(255,0,0,70));

            for(int i = 0; i < gp.pFinder.pathList.size(); i ++){
                int worldX = gp.pFinder.pathList.get(i).col * gp.tileSize;
                int worldY = gp.pFinder.pathList.get(i).row * gp.tileSize;
                int screenX = worldX - gp.player.worldX + gp.player.screenX;
                int screenY = worldY - gp.player.worldY + gp.player.screenY;
                g2.fillRect(screenX,screenY,gp.tileSize,gp.tileSize);
            }
        }
        }
    }

