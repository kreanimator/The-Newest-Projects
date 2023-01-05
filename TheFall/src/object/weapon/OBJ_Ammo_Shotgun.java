package object.weapon;

import entity.Entity;
import main.GamePanel;

public class OBJ_Ammo_Shotgun extends Entity {

    GamePanel gp;

    public OBJ_Ammo_Shotgun(GamePanel gp) {
        super(gp);
        price = 300;
        this.gp = gp;
        type = typeConsumable;
        stackable = true;
        name = "Shotgun shell";
        value = 6;
        down1 = setup("objects/shotgunShell",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\n12 mm shotgun ammo.";
    }

    public boolean use (Entity entity){
        gp.gameState = gp.dialogState;
        gp.ui.currentDialogue = "You used " + name + "\n You got " + value + " more shells.";
        entity.shotgunAmmo += value;
        if ( gp.player.shotgunAmmo > gp.player.maxAmmo){
            gp.player.shotgunAmmo = gp.player.maxAmmo;
        }
        gp.playSE(14);
        return true;

    }
}
