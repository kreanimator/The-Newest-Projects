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
        tiles = new Tiles[1000];
        mapTileNum = new int[gp.maxMap][gp.maxWorldCol][gp.maxWorldRow];
        getTileImage();
        loadMap("/resources/maps/world1.txt", 0);
        loadMap("/resources/maps/cave.txt", 1);
        loadMap("/resources/maps/bunker1.txt", 2);
        loadMap("/resources/maps/bunker2.txt", 3);
    }

    public void getTileImage() {

        int i = 0;
        //setup(i, "0000", false);i++;
        setup(0, "0001", false);i++;
        setup(1, "0002", false);i++;
        setup(2, "0003", false);i++;
        setup(3, "0004", false);i++;
        setup(4, "0005", false);i++;
        setup(5, "0006", false);i++;
        setup(6, "0007", false);i++;
        setup(7, "0008", false);i++;
        setup(8, "0009", false);i++;
        setup(9, "0010", false);i++;
        setup(10, "0011", false);i++;
        setup(11, "0012", false);i++;
        setup(12, "0013", false);i++;
        setup(13, "0014", false);i++;
        setup(14, "0015", false);i++;
        setup(15, "0016", false);i++;
        setup(16, "0017", false);i++;
        setup(17, "0018", false);i++;
        setup(18, "0019", false);i++;
        setup(19, "0020", false);i++;
        setup(20, "0021", false);i++;
        setup(21, "0022", false);i++;
        setup(22, "0023", false);i++;
        setup(23, "0024", false);i++;
        setup(24, "0025", false);i++;
        setup(25, "0026", false);i++;
        setup(26, "0027", false);i++;
        setup(27, "0028", false);i++;
        setup(28, "0029", false);i++;
        setup(29, "0030", false);i++;
        setup(30, "0031", false);i++;
        setup(31, "0032", false);i++;
        setup(32, "0033", false);i++;
        setup(33, "0034", false);i++;
        setup(34, "0035", false);i++;
        setup(35, "0036", false);i++;
        setup(36, "0037", false);i++;
        setup(37, "0038", false);i++;
        setup(38, "0039", false);i++;
        setup(39, "0040", false);i++;
        setup(40, "0041", false);i++;
        setup(41, "0042", false);i++;
        setup(42, "0043", false);i++;
        setup(43, "0044", false);i++;
        setup(44, "0045", false);i++;
        setup(45, "0046", false);i++;
        setup(46, "0047", false);i++;
        setup(47, "0048", false);i++;
        setup(48, "0049", false);i++;
        setup(49, "0050", false);i++;
        setup(50, "0051", false);i++;
        setup(51, "0052", false);i++;
        setup(52,"0053", false);i++;
        setup(53, "0054", false);i++;
        setup(54, "0055", true);i++;
        setup(55, "0056", false);i++;
        setup(56, "0057", false);i++;
        setup(57, "0058", false);i++;
        setup(58, "0059", false);i++;
        setup(59, "0060", false);i++;
        setup(60, "0061", false);i++;
        setup(61, "0062", false);i++;
        setup(62, "0063", false);i++;
        setup(63, "0064", false);i++;
        setup(64, "0065", false);i++;
        setup(65, "0066", false);i++;
        setup(66, "0067", false);i++;
        setup(67, "0068", false);i++;
        setup(68, "0069", false);i++;
        setup(69, "0070", false);i++;
        setup(70, "0071", false);i++;
        setup(71, "0072", false);i++;
        setup(72,"0073", false);i++;
        setup(73, "0074", false);i++;
        setup(74, "0075", false);i++;
        setup(75, "0076", false);i++;
        setup(76, "0077", false);i++;
        setup(77, "0078", false);i++;
        setup(78, "0079", false);i++;
        setup(79, "0080", false);i++;
        setup(80, "0081", false);i++;
        setup(81, "0082", false);i++;
        setup(82, "0083", false);i++;
        setup(83, "0084", false);i++;
        setup(84, "0085", false);i++;
        setup(85, "0086", false);i++;
        setup(86, "0087", false);i++;
        setup(87, "0088", false);i++;
        setup(88, "0089", false);i++;
        setup(89, "0090", false);i++;
        setup(90, "0091", false);i++;
        setup(91, "0092", false);i++;
        setup(92, "0093", false);i++;
        setup(93, "0094", false);i++;
        setup(94, "0095", false);i++;
        setup(95, "0096", false);i++;
        setup(96, "0097", false);i++;
        setup(97, "0098", false);i++;
        setup(98, "0099", false);i++;
        setup(99, "0100", false);i++;
        setup(100, "0101", false);i++;
        setup(101, "0102", false);i++;
        setup(102, "0103", false);i++;
        setup(103, "0104", false);i++;
        setup(104, "0105", false);i++;
        setup(105, "0106", false);i++;
        setup(106, "0107", false);i++;
        setup(107, "0108", false);i++;
        setup(108, "0109", false);i++;
        setup(109, "0110", false);i++;
        setup(110, "0111", false);i++;
        setup(111, "0112", false);i++;
        setup(112, "0113", false);i++;
        setup(113, "0114", false);i++;
        setup(114, "0115", false);i++;
        setup(115, "0116", false);i++;
        setup(116, "0117", false);i++;
        setup(117, "0118", false);i++;
        setup(118, "0119", false);i++;
        setup(119, "0120", false);i++;
        setup(120, "0121", false);i++;
        setup(121, "0122", false);i++;
        setup(122, "0123", false);i++;
        setup(123, "0124", false);i++;
        setup(124, "0125", false);i++;
        setup(125, "0126", false);i++;
        setup(126, "0127", false);i++;
        setup(127, "0128", false);i++;
        setup(128, "0129", false);i++;
        setup(129, "0130", false);i++;
        setup(130, "0131", false);i++;
        setup(131, "0132", false);i++;
        setup(132, "0133", false);i++;
        setup(133, "0134", false);i++;
        setup(134, "0135", false);i++;
        setup(135, "0136", false);i++;
        setup(136, "0137", false);i++;
        setup(137, "0138", false);i++;
        setup(138, "0139", false);i++;
        setup(139, "0140", false);i++;
        setup(140, "0141", false);i++;
        setup(141, "0142", false);i++;
        setup(142, "0143", false);i++;
        setup(143, "0144", false);i++;
        setup(144, "0145", false);i++;
        setup(145, "0146", false);i++;
        setup(146, "0147", false);i++;
        setup(147, "0148", false);i++;
        setup(148, "0149", false);i++;
        setup(149, "0150", false);i++;
        setup(150, "0151", false);i++;
        setup(151, "0152", false);i++;
        setup(152,"0153", false);i++;
        setup(153, "0154", false);i++;
        setup(154, "0155", false);i++;
        setup(155, "0156", false);i++;
        setup(156, "0157", false);i++;
        setup(157, "0158", false);i++;
        setup(158, "0159", false);i++;
        setup(159, "0160", false);i++;
        setup(160, "0161", false);i++;
        setup(161, "0162", false);i++;
        setup(162, "0163", false);i++;
        setup(163, "0164", false);i++;
        setup(164, "0165", false);i++;
        setup(165, "0166", false);i++;
        setup(166, "0167", false);i++;
        setup(167, "0168", false);i++;
        setup(168, "0169", false);i++;
        setup(169, "0170", false);i++;
        setup(170, "0171", false);i++;
        setup(171, "0172", false);i++;
        setup(172, "0173", false);i++;
        setup(173, "0174", true);i++;
        setup(174, "0175", true);i++;
        setup(175, "0176", false);i++;
        setup(176, "0177", false);i++;
        setup(177, "0178", false);i++;
        setup(178, "0179", false);i++;
        setup(179, "0180", false);i++;
        setup(180, "0181", false);i++;
        setup(181, "0182", false);i++;
        setup(182, "0183", true);i++;
        setup(183, "0184", true);i++;
        setup(184, "0185", false);i++;
        setup(185, "0186", false);i++;
        setup(186, "0187", false);i++;
        setup(187, "0188", false);i++;
        setup(188, "0189", false);i++;
        setup(189, "0190", false);i++;
        setup(190, "0191", false);i++;
        setup(191, "0192", false);i++;
        setup(192, "0193", false);i++;
        setup(193, "0194", false);i++;
        setup(194, "0195", false);i++;
        setup(195, "0196", false);i++;
        setup(196, "0197", false);i++;
        setup(197, "0198", false);i++;
        setup(198, "0199", false);i++;
        setup(199, "0200", false);i++;
        setup(200, "0201", false);i++;
        setup(201, "0202", false);i++;
        setup(202, "0203", false);i++;
        setup(203, "0204", false);i++;
        setup(204, "0205", false);i++;
        setup(205, "0206", false);i++;
        setup(206, "0207", false);i++;
        setup(207, "0208", false);i++;
        setup(208, "0209", true);i++;
        setup(209, "0210", true);i++;
        setup(210, "0211", true);i++;
        setup(211, "0212", true);i++;
        setup(212, "0213", true);i++;
        setup(213, "0214", true);i++;
        setup(214, "0215", true);i++;
        setup(215, "0216", true);i++;
        setup(216, "0217", false);i++;
        setup(217, "0218", false);i++;
        setup(218, "0219", false);i++;
        setup(219, "0220", true);i++;
        setup(220, "0221", false);i++;
        setup(221, "0222", false);i++;
        setup(222, "0223", false);i++;
        setup(223, "0224", false);i++;
        setup(224, "0225", true);i++;
        setup(225, "0226", false);i++;
        setup(226, "0227", false);i++;
        setup(227, "0228", false);i++;
        setup(228, "0229", false);i++;
        setup(229, "0230", false);i++;
        setup(230, "0231", false);i++;
        setup(231, "0232", false);i++;
        setup(232, "0233", false);i++;
        setup(233, "0234", false);i++;
        setup(234, "0235", false);i++;
        setup(235, "0236", false);i++;
        setup(236, "0237", false);i++;
        setup(237, "0238", false);i++;
        setup(238, "0239", false);i++;
        setup(239, "0240", false);i++;
        setup(240, "0241", true);i++;
        setup(241, "0242", false);i++;
        setup(242, "0243", false);i++;
        setup(243, "0244", false);i++;
        setup(244, "0245", false);i++;
        setup(245, "0246", false);i++;
        setup(246, "0247", false);i++;
        setup(247, "0248", false);i++;
        setup(248, "0249", false);i++;
        setup(249, "0250", false);i++;
        setup(250, "0251", false);i++;
        setup(251, "0252", false);i++;
        setup(252, "0253", false);i++;
        setup(253, "0254", false);i++;
        setup(254, "0255", false);i++;
        setup(255, "0256", false);i++;
        setup(256, "0257", false);i++;
        setup(257, "0258", false);i++;
        setup(258, "0259", false);i++;
        setup(259, "0260", false);i++;
        setup(260, "0261", false);i++;
        setup(261, "0262", false);i++;
        setup(262, "0263", false);i++;
        setup(263, "0264", false);i++;
        setup(264, "0265", false);i++;
        setup(265, "0266", false);i++;
        setup(266, "0267", false);i++;
        setup(267, "0268", false);i++;
        setup(268, "0269", false);i++;
        setup(269, "0270", false);i++;
        setup(270, "0271", false);i++;
        setup(271, "0272", false);i++;
        setup(272, "0273", false);i++;
        setup(273, "0274", false);i++;
        setup(274, "0275", false);i++;
        setup(275, "0276", false);i++;
        setup(276, "0277", false);i++;
        setup(277, "0278", false);i++;
        setup(278, "0279", false);i++;
        setup(279, "0280", false);i++;
        setup(280, "0281", false);i++;
        setup(281, "0282", false);i++;
        setup(282, "0283", false);i++;
        setup(283, "0284", false);i++;
        setup(284, "0285", false);i++;
        setup(285, "0286", false);i++;
        setup(286, "0287", false);i++;
        setup(287, "0288", false);i++;
        setup(288, "0289", false);i++;
        setup(289, "0290", false);i++;
        setup(290, "0291", false);i++;
        setup(291, "0292", false);i++;
        setup(292, "0293", false);i++;
        setup(293, "0294", false);i++;
        setup(294, "0295", false);i++;
        setup(295, "0296", false);i++;
        setup(296, "0297", false);i++;
        setup(297, "0298", false);i++;
        setup(298, "0299", false);i++;
        setup(299, "0300", false);i++;
        setup(300, "0301", false);i++;
        setup(301, "0302", false);i++;
        setup(302, "0303", false);i++;
        setup(303, "0304", false);i++;
        setup(304, "0305", false);i++;
        setup(305, "0306", false);i++;
        setup(306, "0307", false);i++;
        setup(307, "0308", false);i++;
        setup(308, "0309", false);i++;
        setup(309, "0310", false);i++;
        setup(310, "0311", false);
        setup(311, "0312", false);
        setup(312, "0313", false);
        setup(313, "0314", false);
        setup(314, "0315", false);
        setup(315, "0316", false);
        setup(316, "0317", false);
        setup(317, "0318", false);
        //setup(i, "0316", false);i++;





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

