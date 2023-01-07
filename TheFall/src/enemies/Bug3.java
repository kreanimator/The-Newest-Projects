package enemies;

import entity.Entity;
import main.GamePanel;
import object.misc.OBJ_HPPack;
import object.misc.OBJ_Money;

import java.util.Random;

public class Bug3 extends Entity {
    GamePanel gp;
    public Bug3(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = typeEnemy;
        name = "Yellow bug";

        defaultSpeed = 1;
        speed = defaultSpeed;
        maxHP = 4;
        life = maxHP;
        attack = 5;
        defense = 0;
        exp = 10;

        solidArea.x = 3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        getImage();



    }

    public void getImage() {
        up1 = setup("enemies/bug3/up1", gp.tileSize - 10, gp.tileSize - 10);
        up2 = setup("enemies/bug3/up2", gp.tileSize - 10, gp.tileSize - 10);
        up3 = setup("enemies/bug3/up3", gp.tileSize - 10, gp.tileSize - 10);

        down1 = setup("enemies/bug3/down1", gp.tileSize - 10, gp.tileSize - 10);
        down2 = setup("enemies/bug3/down3", gp.tileSize - 10, gp.tileSize - 10);
        down3 = setup("enemies/bug3/down2", gp.tileSize - 10, gp.tileSize - 10);

        left1 = setup("enemies/bug3/left1", gp.tileSize - 10, gp.tileSize - 10);
        left2 = setup("enemies/bug3/left2", gp.tileSize - 10, gp.tileSize - 10);
        left3 = setup("enemies/bug3/left3", gp.tileSize - 10, gp.tileSize - 10);

        right1 = setup("enemies/bug3/right1", gp.tileSize - 10, gp.tileSize - 10);
        right2 = setup("enemies/bug3/right2", gp.tileSize - 10, gp.tileSize - 10);
        right3 = setup("enemies/bug3/right3", gp.tileSize - 10, gp.tileSize - 10);

    }

    public void setAction() {

        if (onPath) {
            //Search the direction
            searchPath(getGoalCol(gp.player), getGoalCRow(gp.player));
            //Check stop chasing
            checkStopChasing(gp.player, 15, 100);
        } else {
            getRandomDirection();
        }
    }

    public void damageReaction() {
        actionLockCounter = 0;
        onPath = true;
    }

    public void playSE() {
        gp.playSE(5);

    }

    public void checkDrop() {
        int i = new Random().nextInt(100) + 1;

        //SET THE MONSTER DROP

        if (i < 50) {
            dropItem(new OBJ_Money(gp));
        }
        if (i >= 50 && i < 100) {
            dropItem(new OBJ_HPPack(gp));
        }

    }
}
