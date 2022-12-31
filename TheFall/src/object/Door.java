package object;

import entity.Entity;
import main.GamePanel;


public class Door extends Entity {



    public Door(GamePanel gp) {
        super(gp);
        name = "Door";
        down1 = setup("objects/doorclosed", gp.tileSize,gp.tileSize);
        collision = true;
    }

}

