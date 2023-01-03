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
                    gp.playMusic(0);
                }
                if (gp.ui.commandNumber == 1) {
                    gp.gameState = gp.playState;
                    gp.playMusic(0);

                }
                if (gp.ui.commandNumber == 2) {
                    gp.gameState = gp.playState;
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
//            if (key == KeyEvent.VK_SPACE) {
//                spacePressed = true;
//            }
        if (key == KeyEvent.VK_ESCAPE) {
            System.exit(1);
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
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            if (gp.ui.slotRow != 0) {
                gp.ui.slotRow--;
                gp.playSE(9);
            }
        }
        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            if (gp.ui.slotRow != 3) {
                gp.ui.slotRow++;
                gp.playSE(9);
            }
        }
        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            if (gp.ui.slotCol != 0) {
                gp.ui.slotCol--;
                gp.playSE(9);
            }
        }
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            if (gp.ui.slotCol != 4) {
                gp.ui.slotCol++;
                gp.playSE(9);
            }

        }
        if (key == KeyEvent.VK_E || key == KeyEvent.VK_ENTER) {
           gp.player.selectItem();
           gp.playSE(10);
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
