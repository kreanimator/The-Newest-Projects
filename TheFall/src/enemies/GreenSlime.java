package enemies;

import entity.Entity;
import main.GamePanel;
import object.misc.OBJ_Coins;
import object.misc.OBJ_HPPack;

import java.util.Random;

public class GreenSlime extends Entity {

    GamePanel gp;


    public GreenSlime(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type =typeEnemy;
        name = "Green Slime";

        defaultSpeed = 1;
        speed = defaultSpeed;
        maxHP = 4;
        life = maxHP;
        attack = 5;
        defense = 0;
        exp = 10;

        solidArea.x =3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        getImage();


    }
    public void getImage(){
        up1 = setup("enemies/slime/1",gp.tileSize -10,gp.tileSize -10);
        up2 = setup("enemies/slime/2",gp.tileSize -10,gp.tileSize -10);
        up3 = setup("enemies/slime/3",gp.tileSize -10,gp.tileSize -10);

        down1 = setup("enemies/slime/1",gp.tileSize -10,gp.tileSize -10);
        down2 = setup("enemies/slime/2",gp.tileSize -10,gp.tileSize -10);
        down3 = setup("enemies/slime/3",gp.tileSize -10,gp.tileSize -10);

        left1 = setup("enemies/slime/1",gp.tileSize -10,gp.tileSize -10);
        left2 = setup("enemies/slime/2",gp.tileSize -10,gp.tileSize -10);
        left3 = setup("enemies/slime/3",gp.tileSize -10,gp.tileSize -10);

        right1 = setup("enemies/slime/1",gp.tileSize -10,gp.tileSize -10);
        right2 = setup("enemies/slime/2",gp.tileSize -10,gp.tileSize -10);
        right3 = setup("enemies/slime/3",gp.tileSize -10,gp.tileSize -10);

    }
    public  void setAction() {
        if (onPath) {

            int goalCol = (gp.player.worldX + gp.player.solidArea.x)/gp.tileSize;
            int goalRow = (gp.player.worldY + gp.player.solidArea.y)/gp.tileSize;
            searchPath(goalCol,goalRow);

        } else {
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
    }
    public void damageReaction(){
        actionLockCounter = 0;
        onPath = true;

    }
    public void playSE(){
        gp.playSE(5);

    }
    public void checkDrop(){
        int i = new Random().nextInt(100)+1;

        //SET THE MONSTER DROP

        if (i <50){
            dropItem(new OBJ_Coins(gp));
        }
        if (i >=50 && i < 100){
            dropItem(new OBJ_HPPack(gp));
        }

    }
}
