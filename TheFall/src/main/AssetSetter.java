package main;

import data.Progress;
import enemies.*;
import entity.Entity;
import entity.NPC_BigRock;
import entity.NPC_Ghoul;
import entity.NPC_Nick;
import object.barrels.*;
import object.exterior.*;
import object.fridges.OBJ_Fridge1;
import object.fridges.OBJ_Fridge2;
import object.fridges.OBJ_Fridge3;
import object.fridges.OBJ_Fridge4;
import object.misc.OBJ_HPPack;
import object.misc.OBJ_Tent;
import object.trash.OBJ_Bath1;
import object.trash.OBJ_Garbage1;
import object.trash.OBJ_Garbage2;
import object.trash.OBJ_Garbage3;
import object.trees.OBJ_Tree1;
import object.walls.*;
import tile_interactive.IT_Box;
import tile_interactive.IT_MetalPlate;
import tile_interactive.IT_Vase;

public class AssetSetter {


    GamePanel gp;


    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        //LEVEL 1
        int mapNum = 0;
        int i =0;

        //FENCE
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,81,48);i++;
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,83,48);i++;
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,85,48);i++;
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,79,48);i++;
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,77,48);i++;
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,75,48);i++;
        gp.obj[mapNum][i] = new OBJ_Fence2(gp,73,48);i++;
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,71,48);i++;
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,69,48);i++;
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,67,48);i++;
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,65,48);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,87,49);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,87,51);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,87,53);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,87,55);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,87,57);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,87,59);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,87,61);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,87,63);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,87,65);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,87,67);i++;

//
        gp.obj[mapNum][i] = new OBJ_Fence3(gp,81,68);i++;
        gp.obj[mapNum][i] = new OBJ_Fence4(gp,83,68);i++;
        gp.obj[mapNum][i] = new OBJ_Fence3(gp,85,68);i++;
        gp.obj[mapNum][i] = new OBJ_Fence3(gp,79,68);i++;
        gp.obj[mapNum][i] = new OBJ_Fence3(gp,77,68);i++;
        gp.obj[mapNum][i] = new OBJ_Fence3(gp,75,68);i++;
        gp.obj[mapNum][i] = new OBJ_Fence4(gp,73,68);i++;
        gp.obj[mapNum][i] = new OBJ_Fence3(gp,71,68);i++;
        gp.obj[mapNum][i] = new OBJ_Fence3(gp,69,68);i++;
        gp.obj[mapNum][i] = new OBJ_Fence3(gp,67,68);i++;
        gp.obj[mapNum][i] = new OBJ_Fence3(gp,65,68);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,65,49);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,65,51);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,65,53);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,65,55);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,65,57);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,65,59);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,65,60);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,65,63);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,65,65);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,65,67);i++;

        //
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,13,13);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,13,15);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,13,17);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,13,19);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,13,20);i++;

        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,23,13);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,23,15);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,23,18);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,23,19);i++;
        gp.obj[mapNum][i] = new OBJ_Fenceside1(gp,23,20);i++;

        gp.obj[mapNum][i] = new OBJ_Fence1(gp,13,12);i++;
        gp.obj[mapNum][i] = new OBJ_Fence2(gp,15,12);i++;
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,17,12);i++;
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,19,12);i++;
        gp.obj[mapNum][i] = new OBJ_Fence1(gp,21,12);i++;

        gp.obj[mapNum][i] = new OBJ_Fence3(gp,13,21);i++;
        gp.obj[mapNum][i] = new OBJ_Fence4(gp,15,21);i++;
        gp.obj[mapNum][i] = new OBJ_Fence3(gp,17,21);i++;
        gp.obj[mapNum][i] = new OBJ_Fence4(gp,19,21);i++;
        gp.obj[mapNum][i] = new OBJ_Fence3(gp,21,21);i++;



        //BUILDINGS
        gp.obj[mapNum][i] = new WL_Sidewall(gp,31,85);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,31,83);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,31,82);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,42,85);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,42,83);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,42,82);i++;
        gp.obj[mapNum][i] = new WL_Barn(gp,31,86);i++;
        gp.obj[mapNum][i] = new WL_BarnBD(gp,31,81);i++;

        gp.obj[mapNum][i] = new WL_Sidewall(gp,76,12);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,76,14);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,87,12);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,87,14);i++;
        gp.obj[mapNum][i] = new WL_Brick2(gp,76,11);i++;
        gp.obj[mapNum][i] = new WL_BrickFD(gp,76,15);i++;
        gp.obj[mapNum][i] = new OBJ_Door2(gp,76,15);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,48,11);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,48,12);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,48,14);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,59,11);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,59,12);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,59,14);i++;
        gp.obj[mapNum][i] = new WL_Brick3(gp,48,10);i++;
        gp.obj[mapNum][i] = new WL_BrickFD(gp,48,15);i++;
        gp.obj[mapNum][i] = new OBJ_Door2(gp,48,15);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,70,23);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,70,25);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,70,27);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,60,23);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,60,25);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,60,27);i++;
        gp.obj[mapNum][i] = new WL_RuinedWallFD(gp,60,28);i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp, 60,28);i++;
        gp.obj[mapNum][i] = new WL_RuinedWall2(gp,60,22);i++;

        gp.obj[mapNum][i] = new WL_Factory1(gp,17,60);i++;
        gp.obj[mapNum][i] = new WL_Factory3(gp,23,60);i++;
        gp.obj[mapNum][i] = new WL_Factory1(gp,28,60);i++;
        gp.obj[mapNum][i] = new OBJ_FactoryDoor(gp,33,60);i++;
        gp.obj[mapNum][i] = new WL_FactoryWall5(gp,22,60);i++;
        gp.obj[mapNum][i] = new WL_Factory1(gp,34,60);i++;
        gp.obj[mapNum][i] = new WL_Factory3(gp,39,60);i++;

        gp.obj[mapNum][i] = new WL_Factory2(gp,17,37);i++;
        gp.obj[mapNum][i] = new WL_Factory4(gp,23,37);i++;
        gp.obj[mapNum][i] = new WL_Factory2(gp,28,37);i++;
        gp.obj[mapNum][i] = new WL_FactoryWall6(gp,33,37);i++;
        gp.obj[mapNum][i] = new WL_FactoryWall6(gp,22,37);i++;
        gp.obj[mapNum][i] = new WL_Factory4(gp,34,37);i++;
        gp.obj[mapNum][i] = new WL_Factory2(gp,39,37);i++;


        gp.obj[mapNum][i] = new WL_Oldwall(gp,17,42);i++;
        gp.obj[mapNum][i] = new WL_Oldwall2(gp,24,42);i++;
        gp.obj[mapNum][i] = new WL_Oldwall(gp,31,42);i++;
        gp.obj[mapNum][i] = new WL_Oldwall(gp,37,47);i++;
        gp.obj[mapNum][i] = new WL_Oldwall2(gp,30,47);i++;
        gp.obj[mapNum][i] = new WL_Oldwall(gp,23,47);i++;
        gp.obj[mapNum][i] = new WL_Oldwall(gp,17,52);i++;
        gp.obj[mapNum][i] = new WL_Oldwall2(gp,24,52);i++;
        gp.obj[mapNum][i] = new WL_Oldwall(gp,31,52);i++;
        gp.obj[mapNum][i] = new WL_Oldwall(gp,37,57);i++;
        gp.obj[mapNum][i] = new WL_Oldwall2(gp,30,57);i++;
        gp.obj[mapNum][i] = new WL_Oldwall(gp,23,57);i++;

        gp.obj[mapNum][i] = new WL_Sidewall(gp,17,38);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,17,40);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,17,42);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,17,44);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,17,46);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,17,48);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,17,50);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,17,52);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,17,54);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,17,56);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,17,58);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,17,59);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,44,38);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,44,40);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,44,42);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,44,44);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,44,46);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,44,48);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,44,50);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,44,52);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,44,54);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,44,56);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,44,58);i++;
        gp.obj[mapNum][i] = new WL_Sidewall(gp,44,59);i++;





        //BARRELS
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels1(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 80;
        gp.obj[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels2(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 67;
        gp.obj[mapNum][i].worldY = gp.tileSize * 50;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels3(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 76;
        gp.obj[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels4(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 84;
        gp.obj[mapNum][i].worldY = gp.tileSize * 50;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels5(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 84;
        gp.obj[mapNum][i].worldY = gp.tileSize * 59;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels6(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 77;
        gp.obj[mapNum][i].worldY = gp.tileSize * 56;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels1(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 83;
        gp.obj[mapNum][i].worldY = gp.tileSize * 64;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels10(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 78;
        gp.obj[mapNum][i].worldY = gp.tileSize * 61;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels2(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 72;
        gp.obj[mapNum][i].worldY = gp.tileSize * 64;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels3(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 67;
        gp.obj[mapNum][i].worldY = gp.tileSize * 59;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels7(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 80;
        gp.obj[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels9(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 72;
        gp.obj[mapNum][i].worldY = gp.tileSize * 59;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels1(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 70;
        gp.obj[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels8(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 73;
        gp.obj[mapNum][i].worldY = gp.tileSize * 56;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels12(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 84;
        gp.obj[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels4(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 78;
        gp.obj[mapNum][i].worldY = gp.tileSize * 66;
        i++;
        gp.obj[mapNum][i] = new OBJ_ToxicBarrels3(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 66;
        gp.obj[mapNum][i].worldY = gp.tileSize * 64;
        i++;

        //FRIDGES
        gp.obj[mapNum][i] = new OBJ_Fridge1(gp,49,16);i++;
        gp.obj[mapNum][i] = new OBJ_Fridge3(gp,50,16);i++;
        gp.obj[mapNum][i] = new OBJ_Fridge2(gp,77,16);i++;
        gp.obj[mapNum][i] = new OBJ_Fridge4(gp,78,16);i++;


        //TRASH

        gp.obj[mapNum][i] = new OBJ_Bath1(gp,64,30);i++;
        gp.obj[mapNum][i] = new OBJ_Garbage1(gp,34,88);i++;
        gp.obj[mapNum][i] = new OBJ_Garbage2(gp,31,69);i++;
        gp.obj[mapNum][i] = new OBJ_Garbage3(gp,27,69);i++;


        //OBJECTS

        gp.obj[mapNum][i] = new OBJ_WarningSign(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 63;
        gp.obj[mapNum][i].worldY = gp.tileSize * 63;
        i++;
        gp.obj[mapNum][i] = new OBJ_Pipes(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 16;
        gp.obj[mapNum][i].worldY = gp.tileSize * 15;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Tent(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 34;
        gp.obj[mapNum][i].worldY = gp.tileSize * 81;
        i++;


        //LEVEL 2
        mapNum =1;
        i=0;
        gp.obj[mapNum][i] = new OBJ_IronDoor(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 89;
        gp.obj[mapNum][i].worldY = gp.tileSize * 48;
        i++;



        //LEVEL 3
        mapNum = 2;
        i=0;
        gp.obj[mapNum][i] = new OBJ_IronDoor(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 98;
        gp.obj[mapNum][i].worldY = gp.tileSize * 57;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_HPPack(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 10;
        gp.obj[mapNum][i].worldY = gp.tileSize * 44;


        //LEVEL 4
        mapNum = 3;
        i=0;
        gp.obj[mapNum][i] = new OBJ_IronDoor(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 98;
        gp.obj[mapNum][i].worldY = gp.tileSize * 48;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_HPPack(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 13;
        gp.obj[mapNum][i].worldY = gp.tileSize * 39;

    }




    public void setInteractiveTile(){
        int mapNum = 0;
        int i =0;
        gp.iTile[mapNum][i] = new IT_Box(gp,54,14);i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,55,14);i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,56,14);i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,54,15);i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,55,15);i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,56,15);i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,19,77);i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,20,76);i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,21,75);i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,28,78);i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,27,78);i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,27,79);i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,46,12);i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,46,13);i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,46,14);

        mapNum = 1;
        i=0;
        gp.iTile[mapNum][i] = new IT_Vase(gp,16,41);i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,17,41);i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,18,41);i++;
        gp.iTile[mapNum][i] = new IT_MetalPlate(gp,11,12);i++;
        gp.iTile[mapNum][i] = new IT_MetalPlate(gp,34,84);i++;
        gp.iTile[mapNum][i] = new IT_MetalPlate(gp,87,59);
    }
    public void setNPC() {
        int mapNum = 0;
        int i =0;
        gp.npc[mapNum][i] = new NPC_Nick(gp,39,83);i++;

        //TREES
        gp.npc[mapNum][i] = new OBJ_Tree1(gp,17,70);i++;
        //LIGHT
        gp.npc[mapNum][i] = new OBJ_CampFire(gp,31,79);i++;
        gp.npc[mapNum][i] = new OBJ_Trashbin(gp,80,19);i++;
        gp.npc[mapNum][i] = new OBJ_Trashbin(gp,63,30);i++;

        mapNum = 1;
        i=0;
        gp.npc[mapNum][i] = new NPC_Ghoul(gp,14,41);

        mapNum = 3;
        i=0;

    }

    public void setEnemy() {


        //LEVEL 1
        int mapNum = 0;
        int i = 0;

        gp.enemy[mapNum][i] = new Bug1(gp,34,82);

        i++;
//        gp.enemy[mapNum][i] = new GreenSlime(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 77;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 82;
//        i++;
//        gp.enemy[mapNum][i] = new GreenSlime(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 78;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 85;
//        i++;
//        gp.enemy[mapNum][i] = new GreenSlime(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 75;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 83;
//        i++;
//        gp.enemy[mapNum][i] = new GreenSlime(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 74;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 83;
//        i++;
//
//        gp.enemy[mapNum][i] = new Punk(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 49;
//        gp.enemy[mapNum][i].worldY = gp.tileSize *13;
//        i++;
//        gp.enemy[mapNum][i] = new Punk(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 50;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 13;
//        i++;
//        gp.enemy[mapNum][i] = new Punk(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 63;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 13;
//        i++;
//        gp.enemy[mapNum][i] = new Punk(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 46;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 28;
//        i++;
//        gp.enemy[mapNum][i] = new Punk(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 47;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 28;
//        i++;
//        gp.enemy[mapNum][i] = new Punk(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 60;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 13;
//        i++;
//        gp.enemy[mapNum][i] = new Punk(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 30;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 18;
//        i++;
//        gp.enemy[mapNum][i] = new Punk(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 30;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 19;
//        i++;
//        gp.enemy[mapNum][i] = new Ghoul(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 75;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 46;
//        i++;
//        gp.enemy[mapNum][i] = new Ghoul(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 69;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 40;
//        i++;
//        gp.enemy[mapNum][i] = new Ghoul(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 78;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 50;
//        i++;
//        gp.enemy[mapNum][i] = new Ghoul(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 69;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 50;
//        i++;
//        gp.enemy[mapNum][i] = new Ghoul(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 70;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 43;
//        i++;
//        gp.enemy[mapNum][i] = new DeathClaw(gp);
//        gp.enemy[mapNum][i].worldX = gp.tileSize * 29;
//        gp.enemy[mapNum][i].worldY = gp.tileSize * 48;




        //LEVEL2

        mapNum =1;
        i=0;
        gp.enemy[mapNum][i] = new Spider(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 35;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 79;
        i++;

        gp.enemy[mapNum][i] = new Bug1(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 10;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 14;
        i++;
        gp.enemy[mapNum][i] = new Bug2(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 13;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 14;
        i++;
        gp.enemy[mapNum][i] = new Bug3(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 15;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 14;

        mapNum =3;
        i=0;
        if(!Progress.slimeBossDefeated) {
            gp.enemy[mapNum][i] = new SlimeBoss(gp);
            gp.enemy[mapNum][i].worldX = gp.tileSize * 52;
            gp.enemy[mapNum][i].worldY = gp.tileSize * 44;
        }
    }
    public void setup(Entity entity, int x, int y){
        entity.worldX = gp.tileSize * x;
        entity.worldY = gp.tileSize * y;
    }

}
