package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Shotgun extends Entity {

    public OBJ_Shotgun(GamePanel gp) {
        super(gp);
        type = typeShotgun;
        name = "Shotgun";
        down1 = setup("objects/shotgun",gp.tileSize,gp.tileSize);
        image = setup("objects/shotgun",gp.tileSize,gp.tileSize);
        attackValue = 10;
        description = "[" + name + "]\nAttack value: " + attackValue + "\nOld good shotgun...";

        attackArea.width = 0;
        attackArea.height =0;
    }
}
