package object.exterior;

import entity.Entity;
import main.GamePanel;

public class OBJ_Fenceside1 extends Entity {
    GamePanel gp;
    public final static String objName = "Fenceside1";

    public OBJ_Fenceside1(GamePanel gp) {
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

        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 6;
        solidArea.height = gp.tileSize*2;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int height = gp.tileSize*2;
        int width = 4;

        down1 = setup("tiles/exterior/fence_side", width, height);

    }

    public void setAction() {

    }

    public void update() {

    }
}
