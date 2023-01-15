package object.fridges;

import entity.Entity;
import main.GamePanel;

public class OBJ_Fridge4 extends Entity {
    GamePanel gp;
    public final static String objName = "Fridge4";

    public OBJ_Fridge4(GamePanel gp) {
        super(gp);
        this.gp = gp;
        name = objName;
        speed = 0;
        direction = "down";
        type = typeObstacle;

        collision = true;
        getImage();
        setAction();

        solidArea.x = 6;
        solidArea.y = 0;
        solidArea.width = gp.tileSize-12;
        solidArea.height = gp.tileSize;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int width = gp.tileSize;
        int height = gp.tileSize +24;

        down1 = setup("tiles/exterior/fridge4", width, height);

    }

    public void setAction() {

    }

    public void update() {

    }
}
