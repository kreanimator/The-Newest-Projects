package entity;

import main.GamePanel;


import java.awt.*;


public class NPC_Patient extends Entity{

    public final static String npcName = "Null Patient";

    public NPC_Patient(GamePanel gp) {
        super(gp);
        name = npcName;
        direction = "down";
        defaultSpeed = 0;
        speed = defaultSpeed;
        solidArea = new Rectangle();
        solidArea.x = 2;
        solidArea.y = 6;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 44;
        solidArea.height = 40;

        dialogueSet = -1;
        getImage();
        setDialogue();
    }

    public void getImage() {
//        up1 = setup("objects/interactiveobjects/movablerock", gp.tileSize, gp.tileSize);
//        up2 = setup("objects/interactiveobjects/movablerock", gp.tileSize, gp.tileSize);
//        up3 = setup("objects/interactiveobjects/movablerock", gp.tileSize, gp.tileSize);
        down1 = setup("npc/patient/down1", gp.tileSize, gp.tileSize);
        down2 = setup("npc/patient/down2", gp.tileSize, gp.tileSize);
        down3 = setup("npc/patient/down3", gp.tileSize, gp.tileSize);
//        left1 = setup("objects/interactiveobjects/movablerock", gp.tileSize, gp.tileSize);
//        left2 = setup("objects/interactiveobjects/movablerock", gp.tileSize, gp.tileSize);
//        left3 = setup("objects/interactiveobjects/movablerock", gp.tileSize, gp.tileSize);
//        right1 = setup("objects/interactiveobjects/movablerock", gp.tileSize, gp.tileSize);
//        right2 = setup("objects/interactiveobjects/movablerock", gp.tileSize, gp.tileSize);
//        right3 = setup("objects/interactiveobjects/movablerock", gp.tileSize, gp.tileSize);
    }

    public void setAction() {

    }

    public void setDialogue() {
        dialogues[0][0] = "Please....Kill me... I'm begging you....";

    }


    public void speak() {
        //
        // npcReactionToAction();
        startDialogue(this, dialogueSet);
        dialogueSet++;
        if(dialogues[dialogueSet][0] ==null){
//            dialogueSet = 0;
            dialogueSet--;
        }
    }
}