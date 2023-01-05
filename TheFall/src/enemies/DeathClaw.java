package enemies;

import entity.Entity;
import main.GamePanel;
import object.armor.OBJ_Armor_Metal;
import object.weapon.OBJ_Shotgun;

import java.util.Random;

public class DeathClaw extends Entity {

    GamePanel gp;


    public DeathClaw(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type =typeEnemy;
        name = "DeathClaw";

        defaultSpeed = 1;
        speed = defaultSpeed;
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
    public void update(){
        super.update();
        int xDistance = Math.abs(worldX - gp.player.worldX);
        int yDistance = Math.abs(worldY - gp.player.worldY);
        int tileDistance = (xDistance + yDistance)/gp.tileSize;

        if (!onPath && tileDistance < 5){
            int i = new Random().nextInt(100)+1;
            if(i > 50){
                onPath = true;
            }
            if (onPath && tileDistance > 20){
                onPath = false;
            }

        }
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
    public void playSE(){
        gp.playSE(16);

    }
    public  void setAction() {
        if (onPath) {
//            int goalCol = 49;
//            int goalRow = 63;
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
        direction = gp.player.direction;

    }
    public void checkDrop(){
        int i = new Random().nextInt(100)+1;

        //SET THE MONSTER DROP

        if (i <50){
            dropItem(new OBJ_Shotgun(gp));
        }
        if (i >=50 && i < 100){
            dropItem(new OBJ_Armor_Metal(gp));
        }
    

    }
}
