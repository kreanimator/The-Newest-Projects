package object.exterior;

import entity.Entity;
import main.GamePanel;

public class OBJ_GarbageTrunk extends Entity {


    public OBJ_GarbageTrunk(GamePanel gp) {
        super(gp);
        name = "GarbageTrunk";
        down1 = setup("objects/interactiveobjects/garbageTrunk",gp.tileSize,gp.tileSize);
        collision = true;

    }
}
