package object.exterior;

import entity.Entity;
import main.GamePanel;

public class OBJ_FactoryDoor extends Entity {

    GamePanel gp;
    public final static String objName = "FactoryDoor";
    boolean opened = false;

    public OBJ_FactoryDoor(GamePanel gp) {
        super(gp);

        int height = (gp.tileSize*2)-24 ;
        int width = gp.tileSize;

        type = typeObstacle;
        name = objName;
        image = setup("objects/interactiveobjects/factorydoorclosed", width, height);
        image2 = setup("objects/interactiveobjects/factorydooropened", width ,height);
        down1 = image;
        collision = true;
        this.gp = gp;
        solidArea.x = 0;
        solidArea.y = 10;
        solidArea.width = 48;
        solidArea.height = 48;
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
