package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_KeyCard extends Entity {
    public OBJ_KeyCard(GamePanel gp) {
        super(gp);
        type = typeConsumable;
        name = "Key Card";
        value = 1;
        down1 = setup("objects/keycard",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\nAn old bunker key card.";
    }
}
