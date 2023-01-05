package object.misc;

import entity.Entity;
import main.GamePanel;


public class OBJ_Key extends Entity {
    GamePanel gp;


    public OBJ_Key(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = typeConsumable;
        price = 1000;
        name = "Key";
        stackable = true;
        down1 = setup("objects/key",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\nA strange old key.";

    }
    public boolean use (Entity entity){
//     int objectIndex = getDetected(entity, gp.obj, "Locker");
//
//     if (objectIndex != 999){
//         gp.ui.currentDialogue = "You use the " + name + "and opened a locker!";
//         gp.obj[gp.currentMap][objectIndex] = null;
//         gp.playSE(6);
//         return true;
//     }else {
//         gp.ui.currentDialogue = "What the hell are you doing?";
//         return false;
//     }
return false;
    }
}
