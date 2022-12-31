package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Melee_Bat_normal extends Entity {
    public OBJ_Melee_Bat_normal(GamePanel gp) {
        super(gp);
        type = typeMelee;
        name = "Wooden Bat";
        down1 = setup("objects/bat",gp.tileSize,gp.tileSize);
        attackValue = 3;
        description = "[" + name + "]\nAttack value: " + attackValue + "\nAn ordinary baseball bat";
        attackArea.width = 36;
        attackArea.height = 36;
    }
}
