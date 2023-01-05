package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    GamePanel gp;
    public boolean upPressed, downPressed, leftPressed, rightPressed, ePressed, shotKeyPressed;

    //DEBUG

    boolean checkDrawTime = false;
    int debugCounter =0;

    public KeyHandler(GamePanel gp) {
        this.gp = gp;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        //TITLE STATE
        if (gp.gameState == gp.titleState) {
            titleState(key);
        }
        //PLAYSTATE
        else if (gp.gameState == gp.playState) {
            playState(key);
        }
        //PAUSE STATE
        else if (gp.gameState == gp.pauseState) {
            pauseState(key);
        }
        //DIALOGUE STATE
        else if (gp.gameState == gp.dialogState) {
            dialogueState(key);
        }
        //CHARACTER STATE
        else if (gp.gameState == gp.charState) {
                charState(key);
        }
        //OPTIONS STATE
        else if (gp.gameState == gp.optionsState) {
            optionsState(key);
        }
        else if (gp.gameState == gp.gameOverState) {
            gameOverState(key);
        }
        //TRADE STATE
        else if (gp.gameState == gp.tradeState) {
            tradeState(key);
        }
    }



    public void titleState(int key){
        if (gp.ui.titleScreenState == 0) {
            if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
                gp.ui.commandNumber--;
                if (gp.ui.commandNumber < 0) {
                    gp.ui.commandNumber = 2;
                }
            }
            if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
                gp.ui.commandNumber++;
                if (gp.ui.commandNumber > 2) {
                    gp.ui.commandNumber = 0;
                }
            }
            if (key == KeyEvent.VK_ENTER) {
                if (gp.ui.commandNumber == 0) {
                    gp.ui.titleScreenState =1;

                }
                if (gp.ui.commandNumber == 1) {
                    //Load game
                }
                if (gp.ui.commandNumber == 2) {
                    System.exit(1);

                }
            }
        }
        else if (gp.ui.titleScreenState ==1){
            if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
                gp.ui.commandNumber--;
                if (gp.ui.commandNumber < 0) {
                    gp.ui.commandNumber = 3;
                }
            }
            if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
                gp.ui.commandNumber++;
                if (gp.ui.commandNumber > 3) {
                    gp.ui.commandNumber = 0;
                }
            }
            if (key == KeyEvent.VK_ENTER) {
                if (gp.ui.commandNumber == 0) {
                    gp.gameState = gp.playState;
                    gp.ui.titleScreenState =0;
                    gp.playMusic(0);
                }
                if (gp.ui.commandNumber == 1) {
                    gp.gameState = gp.playState;
                    gp.ui.titleScreenState =0;
                    gp.playMusic(0);

                }
                if (gp.ui.commandNumber == 2) {
                    gp.gameState = gp.playState;
                    gp.ui.titleScreenState =0;
                    gp.playMusic(0);

                }
                if (gp.ui.commandNumber == 3) {
                    gp.ui.titleScreenState =0;

                }
            }
        }
    }
    public void playState(int key){
        if (key == KeyEvent.VK_W) {
            upPressed = true;

        }
        if (key == KeyEvent.VK_S) {
            downPressed = true;
        }
        if (key == KeyEvent.VK_A) {
            leftPressed = true;
        }
        if (key == KeyEvent.VK_D) {
            rightPressed = true;
        }
        if (key == KeyEvent.VK_P) {
            gp.gameState = gp.pauseState;

        }
        if (key == KeyEvent.VK_E) {
            ePressed = true;
            if(gp.player.currentWeapon.type == gp.player.typePistol || gp.player.currentWeapon.type == gp.player.typeShotgun){
                shotKeyPressed = true;
            }
        }
        if (key == KeyEvent.VK_C) {
            gp.gameState = gp.charState;
        }
        if (key == KeyEvent.VK_L) {
            if (!checkDrawTime) {
                checkDrawTime = true;
            } else if (checkDrawTime) {
                checkDrawTime =false;

            }

        }
        if (key == KeyEvent.VK_R) {
           switch (gp.currentMap){
               case 0: gp.tileM.loadMap("/resources/maps/world1.txt",0);break;
               case 1: gp.tileM.loadMap("/resources/maps/cave.txt",1);break;
           }

        }
//            if (key == KeyEvent.VK_SPACE) {
//                spacePressed = true;
//            }
        if (key == KeyEvent.VK_ESCAPE) {
            gp.gameState = gp.optionsState;
        }
    }
    public void pauseState(int key){
        if (key == KeyEvent.VK_P) {
            gp.gameState = gp.playState;

        }
    }
    public void dialogueState(int key){
        if (key == KeyEvent.VK_E) {
            gp.gameState = gp.playState;

        }
    }
    public void charState(int key) {
        if (key == KeyEvent.VK_C) {
            gp.gameState = gp.playState;
        }

        if (key == KeyEvent.VK_E || key == KeyEvent.VK_ENTER) {
           gp.player.selectItem();
           gp.playSE(10);
        }
        playerInventory(key);
    }
    private void tradeState(int key) {
        if(key == KeyEvent.VK_ENTER || key == KeyEvent.VK_E){
            ePressed = true;
        }
        if(gp.ui.subState ==0) {
            if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP) {
                gp.ui.commandNumber--;
                gp.playSE(9);
                if (gp.ui.commandNumber < 0) {
                    gp.ui.commandNumber = 2;
                }
            }
            if (key == KeyEvent.VK_S || key == KeyEvent.VK_DOWN) {

                gp.ui.commandNumber++;

                if (gp.ui.commandNumber > 2) {
                    gp.ui.commandNumber = 0;
                }
            }
            gp.playSE(9);
        }
            if(gp.ui.subState ==1){
                npcInventory(key);
                if(key == KeyEvent.VK_ESCAPE){
                    gp.ui.subState = 0;
                }
            }
        if(gp.ui.subState ==2){
            playerInventory(key);
            if(key == KeyEvent.VK_ESCAPE){
                gp.ui.subState = 0;
            }
        }
        }


    public void playerInventory(int key){
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            if (gp.ui.playerSlotRow != 0) {
                gp.ui.playerSlotRow--;
                gp.playSE(9);
            }
        }
        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            if (gp.ui.playerSlotRow != 3) {
                gp.ui.playerSlotRow++;
                gp.playSE(9);
            }
        }
        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            if (gp.ui.playerSlotCol != 0) {
                gp.ui.playerSlotCol--;
                gp.playSE(9);
            }
        }
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            if (gp.ui.playerSlotCol != 4) {
                gp.ui.playerSlotCol++;
                gp.playSE(9);
            }

        }
    }
    public void npcInventory(int key){
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            if (gp.ui.slotNpcRow != 0) {
                gp.ui.slotNpcRow--;
                gp.playSE(9);
            }
        }
        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            if (gp.ui.slotNpcRow != 3) {
                gp.ui.slotNpcRow++;
                gp.playSE(9);
            }
        }
        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            if (gp.ui.slotNpcCol != 0) {
                gp.ui.slotNpcCol--;
                gp.playSE(9);
            }
        }
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            if (gp.ui.slotNpcCol != 4) {
                gp.ui.slotNpcCol++;
                gp.playSE(9);
            }

        }

    }
    private void optionsState(int key) {
        if (key == KeyEvent.VK_ESCAPE) {
            gp.gameState = gp.playState;
        }
        if (key == KeyEvent.VK_ENTER || key == KeyEvent.VK_E) {
            ePressed = true;
        }
        int maxCommandNumber = switch (gp.ui.subState) {
            case 0 -> 5;
            case 3 -> 1;
            default -> 0;
//            case 1: maxCommandNumber =5;
        };
        if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP) {
            gp.ui.commandNumber--;
            gp.playSE(9);
            if (gp.ui.commandNumber < 0) {
                gp.ui.commandNumber = maxCommandNumber;
            }

        }
        if (key == KeyEvent.VK_S || key == KeyEvent.VK_DOWN) {
            gp.ui.commandNumber++;
            gp.playSE(9);
            if (gp.ui.commandNumber > maxCommandNumber) {
                gp.ui.commandNumber = 0;
            }
        }
        if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) {
            if (gp.ui.subState == 0) {
                if(gp.ui.commandNumber ==1 && gp.music.volumeScale > 0){
                    gp.music.volumeScale--;
                    gp.music.checkVolume();
                    gp.playSE(9);
                }
                if(gp.ui.commandNumber ==2 && gp.se.volumeScale > 0){
                    gp.se.volumeScale--;
                    gp.playSE(9);

                }

            }
        }


        if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) {
            if (gp.ui.subState == 0) {
                if(gp.ui.commandNumber ==1 && gp.music.volumeScale < 5){
                    gp.music.volumeScale++;
                    gp.music.checkVolume();
                    gp.playSE(9);

                }
                if(gp.ui.commandNumber ==2 && gp.se.volumeScale < 5){
                    gp.se.volumeScale++;
                    gp.playSE(9);

                }

            }
        }
    }
    private void gameOverState(int key) {
        if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP) {
        gp.ui.commandNumber --;
        if(gp.ui.commandNumber <0){
            gp.ui.commandNumber = 1;
        }
        gp.playSE(9);

        }
        if (key == KeyEvent.VK_S || key == KeyEvent.VK_DOWN) {
        gp.ui.commandNumber++;
            if(gp.ui.commandNumber >1){
                gp.ui.commandNumber = 0;
            }
            gp.playSE(9);
        }
        if(key == KeyEvent.VK_E || key== KeyEvent.VK_ENTER){
            if(gp.ui.commandNumber ==0){
                gp.gameState = gp.playState;
                gp.retry();
                gp.playMusic(0);
            }
            else if (gp.ui.commandNumber ==1){
                gp.gameState = gp.titleState;
                gp.restart();
            }
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W) {
            upPressed = false;

        }
        if (key == KeyEvent.VK_S) {
            downPressed = false;
        }
        if (key == KeyEvent.VK_A) {
            leftPressed = false;
        }
        if (key == KeyEvent.VK_D) {
            rightPressed = false;
        }
        if (key == KeyEvent.VK_E) {
            ePressed = false;
            shotKeyPressed = false;
        }


    }
}
