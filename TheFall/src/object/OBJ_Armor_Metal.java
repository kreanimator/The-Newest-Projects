package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Armor_Metal extends Entity {
    public OBJ_Armor_Metal(GamePanel gp) {
        super(gp);
        type = typeArmor;
        name = "Metal armor";
        down1 = setup("objects/metalArmor",gp.tileSize,gp.tileSize);
        defenseValue = 5;
        description = "[" + name + "]\nDefense value: " + defenseValue + "\n Armor with high defense.";
    }
}
