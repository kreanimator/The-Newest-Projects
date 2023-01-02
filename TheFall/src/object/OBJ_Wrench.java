package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Wrench extends Entity {
    public OBJ_Wrench(GamePanel gp) {
        super(gp);
        type = typeWrench;
        name = "Wrench";
        down1 = setup("objects/wrench",gp.tileSize,gp.tileSize);
        attackValue = 6;
        description = "[" + name + "]\nAttack value: " + attackValue + "\nOld rusty wrench.\n Can be very dangerous\n in skillful hands.";
        attackArea.width = 36;
        attackArea.height = 36;
    }


}
