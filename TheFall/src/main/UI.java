package main;

import entity.Entity;
import object.HP;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class UI {

    GamePanel gp;
    Graphics2D g2;
    Font myFont;
    BufferedImage hpfull, hpminusq, hphalf, hpquater, hpblank;
    public String currentDialogue = "";

    public boolean messageOn = false;
    ArrayList<String> message = new ArrayList<>();
    ArrayList<Integer> messageCounter = new ArrayList<>();

    public boolean gameFinished = false;
    public int commandNumber = 0;
    public int titleScreenState = 0; // 0: first screen 1: second screen
    public int slotCol = 0;
    public int slotRow = 0;

    public UI(GamePanel gp) {
        this.gp = gp;
        InputStream is = getClass().getResourceAsStream("/resources/font/GravityBold8.ttf");
        try {
            assert is != null;
            myFont = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

        //CREATE HUD OBJECT

        Entity hpbar = new HP(gp);
        hpfull = hpbar.image;
        hphalf = hpbar.image2;
        hpblank = hpbar.image3;
    }

    public void addMessage(String text) {
        message.add(text);
        messageCounter.add(0);
    }

    public void draw(Graphics2D g2) {

        this.g2 = g2;

        g2.setFont(myFont);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        //TITLE STATE
        if (gp.gameState == gp.titleState) {
            drawTitleScreen();
        }

        //PLAY STATE
        if (gp.gameState == gp.playState) {
            drawplayerlife();
            drawMessage();

        }
        //PAUSESTATE
        if (gp.gameState == gp.pauseState) {
            drawPauseScreen();

        }
        //DIALOGSTATE
        if (gp.gameState == gp.dialogState) {
            drawDialogueScreen();
        }
        //CHARACTER STATE
        if (gp.gameState == gp.charState) {
            drawCharScreen();
            drawInventoryScreen();
        }
    }

    private void drawInventoryScreen() {

        //FRAME

        int frameX = gp.tileSize * 9;
        int frameY = gp.tileSize;
        int frameWidth = gp.tileSize * 6;
        int frameHeight = gp.tileSize * 5;
        drawSubWindow(frameX, frameY, frameWidth, frameHeight);

        //SLOT

        final int slotXstart = frameX + 20;
        final int slotYstart = frameY + 20;
        int slotX = slotXstart;
        int slotY = slotYstart;
        int slotSize = gp.tileSize + 3;

        //DRAW PLAYERS ITEMS

        for(int i = 0; i < gp.player.inventory.size(); i ++){

            //EQUIP CURSOR

            if(gp.player.inventory.get(i) == gp.player.currentWeapon || gp.player.inventory.get(i) == gp.player.currentArmor ){
                g2.setColor(new Color(227, 176, 21));
                g2.fillRoundRect(slotX, slotY,gp.tileSize,gp.tileSize, 10,10);
            }
            g2.drawImage(gp.player.inventory.get(i).down1, slotX,slotY,null);
            slotX += slotSize;

            if( i == 4 || i == 9 || i == 14){
                slotX = slotXstart;
                slotY += slotSize;
            }
        }

        //CURSOR

        int cursorX = slotXstart + (slotSize*slotCol);
        int cursorY = slotYstart + (slotSize*slotRow);
        int cursorWidth = gp.tileSize;
        int cursorHeight = gp.tileSize;

        //DRAWCURSOR
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(3));
        g2.drawRoundRect(cursorX,cursorY,cursorWidth,cursorHeight,10,10);

        //DESCRIPTION FRAME

        int dFramex = frameX;
        int dFrameY = frameY + frameHeight;
        int dFrameWidth = frameWidth;
        int dFrameHeight = gp.tileSize * 5;



        //DRAW DESCRIPTION TEXT

        int textX = dFramex + 20;
        int textY = dFrameY + gp.tileSize;
        g2.setFont(g2.getFont().deriveFont(Font.PLAIN,10f));

        int itemIndex = getItemIndex();

        if(itemIndex < gp.player.inventory.size()){
            drawSubWindow(dFramex,dFrameY,dFrameWidth,dFrameHeight);
            for (String line : gp.player.inventory.get(itemIndex).description.split("\n")) {

                g2.drawString(line, textX, textY);
                textY += 32;
            }

        }



    }
    public int getItemIndex(){
        int itemIndex = slotCol + (slotRow * 5);

        return itemIndex;


    }


    private void drawplayerlife() {

        int x = gp.tileSize / 2;
        int y = gp.tileSize / 2;
        int i = 0;
        //DRAW BLANK HUD
        while (i < gp.player.maxHP / 2) {
            g2.drawImage(hpblank, x, y, null);
            i++;
            x += gp.tileSize - 10;
        }

        //RESET
        x = gp.tileSize / 2;
        i = 0;
        //DRAW CURRENT LIFE
        while (i < gp.player.life) {
            g2.drawImage(hphalf, x, y, null);
            i++;
            if (i < gp.player.life) {
                g2.drawImage(hpfull, x, y, null);
            }
            i++;
            x += gp.tileSize - 10;
        }


    }

    private void drawMessage() {
        int messageX = gp.tileSize;
        int messageY = gp.tileSize * 4;
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 10f));
        for (int i = 0; i < message.size(); i++) {
            if (message.get(i) != null) {
                g2.setColor(Color.BLACK);
                g2.drawString(message.get(i), messageX + 2, messageY + 2);
                g2.setColor(Color.WHITE);
                g2.drawString(message.get(i), messageX, messageY);
                int counter = messageCounter.get(i) + 1;
                messageCounter.set(i, counter);
                messageY += 50;

                if (messageCounter.get(i) > 180) {
                    message.remove(i);
                    messageCounter.remove(i);
                }
            }
        }
    }


    private void drawTitleScreen() {
        if (titleScreenState == 0) {
            //TITLE NAME
            g2.setFont(g2.getFont().deriveFont(Font.BOLD, 80f));
            String text = "THE CRASH";
            int x = getXforCenteredText(text);

            int y = gp.screenHeight / 3;
            //SHADOW
            g2.setColor(Color.DARK_GRAY);
            g2.drawString(text, x + 5, y + 5);
            //MAIN COLOR
            g2.setColor(Color.WHITE);
            g2.drawString(text, x, y);

            //IMAGE

            x = gp.screenWidth / 2 - (gp.tileSize / 2);
            y += gp.tileSize * 2;
            g2.drawImage(gp.player.down1, x, y, gp.tileSize, gp.tileSize, null);

            //MENU
            //NEW GAME
            g2.setFont(g2.getFont().deriveFont(Font.BOLD, 40f));
            text = "NEW GAME";
            x = getXforCenteredText(text);

            y += gp.tileSize * 2;

            g2.setColor(Color.DARK_GRAY);
            g2.drawString(text, x + 5, y + 5);
            //MAIN COLOR
            g2.setColor(Color.WHITE);
            g2.drawString(text, x, y);
            if (commandNumber == 0) {
                g2.drawString(">", x - gp.tileSize, y);
            }

            //LOAD GAME
            text = "LOAD GAME";
            x = getXforCenteredText(text);

            y += gp.tileSize + gp.tileSize / 2;

            g2.setColor(Color.DARK_GRAY);
            g2.drawString(text, x + 5, y + 5);
            //MAIN COLOR
            g2.setColor(Color.WHITE);
            g2.drawString(text, x, y);
            if (commandNumber == 1) {
                g2.drawString(">", x - gp.tileSize, y);
            }
            //EXIT
            text = "EXIT";
            x = getXforCenteredText(text);

            y += gp.tileSize + gp.tileSize / 2;

            g2.setColor(Color.DARK_GRAY);
            g2.drawString(text, x + 5, y + 5);
            //MAIN COLOR
            g2.setColor(Color.WHITE);
            g2.drawString(text, x, y);
            if (commandNumber == 2) {
                g2.drawString(">", x - gp.tileSize, y);
            }
        } else if (titleScreenState == 1) {

            g2.setFont(g2.getFont().deriveFont(Font.BOLD, 40f));
            String text = "Select your class: ";
            int x = getXforCenteredText(text);
            int y = gp.tileSize * 3;
            g2.setColor(Color.DARK_GRAY);
            g2.drawString(text, x + 5, y + 5);
            g2.setColor(Color.WHITE);
            g2.drawString(text, x, y);

            //GUNSLINGER
            g2.setFont(g2.getFont().deriveFont(Font.BOLD, 30f));
            text = "GUNSLINGER";
            x = getXforCenteredText(text);
            y += gp.tileSize * 2;
            g2.setColor(Color.DARK_GRAY);
            g2.drawString(text, x + 5, y + 5);
            g2.setColor(Color.WHITE);
            g2.drawString(text, x, y);
            if (commandNumber == 0) {
                g2.drawString(">", x - gp.tileSize, y);
            }

            //HACKER
            text = "HACKER";
            x = getXforCenteredText(text);
            y += gp.tileSize * 2;
            g2.setColor(Color.DARK_GRAY);
            g2.drawString(text, x + 5, y + 5);
            g2.setColor(Color.WHITE);
            g2.drawString(text, x, y);
            if (commandNumber == 1) {
                g2.drawString(">", x - gp.tileSize, y);
            }

            //ASSASIN

            text = "ASSASIN";
            x = getXforCenteredText(text);
            y += gp.tileSize * 2;
            g2.setColor(Color.DARK_GRAY);
            g2.drawString(text, x + 5, y + 5);
            g2.setColor(Color.WHITE);
            g2.drawString(text, x, y);
            if (commandNumber == 2) {
                g2.drawString(">", x - gp.tileSize, y);
            }
            //ASSASIN

            text = "BACK";
            x = getXforCenteredText(text);
            y += gp.tileSize * 2;
            g2.setColor(Color.DARK_GRAY);
            g2.drawString(text, x + 5, y + 5);
            g2.setColor(Color.WHITE);
            g2.drawString(text, x, y);
            if (commandNumber == 3) {
                g2.drawString(">", x - gp.tileSize, y);
            }
        }
    }

    public void drawPauseScreen() {

        String text = "PAUSED";
        int x = getXforCenteredText(text);

        int y = gp.screenHeight / 2;

        g2.setFont(g2.getFont().deriveFont(40f));
        g2.drawString(text, x - gp.tileSize * 2, y);

    }

    public void drawDialogueScreen() {
        //WINDOW
        int x = gp.tileSize * 2;
        int y = gp.tileSize / 2;
        int width = gp.screenWidth - (gp.tileSize * 4);
        int height = gp.tileSize * 4;
        drawSubWindow(x, y, width, height);
        g2.setFont(g2.getFont().deriveFont(Font.PLAIN, 10f));
        x += gp.tileSize;
        y += gp.tileSize;

        for (String line : currentDialogue.split("\n")) {
            g2.drawString(line, x, y);
            y += 40;
        }

    }

    private void drawCharScreen() {
        final int frameX = gp.tileSize * 2;
        final int frameY = gp.tileSize;
        final int frameWidth = gp.tileSize * 7;
        final int frameHeight = gp.tileSize * 10;
        drawSubWindow(frameX, frameY, frameWidth, frameHeight);

        //TEXT

        g2.setColor(Color.WHITE);
        g2.setFont(g2.getFont().deriveFont(20f));
        int textX = frameX + gp.tileSize / 2;
        int textY = frameY + gp.tileSize;
        final int lineHeight = 38;

        //NAMES

        g2.drawString("Level: ", textX, textY);
        textY += lineHeight;
        g2.drawString("Life: ", textX, textY);
        textY += lineHeight;
        g2.drawString("Strength: ", textX, textY);
        textY += lineHeight;
        g2.drawString("Dexterity: ", textX, textY);
        textY += lineHeight;
        g2.drawString("Attack: ", textX, textY);
        textY += lineHeight;
        g2.drawString("Defense: ", textX, textY);
        textY += lineHeight;
        g2.drawString("Exp: ", textX, textY);
        textY += lineHeight;
        g2.drawString("Next level: ", textX, textY);
        textY += lineHeight;
        g2.drawString("Coin: ", textX, textY);
        textY += lineHeight + gp.tileSize / 2;
        g2.drawString("Weapon: ", textX, textY);
        textY += lineHeight + 10;
        g2.drawString("Armor: ", textX, textY);
        textY += lineHeight;

        //VALUES

        int tailX = (frameX + frameWidth) - gp.tileSize / 2;
        textY = frameY + gp.tileSize;

        String value;
        value = String.valueOf(gp.player.level);
        textX = getXforAlignToRight(value, tailX);
        g2.drawString(value, textX, textY);
        textY += lineHeight;


        value = String.valueOf(gp.player.life + "/" + gp.player.maxHP);
        textX = getXforAlignToRight(value, tailX);
        g2.drawString(value, textX, textY);
        textY += lineHeight;


        value = String.valueOf(gp.player.strength);
        textX = getXforAlignToRight(value, tailX);
        g2.drawString(value, textX, textY);
        textY += lineHeight;


        value = String.valueOf(gp.player.dexterity);
        textX = getXforAlignToRight(value, tailX);
        g2.drawString(value, textX, textY);
        textY += lineHeight;


        value = String.valueOf(gp.player.attack);
        textX = getXforAlignToRight(value, tailX);
        g2.drawString(value, textX, textY);
        textY += lineHeight;


        value = String.valueOf(gp.player.defense);
        textX = getXforAlignToRight(value, tailX);
        g2.drawString(value, textX, textY);
        textY += lineHeight;


        value = String.valueOf(gp.player.exp);
        textX = getXforAlignToRight(value, tailX);
        g2.drawString(value, textX, textY);
        textY += lineHeight;


        value = String.valueOf(gp.player.nextLevel);
        textX = getXforAlignToRight(value, tailX);
        g2.drawString(value, textX, textY);
        textY += lineHeight;


        value = String.valueOf(gp.player.coin);
        textX = getXforAlignToRight(value, tailX);
        g2.drawString(value, textX, textY);
        textY += lineHeight;


        g2.drawImage(gp.player.currentWeapon.down1, tailX - gp.tileSize, textY - 15, null);
        textY += gp.tileSize;
        g2.drawImage(gp.player.currentArmor.down1, tailX - gp.tileSize, textY - 15, null);
    }

    public void drawSubWindow(int x, int y, int width, int height) {
        Color c = new Color(0, 0, 0, 200);
        g2.setColor(c);
        g2.fillRoundRect(x, y, width, height, 45, 45);

        c = new Color(255, 255, 255);
        g2.setStroke(new BasicStroke(5));
        g2.setColor(c);
        g2.drawRoundRect(x + 5, y + 5, width - 10, height - 10, 35, 35);

    }

    public int getXforCenteredText(String text) {
        int length = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        return gp.screenWidth / 2 - length / 2;
    }

    public int getXforAlignToRight(String text, int tailX) {
        int length = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        int x = tailX - length;
        return x;
    }
}
