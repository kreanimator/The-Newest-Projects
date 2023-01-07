package object.exterior;

import entity.Entity;
import main.GamePanel;

public class OBJ_GarbageTrunk extends Entity {

        GamePanel gp;
    public final static String objName = "GarbageTrunk";

    public OBJ_GarbageTrunk(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = typeObstacle;
        name = objName;
        image = setup("objects/interactiveobjects/garbageTrunk",gp.tileSize,gp.tileSize);
        image2 = setup("objects/interactiveobjects/garbageTrunkopened",gp.tileSize,gp.tileSize);
        down1 = image;
        collision = true;
        solidArea.x = 0;
        solidArea.y = 16;
        solidArea.width = 48;
        solidArea.height = 32;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;


    }
    public void setLoot(Entity loot) {
        this.loot = loot;
    }

    public void interact(){
        gp.gameState = gp.dialogState;
        if(!opened){
            gp.playSE(6);
            StringBuilder sb = new StringBuilder();
            sb.append("You opened a locker and find a ").append(loot.name).append("!");
            if(!gp.player.canObtainItem(loot)){
                sb.append("You cannot carry any more....");
            }
            else {

                down1 = image2;
            }
                gp.ui.currentDialogue = sb.toString();
            }
            else {
                gp.ui.currentDialogue = "It's empty! ";
            }
        }
    }

