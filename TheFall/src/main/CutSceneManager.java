package main;

import object.exterior.OBJ_IronDoor;

import java.awt.*;

public class CutSceneManager {
    GamePanel gp;
    Graphics2D g2;
    public int sceneNum;
    public int scenePhase;

    //SCENE NUMBER
    public final int NA = 0 ;
    public final  int slimeBoss = 1;

    public CutSceneManager(GamePanel gp) {
        this.gp = gp;
    }
    public void draw (Graphics2D g2){
        this.g2 = g2;

        switch (sceneNum){
            case slimeBoss -> scene_SlimeBoss();
        }

    }

    private void scene_SlimeBoss() {
        if (scenePhase ==0){
            gp.bossBattleOn = true;

            //SHUT THE DOOR

            for(int i = 0; i < gp.obj[1].length;i ++){
                if(gp.obj[gp.currentMap][i] != null){
                    gp.obj[gp.currentMap][i] = new OBJ_IronDoor(gp);
                    gp.obj[gp.currentMap][i].worldX = gp.tileSize * 30;
                    gp.obj[gp.currentMap][i].worldY = gp.tileSize * 46;
                    gp.obj[gp.currentMap][i].temp = true;
                    gp.playSE(28);
                    break;

                }
            }
            gp.player.drawing =false;
            scenePhase++;
        }
        if (scenePhase ==1){
            gp.player.worldY -=2;
        }
    }
}
