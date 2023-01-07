package object.misc;

import entity.Entity;
import main.GamePanel;

public class OBJ_KeyCard extends Entity {

    GamePanel gp;
    public final static String objName = "Key Card";
    public OBJ_KeyCard(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = typeConsumable;
        name = objName;
        value = 1;
        down1 = setup("objects/keycard",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\nAn old bunker key card.";
        setDialogue();
    }
    public void setDialogue(){
        dialogues[0][0] =  "You use the " + name + "and opened a bunker!";
        dialogues [1][0] = "What the hell are you doing?";
    }
    public boolean use (Entity entity){
        int objectIndex = getDetected(entity, gp.obj, "Bunker Door");

        if (objectIndex != 999){
            startDialogue(this,0);
            gp.obj[gp.currentMap][objectIndex] = null;
            gp.playSE(6);
            return true;
        }else {
            startDialogue(this,1);
            return false;
        }

    }
}
