package main;

import enemies.DeathClaw;
import enemies.GreenSlime;
import enemies.Punk;
import entity.NPC_Ghoul;
import entity.NPC_Nick;
import object.armor.OBJ_Armor_Metal;
import object.exterior.OBJ_Door;
import object.exterior.OBJ_GarbageTrunk;
import object.exterior.OBJ_Locker;
import object.misc.OBJ_HPPack;
import object.weapon.OBJ_Pistol;
import object.weapon.OBJ_Wrench;
import tile_interactive.IT_Box;
import tile_interactive.IT_Vase;

public class AssetSetter {


    GamePanel gp;


    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        int mapNum = 0;
        int i =0;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 49;
        gp.obj[mapNum][i].worldY = gp.tileSize * 31;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 38;
        gp.obj[mapNum][i].worldY = gp.tileSize * 22;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 51;
        gp.obj[mapNum][i].worldY = gp.tileSize * 15;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 65;
        gp.obj[mapNum][i].worldY = gp.tileSize * 15;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp, new OBJ_Pistol(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 29;
        gp.obj[mapNum][i].worldY = gp.tileSize * 16;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp, new OBJ_Wrench(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 58;
        gp.obj[mapNum][i].worldY = gp.tileSize * 11;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp, new OBJ_Armor_Metal(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 68;
        gp.obj[mapNum][i].worldY = gp.tileSize * 12;
        i++;
        gp.obj[mapNum][i] = new OBJ_GarbageTrunk(gp,new OBJ_HPPack(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 23;
        gp.obj[mapNum][i].worldY = gp.tileSize * 19;
        i++;
        gp.obj[mapNum][i] = new OBJ_GarbageTrunk(gp,new OBJ_HPPack(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 54;
        gp.obj[mapNum][i].worldY = gp.tileSize * 13;

    }
    public void setInteractiveTile(){
        int mapNum = 0;
        int i =0;
        gp.iTile[mapNum][i] = new IT_Box(gp,54,14);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,55,14);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,56,14);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,54,15);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,55,15);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,56,15);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,19,77);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,20,76);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,21,75);
        i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,28,78);
        i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,27,78);
        i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,27,79);
        mapNum = 1;
        gp.iTile[mapNum][i] = new IT_Vase(gp,16,41);
        i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,17,41);
        i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,18,41);
    }
    public void setNPC() {
        int mapNum = 0;
        gp.npc[mapNum][0] = new NPC_Nick(gp);
        gp.npc[mapNum][0].worldX = gp.tileSize * 20;
        gp.npc[mapNum][0].worldY = gp.tileSize * 80;

        mapNum = 1;
        gp.npc[mapNum][0] = new NPC_Ghoul(gp);
        gp.npc[mapNum][0].worldX = gp.tileSize * 14;
        gp.npc[mapNum][0].worldY = gp.tileSize * 41;
    }

    public void setEnemy() {
        int mapNum = 0;
        int i = 0;
        gp.enemy[mapNum][i] = new GreenSlime(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 77;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 80;
        i++;
        gp.enemy[mapNum][i] = new GreenSlime(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 77;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 82;
        i++;
        gp.enemy[mapNum][i] = new GreenSlime(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 78;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 85;
        i++;
        gp.enemy[mapNum][i] = new GreenSlime(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 75;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 83;
        i++;
        gp.enemy[mapNum][i] = new GreenSlime(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 74;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 83;
        i++;

        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 49;
        gp.enemy[mapNum][i].worldY = gp.tileSize *13;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 50;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 13;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 63;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 13;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 46;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 28;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 47;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 28;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 60;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 13;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 30;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 18;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 30;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 19;
        i++;
        gp.enemy[mapNum][i] = new DeathClaw(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 29;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 48;


    }
}
