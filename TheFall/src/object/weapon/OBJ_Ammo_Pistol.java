package object.weapon;

import entity.Entity;
import main.GamePanel;

public class OBJ_Ammo_Pistol extends Entity {
    GamePanel gp;

    public OBJ_Ammo_Pistol(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = typeConsumable;
        price = 200;
        stackable = true;
        name = "10 mm";
        value = 10;
        down1 = setup("objects/10mm",gp.tileSize,gp.tileSize);
        image = setup("objects/10mm",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\n10 mm pistol ammo.";


    }
    public boolean use (Entity entity){
        gp.gameState = gp.dialogState;
        gp.ui.currentDialogue = "You used " + name + "\n You got " + value + " more bullets.";
        entity.pistolAmmo += value;

        gp.playSE(10);
        return true;

    }
}
