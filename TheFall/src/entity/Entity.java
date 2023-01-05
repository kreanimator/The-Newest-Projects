package entity;

import main.GamePanel;
import main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Entity {

    GamePanel gp;
    public BufferedImage image, image2, image3, image4, image5;
    public BufferedImage up1, up2, up3, down1, down2, down3, left1, left2, left3, right1, right2, right3;
    public BufferedImage atkup1, atkup2, atkup3, atkdown1, atkdown2, atkdown3, atkleft1, atkleft2, atkleft3, atkright1, atkright2, atkright3;
    public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
    public Rectangle attackArea = new Rectangle(0, 0, 0, 0);
    public int solidAreaDefaultX, solidAreaDefaultY;
    public boolean collision = false;
    String[] dialogues = new String[20];

    //STATE
    public int worldX, worldY;
    public String direction = "down";
    public int spriteNumber = 1;
    int dialogueIndex = 0;
    public boolean collisionOn = false;
    public boolean invincible = false;
    boolean attacking = false;
    public boolean alive = true;
    public boolean dying = false;
    boolean hpBarOn = false;
    public boolean onPath = false;
    public boolean knockBack = false;


    //COUNTER
    public int spriteCounter = 0;
    public int actionLockCounter = 0;
    public int invincibleCounter = 0;
    public int dyingCounter = 0;
    public int hpBarCounter = 0;
    public int shotAvailableCounter = 0;
    public int knockBackCounter = 0;

    //CHARACTERS ATRIBUTES
    public String name;

    public double speed;
    public int maxHP;
    public int life;
    public int defaultSpeed;
    public int maxAmmo;
    public int pistolAmmo;
    public int shotgunAmmo;
    public int level;
    public int strength;
    public int dexterity;
    public int attack;
    public int defense;
    public int exp;
    public int nextLevel;
    public int coin;
    public Entity currentWeapon;
    public Entity currentArmor;
    public Projectiles projectiles;

    //ITEM ATTRIBUTES
    public ArrayList<Entity> inventory = new ArrayList<>();
    public final int maxInventorySize = 20;
    public int attackValue;
    public int defenseValue;
    public String description = "";
    public int useCost;
    public int value;
    public int price;
    public int knockBackPower;
    public boolean stackable = false;
    public int amount =1;

    //TYPE
    public int type;
    public final int typePlayer = 0;
    public final int typeNPC = 1;
    public final int typeEnemy = 2;
    public final int typeMelee = 3;
    public final int typeWrench = 4;
    public final int typePistol = 5;
    public final int typeShotgun = 6;
    public final int typeArmor = 7;
    public final int typeConsumable = 8;
    public final int typePickupOnly = 9;
    public final int typeObstacle = 10;


    public Entity(GamePanel gp) {
        this.gp = gp;
    }

    public int getLeftX() {
        return worldX + solidArea.x;
    }

    public int getRightX() {
        return worldX + solidArea.x + solidArea.width;
    }

    public int getTopY() {
        return worldY + solidArea.y;
    }

    public int getBottomY() {
        return worldY + solidArea.y + solidArea.height;
    }

    public int getCol() {
        return (worldX + solidArea.x) / gp.tileSize;
    }

    public int getRow() {
        return (worldY + solidArea.y) / gp.tileSize;
    }

    public void setAction() {

    }

    public void damageReaction() {

    }

    public void checkCollision() {
        collisionOn = false;
        gp.cDetector.checkTile(this);
        gp.cDetector.checkObject(this, false);
        gp.cDetector.checkEntity(this, gp.npc);
        gp.cDetector.checkEntity(this, gp.enemy);
        gp.cDetector.checkEntity(this, gp.iTile);
        boolean contactPlayer = gp.cDetector.checkPlayer(this);

        if (this.type == typeEnemy && contactPlayer) {
            damagePlayer(attack);
        }

    }

    public void update() {
        if (knockBack){
            checkCollision();
            if (collisionOn){
                knockBackCounter = 0;
                knockBack = false;
                speed = defaultSpeed;
            } else  {
                switch (gp.player.direction){
                    case "up" -> worldY -= speed;
                    case "down" -> worldY += speed;
                    case "left" -> worldX -= speed;
                    case "right" -> worldX += speed;
                }
                
            }
            knockBackCounter++;
            if (knockBackCounter == 10){
                knockBackCounter =0;
                knockBack = false;
                speed = defaultSpeed;

            }

        }
        else {
            setAction();
            checkCollision();

            //IF COLLISION IS FALSE, ENTITY CAN MOVE

            if (!collisionOn) {
                switch (direction) {
                    case "up" -> worldY -= speed;
                    case "down" -> worldY += speed;
                    case "left" -> worldX -= speed;
                    case "right" -> worldX += speed;
                }
            }
        }


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
        if (invincible) {
            invincibleCounter++;
            if (invincibleCounter > 40) {
                invincible = false;
                invincibleCounter = 0;
            }
        }
        if (shotAvailableCounter < 30) {
            shotAvailableCounter++;
        }


    }

    public void damagePlayer(int attack) {
        if (!gp.player.invincible) {
            gp.playSE(17);
            int damage = attack - gp.player.defense;
            if (damage < 0) {
                damage = 0;
            }
            gp.player.life -= damage;
            gp.player.invincible = true;
        }
    }

    public void playSE() {

    }

    public void speak() {
        if (dialogues[dialogueIndex] == null) {
            dialogueIndex = 0;
        }
        gp.ui.currentDialogue = dialogues[dialogueIndex];
        dialogueIndex++;

        switch (gp.player.direction) {
            case "up" -> direction = "down";
            case "down" -> direction = "up";
            case "left" -> direction = "right";
            case "right" -> direction = "left";
        }
    }

    public void interact() {

    }

    public boolean use(Entity entity) {
        return false;
    }

    public void checkDrop() {

    }

    public void dropItem(Entity droppedItem) {
        for (int i = 0; i < gp.obj[1].length; i++) {
            if (gp.obj[gp.currentMap][i] == null) {
                gp.obj[gp.currentMap][i] = droppedItem;
                gp.obj[gp.currentMap][i].worldX = worldX;
                gp.obj[gp.currentMap][i].worldY = worldY;
                break;
            }
        }
    }

    public Color getParticleColor() {
        Color color = null;
        return color;
    }

    public int getParticleSize() {
        int size = 0;
        return size;
    }

    public int getParticleSpeed() {
        int speed = 0;
        return speed;
    }

    public int getParticleLife() {
        int maxHP = 0;
        return maxHP;
    }

    public void generateParticle(Entity generator, Entity target) {
        Color color = generator.getParticleColor();
        int size = generator.getParticleSize();
        int speed = generator.getParticleSpeed();
        int maxHP = generator.getParticleLife();

        Particles p1 = new Particles(gp, target, color, size, speed, maxHP, -2, -1);
        gp.particleList.add(p1);
        Particles p2 = new Particles(gp, target, color, size, speed, maxHP, 2, 1);
        gp.particleList.add(p2);
        Particles p3 = new Particles(gp, target, color, size, speed, maxHP, 0, -1);
        gp.particleList.add(p3);
        Particles p4 = new Particles(gp, target, color, size, speed, maxHP, -1, 0);
        gp.particleList.add(p4);
        Particles p5 = new Particles(gp, target, color, size, speed, maxHP, 1, 0);
        gp.particleList.add(p5);
        Particles p6 = new Particles(gp, target, color, size, speed, maxHP, 0, 1);
        gp.particleList.add(p6);
        Particles p7 = new Particles(gp, target, color, size, speed, maxHP, -2, 1);
        gp.particleList.add(p7);
        Particles p8 = new Particles(gp, target, color, size, speed, maxHP, 2, -1);
        gp.particleList.add(p8);
    }

    public BufferedImage setup(String imagePath, int width, int height) {
        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;

        try {

            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/resources/" + imagePath + ".png")));
            image = uTool.scaleImage(image, width, height);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;

    }

    public void draw(Graphics2D g2) {
        BufferedImage image = null;

        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;

        switch (direction) {
            case "up" -> {
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
            case "down" -> {
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
            case "left" -> {
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
            case "right" -> {
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
        }

        //Enemy HP bar

        if (type == 2 && hpBarOn) {

            double oneScale = (double) gp.tileSize / maxHP;
            double hpBarValue = oneScale * life;
            g2.setColor(new Color(35, 35, 35));
            g2.fillRect(screenX - 1, screenY - 16, gp.tileSize + 2, 12);
            g2.setColor(new Color(255, 0, 30));
            g2.fillRect(screenX, screenY - 15, (int) hpBarValue, 10);
            hpBarCounter++;
            if (hpBarCounter > 600) {
                hpBarCounter = 0;
                hpBarOn = false;
            }
        }
        if (invincible) {
            hpBarOn = true;
            hpBarCounter = 0;
            changeAlpha(g2, 0.6f);
        }

        if (dying) {
            dyingAnimation(g2);
        }

        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
        changeAlpha(g2, 1f);


    }

    private void dyingAnimation(Graphics2D g2) {
        dyingCounter++;

        int i = 5;
        if (dyingCounter == i) {
            changeAlpha(g2, 0f);
        }
        if (dyingCounter > i && dyingCounter <= i * 2) {
            changeAlpha(g2, 1f);
        }
        if (dyingCounter > i * 2 && dyingCounter <= i * 3) {
            changeAlpha(g2, 0f);
        }
        if (dyingCounter > i * 3 && dyingCounter <= i * 4) {
            changeAlpha(g2, 1f);
        }
        if (dyingCounter > i * 4 && dyingCounter <= i * 5) {
            changeAlpha(g2, 0f);
        }
        if (dyingCounter > i * 5 && dyingCounter <= i * 6) {
            changeAlpha(g2, 1f);
        }
        if (dyingCounter > i * 6 && dyingCounter <= i * 7) {
            changeAlpha(g2, 0f);
        }
        if (dyingCounter > i * 7 && dyingCounter <= i * 8) {
            changeAlpha(g2, 1f);

        }
        if (dyingCounter > i * 8) {
            alive = false;
        }
    }

    public void changeAlpha(Graphics2D g2, float alphaValue) {
        g2.setColor(Color.red);
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alphaValue));
    }

    public int getDetected(Entity user, Entity[][] target, String targetName) {
        int index = 999;
        int nextWorldX = user.getLeftX();
        int nextWorldY = user.getTopY();

        switch (user.direction) {
            case "up":
                nextWorldY = user.getTopY() - 1;
                break;
            case "down":
                nextWorldY = user.getBottomY() + 1;
                break;
            case "left":
                nextWorldX = user.getLeftX() - 1;
                break;
            case "right":
                nextWorldX = user.getRightX() + 1;
                break;
        }
        int col = nextWorldX / gp.tileSize;
        int row = nextWorldY / gp.tileSize;

        for (int i = 0; i < target[1].length; i++) {
            if (target[i] != null) {
                if (target[gp.currentMap][i].getCol() == col &&
                        target[gp.currentMap][i].getRow() == row &&
                        target[gp.currentMap][i].name.equals(targetName)) {
                    index = i;
                    break;
                }
            }
        }
        return index;

    }

    public void searchPath(int goalCol, int goalRow) {
        int startCol = (worldX + solidArea.x) / gp.tileSize;
        int startRow = (worldY + solidArea.y) / gp.tileSize;
        gp.pFinder.setNode(startCol, startRow, goalCol, goalRow, this);
        if (gp.pFinder.search()) {

            //NEXT WORLDX & WORLDY
            int nextX = gp.pFinder.pathList.get(0).col * gp.tileSize;
            int nextY = gp.pFinder.pathList.get(0).row * gp.tileSize;


            //Entities solid area position

            int enLeftX = worldX + solidArea.x;
            int enRightX = worldX + solidArea.x + solidArea.width;
            int enTopY = worldY + solidArea.y;
            int enBottomY = worldY + solidArea.y + solidArea.height;

            if (enTopY > nextY && enLeftX >= nextX && enRightX < nextX + gp.tileSize) {
                direction = "up";
            } else if (enTopY < nextY && enLeftX >= nextX && enRightX < nextX + gp.tileSize) {
                direction = "down";
            } else if (enTopY >= nextY && enBottomY < nextY + gp.tileSize) {
                //left or right
                if (enLeftX > nextX) {
                    direction = "left";
                } else {
                    direction = "right";
                }
            } else if (enTopY > nextY && enLeftX > nextX) {
                //up or left
                direction = "up";
                checkCollision();
                if (collisionOn) {
                    direction = "left";
                }
            } else if (enTopY > nextY && enLeftX < nextX) {
                //up or right
                direction = "up";
                checkCollision();
                if (collisionOn) {
                    direction = "right";
                }
            } else if (enTopY < nextY && enLeftX > nextX) {
                //down or left
                direction = "down";
                checkCollision();
                if (collisionOn) {
                    direction = "left";
                }
            } else if (enTopY < nextY && enLeftX < nextX) {
                //down or right
                direction = "down";
                checkCollision();
                if (collisionOn) {
                    direction = "right";
                }

            }
            //If reaches the goal , stop the search
//            int nextCol = gp.pFinder.pathList.get(0).col;
//            int nextRow = gp.pFinder.pathList.get(0).row;
//            if(nextCol ==goalCol && nextRow == goalRow){
//                onPath = false;
//            }
        }

    }
}
