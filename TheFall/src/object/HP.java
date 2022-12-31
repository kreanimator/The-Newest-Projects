package object;

import entity.Entity;
import main.GamePanel;
import main.UtilityTool;

public class HP extends Entity {


    public HP(GamePanel gp) {
        super(gp);
        name = "HP";

        image = setup("hpbar/0",gp.tileSize-10,gp.tileSize-10);
        image2 = setup("hpbar/2",gp.tileSize-10,gp.tileSize-10);
        image3 = setup("hpbar/4",gp.tileSize-10,gp.tileSize-10);


    }
}

