package entity;

import main.GamePanel;
import object.armor.OBJ_Armor_Metal;
import object.misc.OBJ_HPPack;
import object.weapon.OBJ_Ammo_Pistol;
import object.weapon.OBJ_Ammo_Shotgun;
import object.weapon.OBJ_Pistol;
import object.weapon.OBJ_Shotgun;

import java.util.Random;

public class NPC_Ghoul extends Entity{
    public NPC_Ghoul(GamePanel gp) {
        super(gp);
        direction = "down";
        getImage();
        setDialogue();
        setItems();

        solidArea.x = 6;
        solidArea.y = 16;
        solidArea.width = 32;
        solidArea.height = 32;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }
    public void getImage() {
        up1 = setup("npc/oldghoul/down1",gp.tileSize ,gp.tileSize );
        up2= setup("npc/oldghoul/down2",gp.tileSize ,gp.tileSize );
        up3 = setup("npc/oldghoul/down3",gp.tileSize ,gp.tileSize );
        down1 = setup("npc/oldghoul/down1",gp.tileSize ,gp.tileSize );
        down2 = setup("npc/oldghoul/down2",gp.tileSize ,gp.tileSize );
        down3 = setup("npc/oldghoul/down3",gp.tileSize ,gp.tileSize );
        left1 = setup("npc/oldghoul/left1",gp.tileSize ,gp.tileSize );
        left2 = setup("npc/oldghoul/left2",gp.tileSize ,gp.tileSize );
        left3 = setup("npc/oldghoul/left3",gp.tileSize ,gp.tileSize );
        right1 = setup("npc/oldghoul/right1",gp.tileSize ,gp.tileSize );
        right2 = setup("npc/oldghoul/right2",gp.tileSize ,gp.tileSize );
        right3 = setup("npc/oldghoul/right3",gp.tileSize ,gp.tileSize );
    }

    public void setAction() {
//
//        actionLockCounter++;
//        if (actionLockCounter == 120) {
//            Random random = new Random();
//            int i = random.nextInt(100) + 1; // pick up a number from 1 to 100
//
//            if (i <= 25) {
//                direction = "up";
//            }
//            if (i > 25 && i <= 50) {
//                direction = "down";
//            }
//            if (i > 50 && i <= 75) {
//                direction = "left";
//            }
//            if (i > 75) {
//                direction = "right";
//            }
//            actionLockCounter =0;
//        }
    }
    public void setDialogue(){
        dialogues[0] = " Please don't hit me! I know I can look ugly, but I'm not dangerous, " +
                "I just live here...\nI am a ghoul... Old ghoul named Daniel....\nI have some items for sale if you wish." +
                "\nSometimes I steal some stuff from these punks... hehehe...";


    }
    public void speak(){
        super.speak();
        gp.gameState = gp.tradeState;
        gp.ui.npc = this;
    }
    public void setItems(){
        inventory.add(new OBJ_HPPack(gp));
        inventory.add(new OBJ_HPPack(gp));
        inventory.add(new OBJ_Ammo_Pistol(gp));
        inventory.add(new OBJ_Ammo_Pistol(gp));
        inventory.add(new OBJ_Ammo_Shotgun(gp));
        inventory.add(new OBJ_Ammo_Shotgun(gp));
        inventory.add(new OBJ_Pistol(gp));
        inventory.add(new OBJ_Shotgun(gp));
        inventory.add(new OBJ_Armor_Metal(gp));
    }
}

