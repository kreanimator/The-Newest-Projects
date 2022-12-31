package main;

import java.awt.*;

public class EventHandler {

    GamePanel gp;
    EventRect[][] eventRect;
    int previousEventX,previousEventY;
    boolean canTouchEvent = true;

    public EventHandler(GamePanel gp) {
        this.gp = gp;
        eventRect = new EventRect[gp.maxWorldCol][gp.maxWorldRow];

        int col = 0;
        int row = 0;

        while (col<gp.maxWorldCol && row < gp.maxWorldRow){
            eventRect[col][row] = new EventRect();
            eventRect[col][row].x = 23;
            eventRect[col][row].y = 23;
            eventRect[col][row].width = 2;
            eventRect[col][row].height = 2;
            eventRect[col][row].eventRectDefaultX = eventRect[col][row].x;
            eventRect[col][row].eventRectDefaultY = eventRect[col][row].y;

            col++;
            if (col == gp.maxWorldCol){
                col =0;
                row++;
            }
        }

    }

    public void checkEvent() {

        //Check if the player 1 tile away from the event tile
        int xDistance = Math.abs(gp.player.worldX - previousEventX);
        int yDistance = Math.abs(gp.player.worldY - previousEventY);

        int distance = Math.max(xDistance,yDistance);

        if(distance > gp.tileSize){
            canTouchEvent =true;
        }
        if(canTouchEvent) {
            if (hit(13, 22, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(7);
            }
            if (hit(15, 22, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(7);
            }
            if (hit(16, 22, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(7);
            }
            if (hit(14, 23, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(7);
            }
            if (hit(16, 23, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(7);
            }
            if (hit(14, 24, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(7);
            }
            if (hit(15, 24, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(7);
            }
            if (hit(13, 25, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(7);
            }
        }

    }
    public void toxicDamage(int gameState){
        gp.gameState = gameState;
        gp.ui.currentDialogue = "You got toxic damage";
        gp.player.life -=1;
        canTouchEvent = false;

    }

    public boolean hit(int col, int row, String reqDirection) {
        boolean hit = false;

        gp.player.solidArea.x = gp.player.worldX + gp.player.solidArea.x;
        gp.player.solidArea.y = gp.player.worldY + gp.player.solidArea.y;
        eventRect[col][row].x = col * gp.tileSize + eventRect[col][row].x;
        eventRect[col][row].y = row * gp.tileSize + eventRect[col][row].y;

        if (gp.player.solidArea.intersects(eventRect[col][row])) {
            if (gp.player.direction.contentEquals(reqDirection) || reqDirection.contentEquals("any")) {
                hit = true;

                previousEventX = gp.player.worldX;
                previousEventY = gp.player.worldY;
            }
        }

        gp.player.solidArea.x = gp.player.solidAreaDefaultX;
        gp.player.solidArea.y = gp.player.solidAreaDefaultY;
        eventRect[col][row].x = eventRect[col][row].eventRectDefaultX;
        eventRect[col][row].y = eventRect[col][row].eventRectDefaultY;

        return hit;

    }
}
