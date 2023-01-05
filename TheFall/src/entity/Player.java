package entity;

import main.GamePanel;
import main.KeyHandler;
import object.armor.OBJ_Armor_Learther;
import object.misc.OBJ_HPPack;
import object.weapon.*;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;
    public final int screenX;
    public final int screenY;
    public boolean attackCanceled = false;


    public Player(GamePanel gp, KeyHandler keyH) {
        super(gp);
        this.gp = gp;
        this.keyH = keyH;

        screenX = gp.screenWidth / 2 - (gp.tileSize / 2);
        screenY = gp.screenHeight / 2 - (gp.tileSize / 2);

        solidArea = new Rectangle();
        solidArea.x = 21;
        solidArea.y = 21;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = gp.tileSize / 2;
        solidArea.height = gp.tileSize / 2;


        setDefaultValues();
        getPlayerAtkImage();
        getPlayerImage();
        setItems();
    }

    public void setDefaultValues() {


        worldX = gp.tileSize * 26;
        worldY = gp.tileSize * 82;
//        worldX = gp.tileSize * 2;
//        worldY = gp.tileSize * 47;
        defaultSpeed = 4;
        speed = defaultSpeed;

        direction = "down";
//PLAYER STATUS
        level = 1;
        strength = 1;
        dexterity = 1;
        exp = 0;
        nextLevel = 100;
        coin = 0;
        currentWeapon = new OBJ_Melee_Bat_normal(gp);
        currentArmor = new OBJ_Armor_Learther(gp);


        attack = getAttack();
        defense = getDefense();
        maxHP = 6;
        life = maxHP;
        maxAmmo = 10;
        pistolAmmo = 5;
        shotgunAmmo = 3;
    }

    public void setItems() {
        inventory.clear();
        inventory.add(currentWeapon);
        inventory.add(currentArmor);
//        inventory.add(new OBJ_Key(gp));
        inventory.add(new OBJ_Wrench(gp));
//      inventory.add(new OBJ_Shotgun(gp));
//      inventory.add(new OBJ_Pistol(gp));
//        inventory.add(new OBJ_Armor_Metal(gp));
//        inventory.add(new OBJ_Ammo_Pistol(gp));
//        inventory.add(new OBJ_Ammo_Shotgun(gp));
//        inventory.add(new OBJ_Lockpick(gp));
//        inventory.add(new OBJ_KeyCard(gp));
        inventory.add(new OBJ_HPPack(gp));

    }

    public void setDefaultPositions() {
        worldX = gp.tileSize * 26;
        worldY = gp.tileSize * 82;
        direction = "down";
    }

    public void restoreLife() {
        life = maxHP;
        invincible = false;
    }


    public void getPlayerImage() {
        up1 = setup("player/up1", gp.tileSize, gp.tileSize);
        up2 = setup("player/up2", gp.tileSize, gp.tileSize);
        up3 = setup("player/up3", gp.tileSize, gp.tileSize);
        down1 = setup("player/down1", gp.tileSize, gp.tileSize);
        down2 = setup("player/down2", gp.tileSize, gp.tileSize);
        down3 = setup("player/down3", gp.tileSize, gp.tileSize);
        left1 = setup("player/left1", gp.tileSize, gp.tileSize);
        left2 = setup("player/left2", gp.tileSize, gp.tileSize);
        left3 = setup("player/left3", gp.tileSize, gp.tileSize);
        right1 = setup("player/right1", gp.tileSize, gp.tileSize);
        right2 = setup("player/right2", gp.tileSize, gp.tileSize);
        right3 = setup("player/right3", gp.tileSize, gp.tileSize);
    }

    public void getPlayerAtkImage() {

        if (currentWeapon.type == typeMelee) {
            atkup1 = setup("player/attack/atkup1", gp.tileSize, (gp.tileSize * 2));
            atkup2 = setup("player/attack/atkup2", gp.tileSize, (gp.tileSize * 2));
            atkup3 = setup("player/attack/atkup3", gp.tileSize, (gp.tileSize * 2));
            atkdown1 = setup("player/attack/atkdown1", gp.tileSize, (gp.tileSize * 2));
            atkdown2 = setup("player/attack/atkdown2", gp.tileSize, (gp.tileSize * 2));
            atkdown3 = setup("player/attack/atkdown3", gp.tileSize, (gp.tileSize * 2));
            atkleft1 = setup("player/attack/atkleft1", (gp.tileSize * 2), gp.tileSize);
            atkleft2 = setup("player/attack/atkleft2", (gp.tileSize * 2), gp.tileSize);
            atkleft3 = setup("player/attack/atkleft3", (gp.tileSize * 2), gp.tileSize);
            atkright1 = setup("player/attack/atkright1", (gp.tileSize * 2), gp.tileSize);
            atkright2 = setup("player/attack/atkright2", (gp.tileSize * 2), gp.tileSize);
            atkright3 = setup("player/attack/atkright3", (gp.tileSize * 2), gp.tileSize);

        }
        if (currentWeapon.type == typeWrench) {
            atkup1 = setup("player/attack/atkwrenchup1", gp.tileSize, (gp.tileSize * 2));
            atkup2 = setup("player/attack/atkwrenchup2", gp.tileSize, (gp.tileSize * 2));
            atkup3 = setup("player/attack/atkwrenchup3", gp.tileSize, (gp.tileSize * 2));
            atkdown1 = setup("player/attack/atkwrenchdown1", gp.tileSize, (gp.tileSize * 2));
            atkdown2 = setup("player/attack/atkwrenchdown2", gp.tileSize, (gp.tileSize * 2));
            atkdown3 = setup("player/attack/atkwrenchdown3", gp.tileSize, (gp.tileSize * 2));
            atkleft1 = setup("player/attack/atkwrenchleft1", (gp.tileSize * 2), gp.tileSize);
            atkleft2 = setup("player/attack/atkwrenchleft2", (gp.tileSize * 2), gp.tileSize);
            atkleft3 = setup("player/attack/atkwrenchleft3", (gp.tileSize * 2), gp.tileSize);
            atkright1 = setup("player/attack/atkwrenchright1", (gp.tileSize * 2), gp.tileSize);
            atkright2 = setup("player/attack/atkwrenchright2", (gp.tileSize * 2), gp.tileSize);
            atkright3 = setup("player/attack/atkwrenchright3", (gp.tileSize * 2), gp.tileSize);
        }
        if (currentWeapon.type == typePistol) {
            atkup1 = setup("player/rangedAttack/pistolup1", gp.tileSize, (gp.tileSize * 2));
            atkup2 = setup("player/rangedAttack/pistolup2", gp.tileSize, (gp.tileSize * 2));
            atkup3 = setup("player/rangedAttack/pistolup3", gp.tileSize, (gp.tileSize * 2));
            atkdown1 = setup("player/rangedAttack/pistoldown1", gp.tileSize, (gp.tileSize * 2));
            atkdown2 = setup("player/rangedAttack/pistoldown2", gp.tileSize, (gp.tileSize * 2));
            atkdown3 = setup("player/rangedAttack/pistoldown3", gp.tileSize, (gp.tileSize * 2));
            atkleft1 = setup("player/rangedAttack/pistolleft1", (gp.tileSize * 2), gp.tileSize);
            atkleft2 = setup("player/rangedAttack/pistolleft2", (gp.tileSize * 2), gp.tileSize);
            atkleft3 = setup("player/rangedAttack/pistolleft3", (gp.tileSize * 2), gp.tileSize);
            atkright1 = setup("player/rangedAttack/pistolright1", (gp.tileSize * 2), gp.tileSize);
            atkright2 = setup("player/rangedAttack/pistolright2", (gp.tileSize * 2), gp.tileSize);
            atkright3 = setup("player/rangedAttack/pistolright3", (gp.tileSize * 2), gp.tileSize);
        }
        if (currentWeapon.type == typeShotgun) {
            atkup1 = setup("player/rangedAttack/shotgunup1", gp.tileSize, (gp.tileSize * 2));
            atkup2 = setup("player/rangedAttack/shotgunup2", gp.tileSize, (gp.tileSize * 2));
            atkup3 = setup("player/rangedAttack/shotgunup3", gp.tileSize, (gp.tileSize * 2));
            atkdown1 = setup("player/rangedAttack/shotgundown1", gp.tileSize, (gp.tileSize * 2));
            atkdown2 = setup("player/rangedAttack/shotgundown2", gp.tileSize, (gp.tileSize * 2));
            atkdown3 = setup("player/rangedAttack/shotgundown3", gp.tileSize, (gp.tileSize * 2));
            atkleft1 = setup("player/rangedAttack/shotgunleft1", (gp.tileSize * 2), gp.tileSize);
            atkleft2 = setup("player/rangedAttack/shotgunleft2", (gp.tileSize * 2), gp.tileSize);
            atkleft3 = setup("player/rangedAttack/shotgunleft3", (gp.tileSize * 2), gp.tileSize);
            atkright1 = setup("player/rangedAttack/shotgunright1", (gp.tileSize * 2), gp.tileSize);
            atkright2 = setup("player/rangedAttack/shotgunright2", (gp.tileSize * 2), gp.tileSize);
            atkright3 = setup("player/rangedAttack/shotgunright3", (gp.tileSize * 2), gp.tileSize);
        }
    }

    public void update() {

        if (attacking) {
            attacking();

        } else if (keyH.upPressed || keyH.downPressed || keyH.leftPressed || keyH.rightPressed || keyH.ePressed) {
            if (keyH.upPressed) {
                direction = "up";

            }
            if (keyH.downPressed) {
                direction = "down";

            }
            if (keyH.leftPressed) {
                direction = "left";

            }
            if (keyH.rightPressed) {
                direction = "right";

            }

            // CHECK TILE COLLISION

            collisionOn = false;
            gp.cDetector.checkTile(this);

            // CHECK INTERACTIVE TILES COLLISION

            gp.cDetector.checkEntity(this, gp.iTile);


            // CHECK OBJECT COLLISION
            int objIndex = gp.cDetector.checkObject(this, true);
            pickUp(objIndex);

            //CHECK NPC COLLISION
            int npcIndex = gp.cDetector.checkEntity(this, gp.npc);
            interactNPC(npcIndex);

            //CHECK ENEMY COLLISION
            int enemyIndex = gp.cDetector.checkEntity(this, gp.enemy);
            contactEnemy(enemyIndex);

            //CHECK EVENT

            gp.eHandler.checkEvent();
            //SETTING WEAPON TYPE AND AMMO
            if (currentWeapon.type ==typePistol) {
                projectiles = new OBJ_Bullet(gp);
            }
            if (currentWeapon.type ==typeShotgun) {
                projectiles = new OBJ_ShotgunBullet(gp);
            }


            //IF COLLISION IS FALSE, PLAYER CAN MOVE

            if (!collisionOn && !keyH.ePressed) {
                switch (direction) {
                    case "up" -> worldY -= speed;
                    case "down" -> worldY += speed;
                    case "left" -> worldX -= speed;
                    case "right" -> worldX += speed;
                }
            }

            if (keyH.ePressed && !attackCanceled) {
                if (currentWeapon.type == typeMelee || currentWeapon.type == typeWrench) {
                    gp.playSE(4);
                    attacking = true;
                    spriteCounter++;
                }
            }
            gp.keyH.ePressed = false;
            attackCanceled = false;

            spriteCounter++;
            if (spriteCounter > 12) {
                if (spriteNumber == 1) {
                    spriteNumber = 2;
                } else if (spriteNumber == 2) {
                    spriteNumber = 3;
                } else if (spriteNumber == 3) {
                    spriteNumber = 1;
                }
                spriteCounter = 0;
            }
        }
        if (gp.keyH.shotKeyPressed && !projectiles.alive && shotAvailableCounter == 30
                && projectiles.haveResource(this) ) {
            //SET DEFAULT BULLET POSITION
            projectiles.set(worldX, worldY, direction, true, this);
//            if (currentWeapon.type == typePistol) {
//                projectiles.attack = 5;
//            }
//            if (currentWeapon.type == typeShotgun) {
//                projectiles.attack = 8;
//            }
            //SUBTRACT THE COST
            projectiles.subtractResource(this);

            //ADD IT TO THE LIST
//
//            gp.projectilesList.add(projectiles);

            //CHECK IF SLOT IS VACANT

            for (int i = 0; i < gp.projectile.length; i++) {
                if (gp.projectile[gp.currentMap][i] == null) {
                    gp.projectile[gp.currentMap][i] = projectiles;
                    break;
                }
            }
            shotAvailableCounter = 0;
            if (currentWeapon.type == typePistol) {
                gp.playSE(12);

            }
            if (currentWeapon.type == typeShotgun) {
                gp.playSE(13);
            }

        }
        if (invincible) {
            invincibleCounter++;
            if (invincibleCounter > 60) {
                invincible = false;
                invincibleCounter = 0;
            }
        }
        if (shotAvailableCounter < 30) {
            shotAvailableCounter++;
        }
        if (pistolAmmo > maxAmmo) {
            pistolAmmo = maxAmmo;
        }
        if (shotgunAmmo > maxAmmo) {
            shotgunAmmo = maxAmmo;
        }
        if (life > maxHP) {
            life = maxHP;
        }
        if (life <= 0) {
            gp.gameState = gp.gameOverState;
            gp.ui.commandNumber = -1;
            gp.stopMusic();
            gp.playSE(19);
        }

    }

    private int getDefense() {
        return defense = dexterity * currentArmor.defenseValue;
    }

    private int getAttack() {

        attackArea = currentWeapon.attackArea;
        return attack = strength * currentWeapon.attackValue;
    }

    private void attacking() {

        spriteCounter++;
        if (spriteCounter <= 5) {
            spriteNumber = 1;
        }
        if (spriteCounter > 5 && spriteCounter < 13) {
            spriteNumber = 2;

            //Save current worldX, worldY, solidArea
            int currentWorldX = worldX;
            int currentWorldY = worldY;
            int solidAreaWidth = solidArea.width;
            int solidAreaHeight = solidArea.height;

            //Adjust player's worldX/Y for the attack

            switch (direction) {
                case "up" -> worldY -= attackArea.height;
                case "down" -> worldY += attackArea.height;
                case "left" -> worldX -= attackArea.width;
                case "right" -> worldX += attackArea.width;
            }
            //attackArea becomes solid area
            solidArea.width = attackArea.width;
            solidArea.height = attackArea.height;
            //Check enemy collision with the updated worldX , worldT, solidArea
            int enemyIndex = gp.cDetector.checkEntity(this, gp.enemy);
            damageEnemy(enemyIndex, attack,currentWeapon.knockBackPower);
            //After checking collision restore original data
            int iTileIndex = gp.cDetector.checkEntity(this, gp.iTile);
            damageInteractiveTile(iTileIndex);
            int projectileIndex = gp.cDetector.checkEntity(this,gp.projectile);
            damageProjectile(projectileIndex);
            worldX = currentWorldX;
            worldY = currentWorldY;
            solidArea.width = solidAreaWidth;
            solidArea.height = solidAreaHeight;
        }
        if (spriteCounter > 13 && spriteCounter < 25) {
            spriteNumber = 3;
        }
        if (spriteCounter > 13) {
            spriteNumber = 1;
            spriteCounter = 0;
            attacking = false;
        }
    }

    private void damageProjectile(int i) {
        if(i != 999){
            Entity projectile = gp.projectile[gp.currentMap][i];
            projectile.alive = false;
            generateParticle(projectile,projectile);
        }
    }

    private void damageInteractiveTile(int i) {
        if (i != 999 && gp.iTile[gp.currentMap][i].destructible && gp.iTile[gp.currentMap][i].isCorrectItem(this) && !gp.iTile[gp.currentMap][i].invincible) {

            gp.iTile[gp.currentMap][i].life--;
            gp.iTile[gp.currentMap][i].invincible = true;
            //Generate particle
            generateParticle(gp.iTile[gp.currentMap][i], gp.iTile[gp.currentMap][i]);
            if (gp.iTile[gp.currentMap][i].life == 0) {
                gp.iTile[gp.currentMap][i].playSE();
                gp.iTile[gp.currentMap][i] = gp.iTile[gp.currentMap][i].getDestroyedForm();
            }


        }
    }


    public void pickUp(int i) {

        String text;

        if (i != 999) {

            //PICKUP ONLY ITEMS
            if (gp.obj[gp.currentMap][i].type == typePickupOnly) {
                gp.obj[gp.currentMap][i].use(this);
                gp.obj[gp.currentMap][i] = null;
            }

            //OBSTACLES
            else if (gp.obj[gp.currentMap][i].type == typeObstacle) {
                if (keyH.ePressed) {
                    attackCanceled = true;

                    gp.obj[gp.currentMap][i].interact();
                }
            }

            //INVENTORY ITEMS
            else {
                if (canObtainItem(gp.obj[gp.currentMap][i])) {
                    gp.playSE(1);
                    text = " Got a " + gp.obj[gp.currentMap][i].name + "!";
                } else {
                    text = "Inventory is full!";
                }
                gp.ui.addMessage(text);
                gp.obj[gp.currentMap][i] = null;
            }
        }


    }

    public void interactNPC(int i) {
        if (gp.keyH.ePressed) {
            if (i != 999) {
                attackCanceled = true;

                gp.gameState = gp.dialogState;
                gp.npc[gp.currentMap][i].speak();
            }

        }

    }

    private void contactEnemy(int i) {
        if (i != 999) {
            if (!invincible && !gp.enemy[gp.currentMap][i].dying) {
                gp.playSE(17);
                int damage = gp.enemy[gp.currentMap][i].attack - defense;
                if (damage < 0) {
                    damage = 0;
                }
                life -= damage;
                invincible = true;
            }

        }
    }

    void damageEnemy(int i, int attack, int knockBackPower) {

        if (i != 999) {
            if (!gp.enemy[gp.currentMap][i].invincible) {
                gp.enemy[gp.currentMap][i].playSE();
                if (knockBackPower > 0) {
                    knockBack(gp.enemy[gp.currentMap][i],knockBackPower);
                }


                int damage = attack - gp.enemy[gp.currentMap][i].defense;
                if (damage < 0) {
                    damage = 0;
                }
                gp.enemy[gp.currentMap][i].life -= damage;
                gp.ui.addMessage(String.valueOf(damage + " damage!"));
                gp.enemy[gp.currentMap][i].invincible = true;
                generateParticle(gp.player.currentWeapon, gp.enemy[gp.currentMap][i]);
                gp.enemy[gp.currentMap][i].damageReaction();

                if (gp.enemy[gp.currentMap][i].life <= 0) {
                    gp.enemy[gp.currentMap][i].dying = true;
                    gp.ui.addMessage("Killed " + gp.enemy[gp.currentMap][i].name + "!");
                    gp.ui.addMessage("Exp " + gp.enemy[gp.currentMap][i].exp + "!");
                    exp += gp.enemy[gp.currentMap][i].exp;
                    checkLevelUp();
                }
            }

        }
    }

    private void checkLevelUp() {
        if (exp >= nextLevel) {
            level++;
            nextLevel = nextLevel * 2;
            maxHP += 2;
            strength++;
            dexterity++;
            attack = getAttack();
            defense = getDefense();
            gp.playSE(8);
            gp.ui.addMessage("Congratulations you got level " + level);
        }
    }

    public void selectItem() {
        int itemIndex = gp.ui.getItemIndex(gp.ui.playerSlotCol, gp.ui.playerSlotRow);
        if (itemIndex < inventory.size()) {
            Entity selectedItem = inventory.get(itemIndex);
            if (selectedItem.type == typeMelee || selectedItem.type == typeWrench) {
                currentWeapon = selectedItem;
                attack = getAttack();
                getPlayerAtkImage();
            }
            if (selectedItem.type == typePistol || selectedItem.type == typeShotgun) {
                currentWeapon = selectedItem;
                attack = getAttack();
                getPlayerAtkImage();
            }
            if (selectedItem.type == typeArmor) {
                currentArmor = selectedItem;
                defense = getDefense();
            }
            if (selectedItem.type == typeConsumable) {
                if (selectedItem.use(this)) {
                    if(selectedItem.amount >1){
                        selectedItem.amount--;
                    }else {
                        inventory.remove(itemIndex);
                    }
                }
                //later
            }
        }
    }
    public void knockBack(Entity entity , int knockBackPower){

        entity.direction = direction;
        entity.speed += knockBackPower;
        entity.knockBack = true;

    }
    public int searchItemInInventory(String itemName){
        int itemIndex = 999;
        for(int i =0; i < inventory.size(); i ++){
            if (inventory.get(i).name.equals(itemName)){
                itemIndex = i;
                break;
            }
        }
        return itemIndex;
    }
    public boolean canObtainItem(Entity item){
        boolean canObtain = false;
        //CHECK IF STACKABLE

        if(item.stackable){
            int index = searchItemInInventory(item.name);
            if (index !=999){
                inventory.get(index).amount ++;
                canObtain = true;
                //New ITEM need to find if slot is vacant
            }else{
                if(inventory.size() != maxInventorySize){
                    inventory.add(item);
                    canObtain = true;
                }

            }
        }
        else { //NOT STACKABLE
            if(inventory.size() != maxInventorySize){
                inventory.add(item);
                canObtain = true;
            }
        }
        return canObtain;

    }

    public void draw(Graphics2D g2) {

        BufferedImage image = null;
        int tempScreenX = screenX;
        int tempScreenY = screenY;

        switch (direction) {
            case "up" -> {
                if (!attacking) {
                    if (spriteNumber == 1) {
                        image = up1;
                    }
                    if (spriteNumber == 2) {
                        image = up2;
                    }
                    if (spriteNumber == 3) {
                        image = up3;
                    }
                }
                if (attacking) {
                    tempScreenY = screenY - gp.tileSize;
                    if (spriteNumber == 1) {
                        image = atkup1;
                    }
                    if (spriteNumber == 2) {
                        image = atkup2;
                    }
                    if (spriteNumber == 3) {
                        image = atkup3;
                    }
                }
            }
            case "down" -> {
                if (!attacking) {
                    if (spriteNumber == 1) {
                        image = down1;
                    }
                    if (spriteNumber == 2) {
                        image = down2;
                    }
                    if (spriteNumber == 3) {
                        image = down3;
                    }
                }
                if (attacking) {

                    if (spriteNumber == 1) {
                        image = atkdown1;
                    }
                    if (spriteNumber == 2) {
                        image = atkdown2;
                    }
                    if (spriteNumber == 3) {
                        image = atkdown3;
                    }
                }
            }
            case "left" -> {
                if (!attacking) {

                    if (spriteNumber == 1) {
                        image = left1;
                    }
                    if (spriteNumber == 2) {
                        image = left2;
                    }
                    if (spriteNumber == 3) {
                        image = left3;
                    }
                }
                if (attacking) {
                    tempScreenX = screenX - gp.tileSize;
                    if (spriteNumber == 1) {
                        image = atkleft1;
                    }
                    if (spriteNumber == 2) {
                        image = atkleft2;
                    }
                    if (spriteNumber == 3) {
                        image = atkleft3;
                    }
                }
            }
            case "right" -> {
                if (!attacking) {
                    if (spriteNumber == 1) {
                        image = right1;
                    }
                    if (spriteNumber == 2) {
                        image = right2;
                    }
                    if (spriteNumber == 3) {
                        image = right3;
                    }
                }
                if (attacking) {
                    if (spriteNumber == 1) {
                        image = atkright1;
                    }
                    if (spriteNumber == 2) {
                        image = atkright2;
                    }
                    if (spriteNumber == 3) {
                        image = atkright3;
                    }
                }
                if (invincible) {
                    g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
                }
            }

        }
        g2.drawImage(image, tempScreenX, tempScreenY, null);
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
    }

}

