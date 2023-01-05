package object.weapon;

import entity.Entity;
import main.GamePanel;

import java.awt.*;

public class OBJ_Melee_Bat_normal extends Entity {
    public OBJ_Melee_Bat_normal(GamePanel gp) {
        super(gp);
        type = typeMelee;
        name = "Wooden Bat";
        price = 100;
        down1 = setup("objects/bat",gp.tileSize,gp.tileSize);
        attackValue = 3;
        knockBackPower =0;
        description = "[" + name + "]\nAttack value: " + attackValue + "\nAn ordinary baseball bat";
        attackArea.width = 36;
        attackArea.height = 36;
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
