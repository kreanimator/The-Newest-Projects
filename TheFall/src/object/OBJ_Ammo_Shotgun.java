package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Ammo_Shotgun extends Entity {

    GamePanel gp;

    public OBJ_Ammo_Shotgun(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = typeConsumable;
        name = "Shotgun shell";
        value = 6;
        down1 = setup("objects/shotgunShell",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\n12 mm shotgun ammo.";
    }

    public void use (Entity entity){
        gp.gameState = gp.dialogState;
        gp.ui.currentDialogue = "You used " + name + "\n You got " + value + " more shells.";
        entity.shotgunAmmo += value;
        if ( gp.player.shotgunAmmo > gp.player.maxAmmo){
            gp.player.shotgunAmmo = gp.player.maxAmmo;
        }
        gp.playSE(14);

    }
}
