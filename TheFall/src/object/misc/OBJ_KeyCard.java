package object.misc;

import entity.Entity;
import main.GamePanel;

public class OBJ_KeyCard extends Entity {

    GamePanel gp;
    public OBJ_KeyCard(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = typeConsumable;
        name = "Key Card";
        value = 1;
        down1 = setup("objects/keycard",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\nAn old bunker key card.";
    }
    public boolean use (Entity entity){
        int objectIndex = getDetected(entity, gp.obj, "Locker");

        if (objectIndex != 999){
            gp.ui.currentDialogue = "You use the " + name + "and opened a bunker!";
            gp.obj[gp.currentMap][objectIndex] = null;
            gp.playSE(6);
            return true;
        }else {
            gp.ui.currentDialogue = "What the hell are you doing?";
            return false;
        }

    }
}
