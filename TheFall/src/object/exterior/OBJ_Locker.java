package object.exterior;

import entity.Entity;
import main.GamePanel;

public class OBJ_Locker extends Entity {

        GamePanel gp;
        Entity loot;
        boolean opened = false;


    public OBJ_Locker(GamePanel gp, Entity loot) {
        super(gp);
        this.gp = gp;
        this.loot = loot;
        type = typeObstacle;
        name = "Locker";
        image = setup("objects/interactiveobjects/locker",gp.tileSize,gp.tileSize);
        image2 = setup("objects/interactiveobjects/lockeropened",gp.tileSize,gp.tileSize);
        down1 = image;
        collision = true;
        solidArea.x = 0;
        solidArea.y = 16;
        solidArea.width = 48;
        solidArea.height = 32;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;


    }

    public void interact(){

        gp.gameState = gp.dialogState;
        gp.ui.currentDialogue = "You need a key to open this!";
        if(!opened){
            gp.playSE(6);
            StringBuilder sb = new StringBuilder();
            sb.append("You opened a locker and find a ").append(loot.name).append("!");
            if(!gp.player.canObtainItem(loot)){
                sb.append("You cannot carry any more....");
            }
            else {

                down1 = image2;
                opened = true;
            }
            gp.ui.currentDialogue = sb.toString();
        }
        else {
            gp.ui.currentDialogue = "It's empty! ";
        }
    }
}
