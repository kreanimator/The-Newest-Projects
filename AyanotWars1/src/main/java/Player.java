import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class Player extends Unit {

    private BufferedImage image;
    private final Point pos;

    private int experience;
    private static String playerClass = "";

    public static void setPlayerClass(String playerClass) {
        if (playerClass == "warrior") {
            Player.playerClass = "src/main/resources/images/warrior.png";
        } else if (playerClass == "warlock") {
            Player.playerClass = "src/main/resources/images/warlock.png";
        } else if (playerClass == "mage") {
            Player.playerClass = "src/main/resources/images/mage.png";
        }
    }

    public Player() {

        loadImage();

        pos = new Point(0, 0);
        experience = 0;
    }

    private void loadImage() {
        try {

            //            image = ImageIO.read(new File("images/warrior.png"));
            File playerImgFile = new File(playerClass);
            System.out.println("File IO is ok");
            image = ImageIO.read(playerImgFile);
            System.out.println("Image IO is OK");
        } catch (IOException exc) {
            System.out.println("Error opening image file: " + exc.getMessage());
        }
    }

    public void draw(Graphics g, ImageObserver observer) {

        g.drawImage(
                image,
                pos.x * CreateMap.TILE_SIZE,
                pos.y * CreateMap.TILE_SIZE,
                observer
        );
    }

    public void keyPressed(KeyEvent e, int[][] obstacles) {

        int key = e.getKeyCode();

        try {
            if (key == KeyEvent.VK_UP && obstacles[pos.x][pos.y - 1] != 2) {
                pos.translate(0, -1);
            }
        } catch (Exception nothingSpecial){

        }
        try {
            if (key == KeyEvent.VK_RIGHT && obstacles[pos.x + 1][pos.y] != 2) {
                pos.translate(1, 0);
            }
        } catch (Exception nothingSpecial){

        }
        try {
            if (key == KeyEvent.VK_DOWN && obstacles[pos.x][pos.y + 1] != 2) {
                pos.translate(0, 1);
            }
        } catch (Exception nothingSpecial){

        }
        try {
            if (key == KeyEvent.VK_LEFT && obstacles[pos.x - 1][pos.y] != 2) {
                pos.translate(-1, 0);
            }
        } catch (Exception nothingSpecial){

        }
    }

    public void tick() {

        if (pos.x < 0) {
            pos.x = 0;
        } else if (pos.x >= CreateMap.COLUMNS) {
            pos.x = CreateMap.COLUMNS - 1;
        }
        if (pos.y < 0) {
            pos.y = 0;
        } else if (pos.y >= CreateMap.ROWS) {
            pos.y = CreateMap.ROWS - 1;
        }
    }

    public String getExperience() {
        return String.valueOf(experience);
    }

    public void addExperience(int amount) {
        experience += amount;
    }

    public Point getPos() {
        return pos;
    }

}

