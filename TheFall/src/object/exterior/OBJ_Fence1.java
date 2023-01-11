package object.exterior;

import entity.Entity;
import main.GamePanel;

public class OBJ_Fence1 extends Entity {
    GamePanel gp;
    public final static String objName = "Fence1";

    public OBJ_Fence1(GamePanel gp) {
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
        solidArea.y = gp.tileSize;
        solidArea.width = gp.tileSize*2;
        solidArea.height = 6;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int width = gp.tileSize *2;
        int height = gp.tileSize + 24;

        down1 = setup("tiles/exterior/fence1", width, height);

    }

    public void setAction() {

    }

    public void update() {

    }
}
