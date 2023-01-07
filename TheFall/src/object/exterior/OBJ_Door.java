package object.exterior;

import entity.Entity;
import main.GamePanel;


public class OBJ_Door extends Entity {

    GamePanel gp;
    public final static String objName = "Door";
    boolean opened = false;

    public OBJ_Door(GamePanel gp) {
        super(gp);

        type = typeObstacle;
        name = objName;
        image = setup("objects/interactiveobjects/doorclosed", gp.tileSize, gp.tileSize);
        image2 = setup("objects/interactiveobjects/dooropened", gp.tileSize, gp.tileSize);
        down1 = image;
        collision = true;
        this.gp = gp;
        solidArea.x = 0;
        solidArea.y = 16;
        solidArea.width = 48;
        solidArea.height = 32;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;


    }

    public void interact() {

        if (!opened) {
            gp.playSE(2);
            down1 = image2;
            opened = true;
            collision = false;
        }

    }

}

