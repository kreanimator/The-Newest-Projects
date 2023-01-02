package main;

import enemies.DeathClaw;
import enemies.GreenSlime;
import enemies.Punk;
import entity.NpcNick;
import object.*;
import tile_interactive.IT_Box;

public class AssetSetter {


    GamePanel gp;


    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        int i =0;
        gp.obj[i] = new OBJ_Door(gp);
        gp.obj[i].worldX = gp.tileSize * 25;
        gp.obj[i].worldY = gp.tileSize * 12;
        i++;
        gp.obj[i] = new OBJ_Locker(gp);
        gp.obj[i].worldX = gp.tileSize * 22;
        gp.obj[i].worldY = gp.tileSize * 9;
        i++;
        gp.obj[i] = new OBJ_Locker(gp);
        gp.obj[i].worldX = gp.tileSize * 23;
        gp.obj[i].worldY = gp.tileSize * 9;
        i++;
        gp.obj[i] = new OBJ_Locker(gp);
        gp.obj[i].worldX = gp.tileSize * 24;
        gp.obj[i].worldY = gp.tileSize * 9;
        i++;
        gp.obj[i] = new OBJ_GarbageTrunk(gp);
        gp.obj[i].worldX = gp.tileSize * 19;
        gp.obj[i].worldY = gp.tileSize * 11;
        i++;
        gp.obj[i] = new OBJ_GarbageTrunk(gp);
        gp.obj[i].worldX = gp.tileSize * 13;
        gp.obj[i].worldY = gp.tileSize * 34;

    }
    public void setInteractiveTile(){
        int i =0;
        gp.iTile[i] = new IT_Box(gp);
        gp.iTile[i].worldX = gp.tileSize *1;
        gp.iTile[i].worldY = gp.tileSize *1;
    }

    public void setNPC() {
        gp.npc[0] = new NpcNick(gp);
        gp.npc[0].worldX = gp.tileSize * 16;
        gp.npc[0].worldY = gp.tileSize * 34;
    }

    public void setEnemy() {
        int i = 0;
        gp.enemy[i] = new GreenSlime(gp);
        gp.enemy[i].worldX = gp.tileSize * 13;
        gp.enemy[i].worldY = gp.tileSize * 22;
        i++;
        gp.enemy[i] = new GreenSlime(gp);
        gp.enemy[i].worldX = gp.tileSize * 15;
        gp.enemy[i].worldY = gp.tileSize * 22;
        i++;
        gp.enemy[i] = new GreenSlime(gp);
        gp.enemy[i].worldX = gp.tileSize * 16;
        gp.enemy[i].worldY = gp.tileSize * 22;
        i++;
        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 24;
        gp.enemy[i].worldY = gp.tileSize *14;
        i++;
        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 23;
        gp.enemy[i].worldY = gp.tileSize * 15;
        i++;
        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 25;
        gp.enemy[i].worldY = gp.tileSize * 16;
        i++;
        gp.enemy[i] = new DeathClaw(gp);
        gp.enemy[i].worldX = gp.tileSize * 23;
        gp.enemy[i].worldY = gp.tileSize * 11;


    }
}
