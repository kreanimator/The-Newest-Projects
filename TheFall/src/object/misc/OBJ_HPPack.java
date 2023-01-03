package object.misc;

import entity.Entity;
import main.GamePanel;

public class OBJ_HPPack extends Entity {
    GamePanel gp;


    public OBJ_HPPack(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = typeConsumable;
        name = "HP Pack";
        value = 5;
        down1 = setup("objects/hppack",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\nRestores some amount of HP.";
    }
    public void use (Entity entity){
        gp.gameState = gp.dialogState;
        gp.ui.currentDialogue = "You used" + name + "\nYou restored " + value + " HP.";
        entity.life += value;

        gp.playSE(11);

    }
}
