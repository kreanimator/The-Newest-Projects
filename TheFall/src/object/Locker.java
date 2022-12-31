package object;

import entity.Entity;
import main.GamePanel;

public class Locker extends Entity {




    public Locker(GamePanel gp) {
        super(gp);
        name = "Locker";
        down1 = setup("tiles/locker",gp.tileSize,gp.tileSize);
        collision = true;

    }
}
