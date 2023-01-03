package entity;

import main.GamePanel;
import main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
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


    //COUNTER
    public int spriteCounter = 0;
    public int actionLockCounter = 0;
    public int invincibleCounter = 0;
    public int dyingCounter = 0;
    public int hpBarCounter = 0;
    public int shotAvailableCounter = 0;

    //CHARACTERS ATRIBUTES
    public String name;

    public double speed;
    public int maxHP;
    public int life;
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

    public int attackValue;
    public int defenseValue;
    public String description = "";
    public int useCost;
    public int value;

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




    public Entity(GamePanel gp) {
        this.gp = gp;
    }

    public void setAction() {

    }

    public void damageReaction() {

    }

    public void update() {
        setAction();
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



        //IF COLLISION IS FALSE, ENTITY CAN MOVE

        if (!collisionOn) {
            switch (direction) {
                case "up" -> worldY -= speed;
                case "down" -> worldY += speed;
                case "left" -> worldX -= speed;
                case "right" -> worldX += speed;
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

    public void damagePlayer(int attack){
        if (!gp.player.invincible) {
            gp.playSE(17);
            int damage = attack - gp.player.defense;
            if (damage < 0){
                damage = 0;
            }
            gp.player.life -= damage;
            gp.player.invincible = true;
        }
    }
    public void playSE(){

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
    public void use(Entity entity){

    }
    public void checkDrop(){

    }
    public void dropItem(Entity droppedItem){
        for (int i = 0; i<gp.obj.length;i++){
            if(gp.obj[i] == null){
                gp.obj[i] = droppedItem;
                gp.obj[i].worldX = worldX;
                gp.obj[i].worldY = worldY;
                break;
            }
        }
    }
    public Color getParticleColor(){
        Color color = null;
        return color;
    }
    public int getParticleSize(){
        int size = 0;
        return size;
    }
    public int getParticleSpeed(){
        int speed = 0;
        return speed;
    }
    public int getParticleLife(){
        int maxHP = 0;
        return maxHP;
    }
    public void generateParticle(Entity generator, Entity target){
        Color color = generator.getParticleColor();
        int size = generator.getParticleSize();
        int speed = generator.getParticleSpeed();
        int maxHP = generator.getParticleLife();

        Particles p1 = new Particles(gp, target, color,size,speed,maxHP,-2,-1);
        gp.particleList.add(p1);
        Particles p2 = new Particles(gp, target, color,size,speed,maxHP,2,1);
        gp.particleList.add(p2);
        Particles p3 = new Particles(gp, target, color,size,speed,maxHP,0,-1);
        gp.particleList.add(p3);
        Particles p4 = new Particles(gp, target, color,size,speed,maxHP,-1,0);
        gp.particleList.add(p4);
        Particles p5 = new Particles(gp, target, color,size,speed,maxHP,1,0);
        gp.particleList.add(p5);
        Particles p6 = new Particles(gp, target, color,size,speed,maxHP,0,1);
        gp.particleList.add(p6);
        Particles p7 = new Particles(gp, target, color,size,speed,maxHP,-2,1);
        gp.particleList.add(p7);
        Particles p8 = new Particles(gp, target, color,size,speed,maxHP,2,-1);
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

}