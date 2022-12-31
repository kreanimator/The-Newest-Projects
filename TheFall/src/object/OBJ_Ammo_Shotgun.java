package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Ammo_Shotgun extends Entity {
    public OBJ_Ammo_Shotgun(GamePanel gp) {
        super(gp);
        type = typeConsumable;
        name = "Shotgun shell";
        down1 = setup("objects/shotgunShell",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\n12 mm shotgun ammo.";
    }
}
