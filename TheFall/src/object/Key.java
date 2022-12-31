package object;

import entity.Entity;
import main.GamePanel;


public class Key extends Entity {


    public Key(GamePanel gp) {
        super(gp);
        type = typeConsumable;
        name = "Key";
        down1 = setup("objects/key",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\nA strange old key.";

    }
}
