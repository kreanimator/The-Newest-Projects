package enemies;

import entity.Entity;
import main.GamePanel;
import object.misc.OBJ_HPPack;
import object.misc.OBJ_Money;
import object.weapon.OBJ_Ammo_Pistol;
import object.weapon.OBJ_Ammo_Shotgun;

import java.util.Random;

public class Ghoul extends Entity {

    GamePanel gp;


    public Ghoul(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = typeEnemy;
        name = "Ghoul";

        defaultSpeed = 0;
        speed = defaultSpeed;
        maxHP = 10;
        life = maxHP;
        attack = 5;
        defense = 2;
        exp = 50;
        knockBackPower = 3;


        solidArea.x = 3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        getImage();



    }

    public void getImage() {
        up1 = setup("enemies/ghoul/up1", gp.tileSize , gp.tileSize );
        up2 = setup("enemies/ghoul/up2", gp.tileSize , gp.tileSize );
        up3 = setup("enemies/ghoul/up3", gp.tileSize , gp.tileSize );

        down1 = setup("enemies/ghoul/down1", gp.tileSize , gp.tileSize );
        down2 = setup("enemies/ghoul/down2", gp.tileSize , gp.tileSize );
        down3 = setup("enemies/ghoul/down3", gp.tileSize , gp.tileSize );

        left1 = setup("enemies/ghoul/left1", gp.tileSize , gp.tileSize );
        left2 = setup("enemies/ghoul/left2", gp.tileSize , gp.tileSize );
        left3 = setup("enemies/ghoul/left3", gp.tileSize , gp.tileSize );

        right1 = setup("enemies/ghoul/right1", gp.tileSize , gp.tileSize );
        right2 = setup("enemies/ghoul/right2", gp.tileSize , gp.tileSize );
        right3 = setup("enemies/ghoul/right3", gp.tileSize , gp.tileSize );

    }

    public void setAction() {

        if (onPath) {
            speed =1;
            if (gp.eManager.lighting.nightOn) {
                speed = 3;
            }
            //Check if stops chasing
            checkStopChasing(gp.player, 15, 100);

            //Search the direction
            searchPath(getGoalCol(gp.player), getGoalCRow(gp.player));

        }
        else {
            //Check if it starts chasing
            checkStartChasing(gp.player, 5, 50);

            if (gp.eManager.lighting.nightOn) {

                getRandomDirection();
                speed = 2;

            }
        }
    }

    public void damageReaction() {
        actionLockCounter = 0;
        direction = gp.player.direction;
    }
    public void playSE() {
        gp.playSE(21);
    }

    public void checkDrop() {
        int i = new Random().nextInt(100) + 1;

        //SET THE MONSTER DROP

        if (i < 25) {
            dropItem(new OBJ_Money(gp));
        }
        if (i >= 25 && i < 50) {
            dropItem(new OBJ_HPPack(gp));
        }
        if (i >= 50 && i < 75) {
            dropItem(new OBJ_Ammo_Pistol(gp));
        }
        if (i >= 75 && i < 100) {
            dropItem(new OBJ_Ammo_Shotgun(gp));
        }

    }
}

