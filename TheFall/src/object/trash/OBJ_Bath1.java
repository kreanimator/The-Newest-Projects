package object.trash;

import entity.Entity;
import main.GamePanel;

public class OBJ_Bath1 extends Entity {
    GamePanel gp;
    public final static String objName = "Bath1";

    public OBJ_Bath1(GamePanel gp) {
        super(gp);
        this.gp = gp;
        name = objName;
        speed = 0;
        direction = "down";
        type = typeObstacle;

        collision = true;
        getImage();
        setAction();

        solidArea.x = 12;
        solidArea.y = 24;
        solidArea.width = gp.tileSize +24;
        solidArea.height = gp.tileSize-18;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int width = gp.tileSize *2;
        int height = gp.tileSize +24;

        down1 = setup("tiles/exterior/bath1", width, height);

    }

    public void setAction() {

    }

    public void update() {

    }
}
