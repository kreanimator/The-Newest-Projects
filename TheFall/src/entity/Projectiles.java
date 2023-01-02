package entity;

import main.GamePanel;

public class Projectiles extends  Entity{

    Entity user;
    public Projectiles(GamePanel gp) {
        super(gp);
    }

    public void set(int worldX , int worldY, String direction, boolean alive, Entity user ) {
        this.worldX = worldX;
        this.worldY = worldY;
        this.direction = direction;
        this.alive = alive;
        this.user = user;
        this.life = this.maxHP;

    }
        public void update(){
        if(user == gp.player){
            int enemyIndex = gp.cDetector.checkEntity(this,gp.enemy);
            if(enemyIndex != 999){
                gp.player.damageEnemy(enemyIndex,attack);
                alive = false;
            }

        }
        if(user != gp.player ){
            boolean contactPlayer = gp.cDetector.checkPlayer(this);
            if(!gp.player.invincible && contactPlayer){
                damagePlayer(attack);
                alive = false;
            }
        }

        switch (direction){
            case "up" -> worldY -= speed;
            case "down" -> worldY += speed;
            case "left" -> worldX -= speed;
            case "right" -> worldX += speed;
        }
        life--;
        if (life <= 0){
            alive = false;
        }
        spriteCounter ++;

        if(spriteCounter > 12){
            if (spriteNumber == 1){
                spriteNumber =2;
            }else if(spriteNumber ==2){
                spriteNumber = 1;
            }
            spriteCounter = 0;

        }

        }
    public boolean haveResource(Entity user){
        boolean haveResource = false;
        return haveResource;

    }
    public void subtractResource(Entity user){
        if(user.currentWeapon.type == typePistol) {
            user.pistolAmmo -= useCost;
        }
        if(user.currentWeapon.type == typeShotgun) {
            user.shotgunAmmo -= useCost;
        }
    }

}
