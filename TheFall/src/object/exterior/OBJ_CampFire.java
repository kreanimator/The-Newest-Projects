package object.exterior;

import entity.Entity;
import main.GamePanel;

public class OBJ_CampFire extends Entity {
    GamePanel gp;
    public final static String objName = "Campfire";

    public OBJ_CampFire(GamePanel gp) {
        super(gp);
        this.gp = gp;
        name = objName;
        direction = "down";
        type = typeLight;
        lightRadius = 300;
        getImage();
        setAction();

        solidArea.x = 6;
        solidArea.y = 16;
        solidArea.width = 32;
        solidArea.height = 32;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {

        down1 = setup("objects/campfire/down1",gp.tileSize ,gp.tileSize );
        down2 = setup("objects/campfire/down2",gp.tileSize ,gp.tileSize );
        down3 = setup("objects/campfire/down3",gp.tileSize ,gp.tileSize );

    }
    public void setAction(){

    }
    public void update() {

        spriteCounter++;

        if (spriteCounter > 12) {
            if (spriteNumber == 1) {
                spriteNumber = 2;
            } else if (spriteNumber == 2) {
                spriteNumber = 3;
            } else if (spriteNumber ==3) {
                spriteNumber = 1;
            }
            spriteCounter = 0;

        }
    }
    }


