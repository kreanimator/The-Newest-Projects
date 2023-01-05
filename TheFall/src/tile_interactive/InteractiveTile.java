package tile_interactive;

import entity.Entity;
import main.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;

public class InteractiveTile extends Entity {
    GamePanel gp;
    public boolean destructible = false;
    public InteractiveTile(GamePanel gp , int col, int row) {
        super(gp);
        this.gp = gp;
    }
    public boolean isCorrectItem(Entity entity){
        boolean isCorrectItem = false;
        return isCorrectItem;
    }
    public void action(){

    }
    public void update(){
            if(invincible){
                invincibleCounter++;
                if (invincibleCounter>20){
                    invincible=false;
                    invincibleCounter =0;
                }
            }
    }
    public void playSE(){

    }
    public InteractiveTile getDestroyedForm(){
        InteractiveTile tile = null;
        return tile;

    }
        public void draw (Graphics2D g2){


            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            g2.drawImage(down1, screenX, screenY, gp.tileSize, gp.tileSize, null);
        }
}
