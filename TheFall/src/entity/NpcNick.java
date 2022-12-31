package entity;

import main.GamePanel;

import java.util.Random;

public class NpcNick extends Entity {

    public NpcNick(GamePanel gp) {
        super(gp);
        direction = "down";
        speed = 1;
        getImage();
        setDialogue();
    }

    public void getImage() {
        up1 = setup("npc/nick/up1",gp.tileSize -10,gp.tileSize -10);
        up2 = setup("npc/nick/up2",gp.tileSize -10,gp.tileSize -10);
        up3 = setup("npc/nick/up3",gp.tileSize -10,gp.tileSize -10);
        down1 = setup("npc/nick/down1",gp.tileSize -10,gp.tileSize -10);
        down2 = setup("npc/nick/down2",gp.tileSize -10,gp.tileSize -10);
        down3 = setup("npc/nick/down3",gp.tileSize -10,gp.tileSize -10);
        left1 = setup("npc/nick/left1",gp.tileSize -10,gp.tileSize -10);
        left2 = setup("npc/nick/left2",gp.tileSize -10,gp.tileSize -10);
        left3 = setup("npc/nick/left3",gp.tileSize -10,gp.tileSize -10);
        right1 = setup("npc/nick/right1",gp.tileSize -10,gp.tileSize -10);
        right2 = setup("npc/nick/right2",gp.tileSize -10,gp.tileSize -10);
        right3 = setup("npc/nick/right3",gp.tileSize -10,gp.tileSize -10);
    }

    public void setAction() {

        actionLockCounter++;
        if (actionLockCounter == 120) {
            Random random = new Random();
            int i = random.nextInt(100) + 1; // pick up a number from 1 to 100

            if (i <= 25) {
                direction = "up";
            }
            if (i > 25 && i <= 50) {
                direction = "down";
            }
            if (i > 50 && i <= 75) {
                direction = "left";
            }
            if (i > 75) {
                direction = "right";
            }
            actionLockCounter =0;
        }
    }
    public void setDialogue(){
        dialogues[0] = " Hey! You wake up! Amazing!";
        dialogues[1] = " I found you near your boat.\n Unfortunately it crashed into pieces.";
        dialogues[2] = " You're lucky bustard. To stay alive after this storm.";
        dialogues[3] = " So, I cannot explain to you where you are.\n" +
                " It is strange square island inhabited with bustards \nand scary creatures," +
                " but there is a door at the north,\n maybe it is an exit?";
    }
    public void speak(){
        super.speak();
        }
    }


