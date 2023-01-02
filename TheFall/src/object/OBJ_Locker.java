package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Locker extends Entity {




    public OBJ_Locker(GamePanel gp) {
        super(gp);
        name = "Locker";
        down1 = setup("tiles/locker",gp.tileSize,gp.tileSize);
        collision = true;

    }
}
