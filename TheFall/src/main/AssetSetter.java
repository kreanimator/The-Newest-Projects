package main;

import enemies.DeathClaw;
import enemies.GreenSlime;
import enemies.Punk;
import entity.NpcNick;
import object.exterior.OBJ_Door;
import object.exterior.OBJ_GarbageTrunk;
import object.exterior.OBJ_Locker;
import tile_interactive.IT_Box;
import tile_interactive.IT_Vase;

public class AssetSetter {


    GamePanel gp;


    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        int i =0;
        gp.obj[i] = new OBJ_Door(gp);
        gp.obj[i].worldX = gp.tileSize * 49;
        gp.obj[i].worldY = gp.tileSize * 31;
        i++;
        gp.obj[i] = new OBJ_Door(gp);
        gp.obj[i].worldX = gp.tileSize * 38;
        gp.obj[i].worldY = gp.tileSize * 22;
        i++;
        gp.obj[i] = new OBJ_Door(gp);
        gp.obj[i].worldX = gp.tileSize * 51;
        gp.obj[i].worldY = gp.tileSize * 15;
        i++;
        gp.obj[i] = new OBJ_Door(gp);
        gp.obj[i].worldX = gp.tileSize * 65;
        gp.obj[i].worldY = gp.tileSize * 15;
        i++;
        gp.obj[i] = new OBJ_Locker(gp);
        gp.obj[i].worldX = gp.tileSize * 29;
        gp.obj[i].worldY = gp.tileSize * 16;
        i++;
        gp.obj[i] = new OBJ_Locker(gp);
        gp.obj[i].worldX = gp.tileSize * 58;
        gp.obj[i].worldY = gp.tileSize * 11;
        i++;
        gp.obj[i] = new OBJ_Locker(gp);
        gp.obj[i].worldX = gp.tileSize * 68;
        gp.obj[i].worldY = gp.tileSize * 12;
        i++;
        gp.obj[i] = new OBJ_GarbageTrunk(gp);
        gp.obj[i].worldX = gp.tileSize * 23;
        gp.obj[i].worldY = gp.tileSize * 19;
        i++;
        gp.obj[i] = new OBJ_GarbageTrunk(gp);
        gp.obj[i].worldX = gp.tileSize * 54;
        gp.obj[i].worldY = gp.tileSize * 13;

    }
    public void setInteractiveTile(){
        int i =0;
        gp.iTile[i] = new IT_Box(gp,54,14);
        i++;
        gp.iTile[i] = new IT_Box(gp,55,14);
        i++;
        gp.iTile[i] = new IT_Box(gp,56,14);
        i++;
        gp.iTile[i] = new IT_Box(gp,54,15);
        i++;
        gp.iTile[i] = new IT_Box(gp,55,15);
        i++;
        gp.iTile[i] = new IT_Box(gp,56,15);
        i++;
        gp.iTile[i] = new IT_Box(gp,19,77);
        i++;
        gp.iTile[i] = new IT_Box(gp,20,76);
        i++;
        gp.iTile[i] = new IT_Box(gp,21,75);
        i++;
        gp.iTile[i] = new IT_Vase(gp,28,78);
        i++;
        gp.iTile[i] = new IT_Vase(gp,27,78);
        i++;
        gp.iTile[i] = new IT_Vase(gp,27,79);

    }
    public void setNPC() {
        gp.npc[0] = new NpcNick(gp);
        gp.npc[0].worldX = gp.tileSize * 20;
        gp.npc[0].worldY = gp.tileSize * 80;
    }

    public void setEnemy() {
        int i = 0;
        gp.enemy[i] = new GreenSlime(gp);
        gp.enemy[i].worldX = gp.tileSize * 77;
        gp.enemy[i].worldY = gp.tileSize * 80;
        i++;
        gp.enemy[i] = new GreenSlime(gp);
        gp.enemy[i].worldX = gp.tileSize * 77;
        gp.enemy[i].worldY = gp.tileSize * 82;
        i++;
        gp.enemy[i] = new GreenSlime(gp);
        gp.enemy[i].worldX = gp.tileSize * 78;
        gp.enemy[i].worldY = gp.tileSize * 85;
        i++;
        gp.enemy[i] = new GreenSlime(gp);
        gp.enemy[i].worldX = gp.tileSize * 75;
        gp.enemy[i].worldY = gp.tileSize * 83;
        i++;
        gp.enemy[i] = new GreenSlime(gp);
        gp.enemy[i].worldX = gp.tileSize * 74;
        gp.enemy[i].worldY = gp.tileSize * 83;
        i++;

        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 49;
        gp.enemy[i].worldY = gp.tileSize *13;
        i++;
        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 50;
        gp.enemy[i].worldY = gp.tileSize * 13;
        i++;
        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 63;
        gp.enemy[i].worldY = gp.tileSize * 13;
        i++;
        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 60;
        gp.enemy[i].worldY = gp.tileSize * 13;
        i++;
        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 59;
        gp.enemy[i].worldY = gp.tileSize * 13;
        i++;
        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 46;
        gp.enemy[i].worldY = gp.tileSize * 28;
        i++;
        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 47;
        gp.enemy[i].worldY = gp.tileSize * 28;
        i++;
        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 31;
        gp.enemy[i].worldY = gp.tileSize * 19;
        i++;
        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 34;
        gp.enemy[i].worldY = gp.tileSize * 19;
        i++;
        gp.enemy[i] = new Punk(gp);
        gp.enemy[i].worldX = gp.tileSize * 35;
        gp.enemy[i].worldY = gp.tileSize * 19;
        i++;
        gp.enemy[i] = new DeathClaw(gp);
        gp.enemy[i].worldX = gp.tileSize * 29;
        gp.enemy[i].worldY = gp.tileSize * 48;


    }
}
