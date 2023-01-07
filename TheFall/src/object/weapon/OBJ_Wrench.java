package object.weapon;

import entity.Entity;
import main.GamePanel;

import java.awt.*;

public class OBJ_Wrench extends Entity {

    public final static String objName = "Wrench";
    public OBJ_Wrench(GamePanel gp) {
        super(gp);
        type = typeWrench;
        price = 1000;
        name = objName;
        down1 = setup("objects/wrench",gp.tileSize,gp.tileSize);
        attackValue = 6;
        knockBackPower = 10;
        description = "[" + name + "]\nAttack value: " + attackValue + "\nOld rusty wrench.\n Dangerous as a weapon.\n Can brake some objects.";
        attackArea.width = 36;
        attackArea.height = 36;
        motion1Duration = 10;
        motion2Duration = 20;
        motion3Duration = 40;
    }
    public Color getParticleColor(){
        Color color = new Color(220, 1, 44);
        return color;
    }
    public int getParticleSize(){
        int size = 6;
        return size;
    }
    public int getParticleSpeed(){
        int speed = 1;
        return speed;
    }
    public int getParticleLife(){
        int maxHP = 10;
        return maxHP;
    }


}
