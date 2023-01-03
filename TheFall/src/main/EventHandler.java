package main;

import tiles.TileManager;
import tiles.Tiles;

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


        //TOXIC DAMAGE
        if(distance > gp.tileSize){
            canTouchEvent =true;
        }
        if(canTouchEvent) {

            if (hit(29, 82, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(30, 82, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(30, 81, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(29, 81, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(30, 80, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(31, 80, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(32, 79, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(31, 79, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(81, 56, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(83,55, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(84, 55, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(85, 55, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(83, 53, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(84, 53, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(82, 52, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(82, 51, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(82, 50, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(82, 49, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(82, 48, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(82, 47, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(82, 46, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(83, 46, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(83, 45, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(81, 38, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(80, 38, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(80, 37, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(79, 37, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(78, 37, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(77, 37, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(77, 36, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(77, 35, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(76, 35, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(75, 35, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(74, 35, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(74, 34, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(73, 34, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(72, 34, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(71, 34, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(71, 33, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(70, 33, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(69, 33, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(68, 33, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(67, 33, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(67, 33, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(66, 33, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(65, 32, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(65, 31, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(66, 31, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(32, 33, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(30, 34, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(29, 33, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(28, 32, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(27, 32, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(26, 32, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(28, 31, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(26, 30, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(29, 30, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(30, 30, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(26, 29, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(25, 29, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(24, 29, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(23, 29, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(23, 28, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(26, 46, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(26, 47, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(25, 48, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(26, 48, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(27, 48, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(28, 47, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(29, 47, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(30, 47, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(30, 48, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(29, 48, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(28, 48, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(32, 48, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(33, 48, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(32, 49, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(31, 49, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(30, 49, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(29, 49, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(28, 49, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(27, 49, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(27, 50, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(29, 50, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(74, 78, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(75, 78, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(76, 78, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(77, 78, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(73, 79, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(74, 79, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(75, 79, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(76, 79, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(77, 79, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(78, 79, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(79, 79, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(80, 79, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(81, 79, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(83, 79, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(73, 80, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(74, 80, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(75, 80, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(76, 80, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(77, 80, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(79, 80, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(81, 80, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(83, 80, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(73, 81, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(74, 81, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(76, 81, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(77, 81, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(78, 81, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(80, 81, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(81, 81, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(82, 81, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(83, 81, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(74, 82, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(75, 82, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(76, 82, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(77, 82, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(78, 82, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(79, 82, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(80, 82, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(82, 82, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(83, 82, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(74, 83, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(75, 83, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(77, 83, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(78, 83, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(80, 83, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(81, 83, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(82, 83, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(74, 84, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(75, 84, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(76, 84, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(77, 84, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(78, 84, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(79, 84, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(80, 84, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(81, 84, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(74, 85, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(76, 85, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(78, 85, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(79, 85, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(80, 85, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(81, 85, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(74, 86, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(75, 86, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(76, 86, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(77, 86, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(78, 86, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(79, 86, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
            }
            if (hit(75, 87, "any")) {
                toxicDamage(gp.dialogState);
                gp.playSE(17);
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
