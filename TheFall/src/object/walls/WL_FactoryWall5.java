package object.walls;

import entity.Entity;
import main.GamePanel;

public class WL_FactoryWall5 extends Entity {
    GamePanel gp;
    public final static String objName = "FactoryWall5";

    public WL_FactoryWall5(GamePanel gp) {
        super(gp);
        this.gp = gp;
        name = objName;
        speed = 0;
        direction = "down";
        type = typeObstacle;

        collision = true;
        getImage();
        setAction();

        solidArea.x = 0;
        solidArea.y = 48;
        solidArea.width = gp.tileSize;
        solidArea.height = 12;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int height = (gp.tileSize*2)-24 ;
        int width = gp.tileSize;

        down1 = setup("tiles/wall/factorywall5", width, height);

    }

    public void setAction() {

    }

    public void update() {

    }
}
