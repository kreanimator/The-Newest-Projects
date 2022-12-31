package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_HPPack extends Entity {
    public OBJ_HPPack(GamePanel gp) {
        super(gp);
        type = typeConsumable;
        name = "HP Pack";
        down1 = setup("objects/hppack",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\nRestores some amount of HP.";
    }
}
