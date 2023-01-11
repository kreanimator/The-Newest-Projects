package object.walls;

import entity.Entity;
import main.GamePanel;

public class WL_RuinedWallBD extends Entity {
    GamePanel gp;
    public final static String objName = "RuinedWallBD";

    public WL_RuinedWallBD(GamePanel gp) {
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

        solidArea.x = 64;
        solidArea.y = 48;
        solidArea.width = gp.tileSize * 10;
        solidArea.height = 12;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int height = (gp.tileSize*2)-24 ;
        int width = (gp.tileSize * 11)+15;

        down1 = setup("tiles/wall/ruinedwallbd", width, height);

    }

    public void setAction() {

    }

    public void update() {

    }
}
