package object.weapon;

import entity.Entity;
import main.GamePanel;

public class OBJ_Pistol extends Entity {
    public OBJ_Pistol(GamePanel gp) {
        super(gp);
        type = typePistol;
        name = "Pistol";
        down1 = setup("objects/pistol",gp.tileSize,gp.tileSize);
        attackValue = 5;
        description = "[" + name + "]\nAttack value: " + attackValue + "\nStandard 10mm pistol.";

        attackArea.width = 0;
        attackArea.height = 0;
    }
}
