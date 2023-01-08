package object.exterior;

import entity.Entity;
import main.GamePanel;

public class OBJ_IronDoor extends Entity {

    GamePanel gp;
    public final static String objName = "IronDoor";

    public OBJ_IronDoor(GamePanel gp) {

        super(gp);
        type = typeObstacle;
        name = objName;
        image = setup("objects/interactiveobjects/bunkerdoor2", gp.tileSize, gp.tileSize);
        down1 = image;
        collision = true;
        this.gp = gp;
        solidArea.x = 0;
        solidArea.y = 16;
        solidArea.width = 48;
        solidArea.height = 48;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        setDialog();

    }
    public void setDialog(){
        dialogues[0][0] = "Hmm... It might open from somewhere!";
        dialogues[1][0] = "You've opened an old bunker!";

    }

    public void interact() {
            startDialogue(this,0);


    }
    }

