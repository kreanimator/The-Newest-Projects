package enemies;

import entity.Entity;
import main.GamePanel;

import java.util.Random;

public class Punk extends Entity {
    GamePanel gp;


    public Punk(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type =typeEnemy;
        name = "Punk";
        speed = 1;
        maxHP = 6;
        life = maxHP;
        attack = 5;
        defense = 2;
        exp = 15;

        solidArea.x =3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        getImage();


    }
    public void getImage(){
        up1 = setup("enemies/punk/up1",gp.tileSize -10,gp.tileSize -10);
        up2 = setup("enemies/punk/up2",gp.tileSize -10,gp.tileSize -10);
        up3 = setup("enemies/punk/up3",gp.tileSize -10,gp.tileSize -10);

        down1 = setup("enemies/punk/down1",gp.tileSize -10,gp.tileSize -10);
        down2 = setup("enemies/punk/down2",gp.tileSize -10,gp.tileSize -10);
        down3 = setup("enemies/punk/down3",gp.tileSize -10,gp.tileSize -10);

        left1 = setup("enemies/punk/left1",gp.tileSize -10,gp.tileSize -10);
        left2 = setup("enemies/punk/left2",gp.tileSize -10,gp.tileSize -10);
        left3 = setup("enemies/punk/left3",gp.tileSize -10,gp.tileSize -10);

        right1 = setup("enemies/punk/right1",gp.tileSize -10,gp.tileSize -10);
        right2 = setup("enemies/punk/right2",gp.tileSize -10,gp.tileSize -10);
        right3 = setup("enemies/punk/right3",gp.tileSize -10,gp.tileSize -10);

    }
    public  void setAction() {
        actionLockCounter++;
        if (actionLockCounter == 120) {
            Random random = new Random();
            int i = random.nextInt(100) + 1; // pick up a number from 1 to 100

            if (i <= 25) {
                direction = "up";
            }
            if (i > 25 && i <= 50) {
                direction = "down";
            }
            if (i > 50 && i <= 75) {
                direction = "left";
            }
            if (i > 75) {
                direction = "right";
            }
            actionLockCounter = 0;
        }
    }
    public void damageReaction(){
        actionLockCounter = 0;
        direction = gp.player.direction;

    }
}
