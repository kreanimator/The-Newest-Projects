package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Lockpick extends Entity {
    public OBJ_Lockpick(GamePanel gp) {
        super(gp);
        type = typeConsumable;
        name = "Lockpick";
        down1 = setup("objects/lockpick",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\nAllows to open one door";
    }
}
