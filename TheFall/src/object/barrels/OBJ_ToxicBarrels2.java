package object.barrels;

import entity.Entity;
import main.GamePanel;

public class OBJ_ToxicBarrels2 extends Entity {
    GamePanel gp;
    public final static String objName = "ToxicBarrels2";

    public OBJ_ToxicBarrels2(GamePanel gp) {
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
        solidArea.y = gp.tileSize-24;
        solidArea.width = gp.tileSize+12;
        solidArea.height = gp.tileSize;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int width = gp.tileSize +24;
        int height = gp.tileSize +24;

        down1 = setup("tiles/exterior/toxic_barrels2", width, height);


    }

    public void setAction() {

    }

    public void update() {

    }
}
