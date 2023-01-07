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
        type = typeEnemy;
        name = "DeathClaw";

        defaultSpeed = 2;
        speed = defaultSpeed;
        maxHP = 30;
        life = maxHP;
        attack = 6;
        defense = 4;
        exp = 150;

        solidArea.x = 3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

        attackArea.width = 48;
        attackArea.height = 48;
        motion1Duration = 10;
        motion2Duration = 30;
        motion3Duration = 50;
        getImage();



    }

    public void update() {
        super.update();

    }

    public void getImage() {
        up1 = setup("enemies/deathclaw/up1", gp.tileSize , gp.tileSize );
        up2 = setup("enemies/deathclaw/up2", gp.tileSize , gp.tileSize );
        up3 = setup("enemies/deathclaw/up3", gp.tileSize , gp.tileSize );

        down1 = setup("enemies/deathclaw/down1", gp.tileSize , gp.tileSize );
        down2 = setup("enemies/deathclaw/down2", gp.tileSize , gp.tileSize );
        down3 = setup("enemies/deathclaw/down3", gp.tileSize , gp.tileSize );

        left1 = setup("enemies/deathclaw/left1", gp.tileSize , gp.tileSize );
        left2 = setup("enemies/deathclaw/left2", gp.tileSize , gp.tileSize );
        left3 = setup("enemies/deathclaw/left3", gp.tileSize , gp.tileSize );

        right1 = setup("enemies/deathclaw/right1", gp.tileSize , gp.tileSize );
        right2 = setup("enemies/deathclaw/right2", gp.tileSize , gp.tileSize );
        right3 = setup("enemies/deathclaw/right3", gp.tileSize , gp.tileSize );

    }

    public void playSE() {
        gp.playSE(16);

    }

    public void setAction() {

        if (onPath) {
            //Check if stops chasing
            checkStopChasing(gp.player, 15, 2);
            //Search the direction
            searchPath(getGoalCol(gp.player), getGoalCRow(gp.player));

        } else {
            //Check if it starts chasing
            checkStartChasing(gp.player, 10, 100);
            speed = 4;

            getRandomDirection();
        }
    }

    public void damageReaction() {
        actionLockCounter = 0;
        direction = gp.player.direction;

    }

    public void checkDrop() {
        int i = new Random().nextInt(100) + 1;

        //SET THE MONSTER DROP

        if (i < 50) {
            dropItem(new OBJ_Shotgun(gp));
        }
        if (i >= 50 && i < 100) {
            dropItem(new OBJ_Armor_Metal(gp));
        }


    }
}
