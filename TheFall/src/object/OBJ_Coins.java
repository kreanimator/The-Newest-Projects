package object;

import entity.Entity;
import main.GamePanel;

import java.util.Random;

public class OBJ_Coins extends Entity {

    GamePanel gp;


    public OBJ_Coins(GamePanel gp) {
        super(gp);
        Random rand = new Random();
        this.gp = gp;
        type = typePickupOnly;
        value = rand.nextInt(5,100);
        name = "Coins";
        down1 = setup("objects/coins",gp.tileSize,gp.tileSize);
        description = "[" + name + "]\nSome old rusty coins. May be valuable.";

    }
    public void use (Entity entity){
        gp.playSE(3);
        gp.ui.addMessage("Coin " + value);
        gp.player.coin += value;

    }
}
