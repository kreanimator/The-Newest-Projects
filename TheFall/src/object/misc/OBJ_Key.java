package object.misc;

import entity.Entity;
import main.GamePanel;


public class OBJ_Key extends Entity {


    public OBJ_Key(GamePanel gp) {
        super(gp);
        type = typeConsumable;
        name = "Key";
        down1 = setup("objects/key",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\nA strange old key.";

    }
}
