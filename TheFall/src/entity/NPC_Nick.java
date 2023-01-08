package entity;

import main.GamePanel;

public class NPC_Nick extends Entity {
    boolean questStarted = false;
    boolean finishedPath = true;
    public static final String npcName = "Nick";

    public NPC_Nick(GamePanel gp) {
        super(gp);
        direction = "down";
        name = npcName;
        speed = defaultSpeed;
        solidArea.x = 6;
        solidArea.y = 16;
        solidArea.width = 32;
        solidArea.height = 32;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        dialogueSet = -1;
        getImage();
        setDialogue();
    }

    public void getImage() {
        up1 = setup("npc/nick/up1", gp.tileSize, gp.tileSize);
        up2 = setup("npc/nick/up2", gp.tileSize, gp.tileSize);
        up3 = setup("npc/nick/up3", gp.tileSize, gp.tileSize);
        down1 = setup("npc/nick/down1", gp.tileSize, gp.tileSize);
        down2 = setup("npc/nick/down2", gp.tileSize, gp.tileSize);
        down3 = setup("npc/nick/down3", gp.tileSize, gp.tileSize);
        left1 = setup("npc/nick/left1", gp.tileSize, gp.tileSize);
        left2 = setup("npc/nick/left2", gp.tileSize, gp.tileSize);
        left3 = setup("npc/nick/left3", gp.tileSize, gp.tileSize);
        right1 = setup("npc/nick/right1", gp.tileSize, gp.tileSize);
        right2 = setup("npc/nick/right2", gp.tileSize, gp.tileSize);
        right3 = setup("npc/nick/right3", gp.tileSize, gp.tileSize);
    }

    public void setAction() {
        if (onPath) {
            int goalCol = 13;
            int goalRow = 67;
//            int goalCol = (gp.player.worldX + gp.player.solidArea.x)/gp.tileSize;
//            int goalRow = (gp.player.worldY + gp.player.solidArea.y)/gp.tileSize;
            searchPath(goalCol, goalRow);
            finishedPath = true;
            speed = 1;

        } else {
//            actionLockCounter++;
//            if (actionLockCounter == 120) {
//                Random random = new Random();
//                int i = random.nextInt(100) + 1; // pick up a number from 1 to 100
//
//                if (i <= 25) {
//                    direction = "up";
//                }
//                if (i > 25 && i <= 50) {
//                    direction = "down";
//                }
//                if (i > 50 && i <= 75) {
//                    direction = "left";
//                }
//                if (i > 75) {
//                    direction = "right";
//                }
//                actionLockCounter = 0;
//            }
        }
    }

    public void setDialogue() {
        dialogues[0][0] = "Hey, you woke up ! That's Amazing!";
        dialogues[0][1] = "I found you after the storm you almost dying";
        dialogues[0][2] = "Unfortunately tour boat broke into pieces";
        dialogues[0][3] = "Follow me and I'll explain you everything";

        dialogues[1][0] = " This is a big strange island inhabitant with scary creatures and sick bustards...";
        dialogues[1][1] = "But I think I know the way....";
        dialogues[1][2] = "There is a door at north east...";


//            dialogues[0][0] = " Hey! You wake up! Amazing! Follow me \nI'll explain everything to you later....";
//
//        if(!onPath){
//            dialogues[1][1] = "So, I found you on the beach after this storm... \n I think you will die, but you're a strong one" +
//                    "\n So, it's a weird square Island inhabited with a scary creatures and bustards.\n" +
//                    "This is my house fill free to take everything you need then return to me...";
//            if (!questStarted) {
//                dialogues[2][2] = "Can you help with one task? \n There are a lot of punks in the buildings to the north." +
//                        "\n Bring me their tag's and I'll help you to find the way out of here!";
//                questStarted = true;
//
//            }
    }


    public void speak() {
        npcReactionToAction();
        startDialogue(this, dialogueSet);
        dialogueSet++;

        if(dialogues[dialogueSet][0] ==null){
//            dialogueSet = 0;
            dialogueSet--;
        }
        onPath = true;
    }
}


