package object;

import entity.Entity;
import main.GamePanel;

public class GarbageTrunk extends Entity {


    public GarbageTrunk(GamePanel gp) {
        super(gp);
        name = "GarbageTrunk";
        down1 = setup("objects/garbageTrunk",gp.tileSize,gp.tileSize);
        collision = true;

    }
}
