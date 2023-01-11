package object.exterior;

import entity.Entity;
import main.GamePanel;

public class OBJ_Fence3 extends Entity {

        GamePanel gp;
        public final static String objName = "Fence3";

    public OBJ_Fence3(GamePanel gp) {
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

            down1 = setup("tiles/exterior/fence3", width, height);

        }

        public void setAction() {

        }

        public void update() {

        }
    }

