package object.exterior;

import entity.Entity;
import main.GamePanel;

public class OBJ_CampFire extends Entity {
    GamePanel gp;
    public final static String objName = "Campfire";

    public OBJ_CampFire(GamePanel gp) {
        super(gp);
        this.gp = gp;
        name = objName;
        speed = 0;
        direction = "down";
        type = typeObstacle;
        lightRadius = 300;
        collision = true;
        getImage();
        setAction();

        solidArea.x = 6;
        solidArea.y = 16;
        solidArea.width = 32;
        solidArea.height = 32;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {

        down1 = setup("objects/campfire/down1", gp.tileSize, gp.tileSize);
        down2 = setup("objects/campfire/down2", gp.tileSize, gp.tileSize);
        down3 = setup("objects/campfire/down3", gp.tileSize, gp.tileSize);
        up1 = setup("objects/campfire/down1", gp.tileSize, gp.tileSize);
        up2 = setup("objects/campfire/down2", gp.tileSize, gp.tileSize);
        up3 = setup("objects/campfire/down3", gp.tileSize, gp.tileSize);
        left1 = setup("objects/campfire/down1", gp.tileSize, gp.tileSize);
        left2 = setup("objects/campfire/down2", gp.tileSize, gp.tileSize);
        left3 = setup("objects/campfire/down3", gp.tileSize, gp.tileSize);
        right1 = setup("objects/campfire/down1", gp.tileSize, gp.tileSize);
        right2 = setup("objects/campfire/down2", gp.tileSize, gp.tileSize);
        right3 = setup("objects/campfire/down3", gp.tileSize, gp.tileSize);

    }

    public void setAction() {

    }

    public void update() {

    }
}


