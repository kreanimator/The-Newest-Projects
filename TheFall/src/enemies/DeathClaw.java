package enemies;

import entity.Entity;
import main.GamePanel;

import java.util.Random;

public class DeathClaw extends Entity {

    GamePanel gp;


    public DeathClaw(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type =typeEnemy;
        name = "DeathClaw";
        speed = 1;
        maxHP = 20;
        life = maxHP;
        attack = 5;
        defense = 2;
        exp = 150;

        solidArea.x =3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        getImage();


    }
    public void getImage(){
        up1 = setup("enemies/deathclaw/up1",gp.tileSize -10,gp.tileSize -10);
        up2 = setup("enemies/deathclaw/up2",gp.tileSize -10,gp.tileSize -10);
        up3 = setup("enemies/deathclaw/up3",gp.tileSize -10,gp.tileSize -10);

        down1 = setup("enemies/deathclaw/down1",gp.tileSize -10,gp.tileSize -10);
        down2 = setup("enemies/deathclaw/down2",gp.tileSize -10,gp.tileSize -10);
        down3 = setup("enemies/deathclaw/down3",gp.tileSize -10,gp.tileSize -10);

        left1 = setup("enemies/deathclaw/left1",gp.tileSize -10,gp.tileSize -10);
        left2 = setup("enemies/deathclaw/left2",gp.tileSize -10,gp.tileSize -10);
        left3 = setup("enemies/deathclaw/left3",gp.tileSize -10,gp.tileSize -10);

        right1 = setup("enemies/deathclaw/right1",gp.tileSize -10,gp.tileSize -10);
        right2 = setup("enemies/deathclaw/right2",gp.tileSize -10,gp.tileSize -10);
        right3 = setup("enemies/deathclaw/right3",gp.tileSize -10,gp.tileSize -10);

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
