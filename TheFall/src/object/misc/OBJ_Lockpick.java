package object.misc;

import entity.Entity;
import main.GamePanel;

public class OBJ_Lockpick extends Entity {
    GamePanel gp;
    public OBJ_Lockpick(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = typeConsumable;
        price = 1000;
        name = "Lockpick";
        value = 1;
        stackable = true;
        down1 = setup("objects/lockpick",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\nAllows to open one door";
    }
    public boolean use (Entity entity){
        int objectIndex = getDetected(entity, gp.obj, "Locker");

        if (objectIndex != 999){
            gp.ui.currentDialogue = "You use the " + name + "and opened a door!";
            gp.obj[gp.currentMap][objectIndex] = null;
            gp.playSE(6);
            return true;
        }else {
            gp.ui.currentDialogue = "What the hell are you doing?";
            return false;
        }

    }
}
