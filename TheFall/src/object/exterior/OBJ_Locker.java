package object.exterior;

import entity.Entity;
import main.GamePanel;

public class OBJ_Locker extends Entity {

    GamePanel gp;
    public final static String objName = "Locker";



    public OBJ_Locker(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = typeObstacle;
        name = objName;
        image = setup("objects/interactiveobjects/locker", gp.tileSize, gp.tileSize);
        image2 = setup("objects/interactiveobjects/lockeropened", gp.tileSize, gp.tileSize);
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
        setDialogue();
    }
    public void setDialogue(){
        dialogues[0][0] = "You opened a locker and find a " + loot.name +" !";
        dialogues[1][0] = "You cannot carry anymore";
        dialogues[2][0] = "It's empty! ";

    }
    public void interact() {
        if (!opened) {
            gp.playSE(6);

            if (!gp.player.canObtainItem(loot)) {
            startDialogue(this,1);
            } else {
                down1 = image2;
                opened = true;
            }
            startDialogue(this,0);
        } else {
            startDialogue(this,2);
        }
    }
}
