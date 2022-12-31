package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Ammo_Pistol extends Entity {
    public OBJ_Ammo_Pistol(GamePanel gp) {
        super(gp);
        type = typeConsumable;
        name = "10 mm";
        down1 = setup("objects/10mm",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\n10 mm pistol ammo.";
    }
}
