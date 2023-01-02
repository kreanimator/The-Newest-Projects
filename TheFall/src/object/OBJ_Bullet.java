package object;

import entity.Entity;
import entity.Projectiles;
import main.GamePanel;

public class OBJ_Bullet extends Projectiles {

    GamePanel gp;
    public OBJ_Bullet(GamePanel gp) {
        super(gp);
        this.gp = gp;

        name = "Bullet";
        speed = 10;
        maxHP = 80;
        life = maxHP;
        attack = 3;
        useCost = 1;
        alive = false;
        getImage();



    }



    public void getImage(){
        up1 = setup("objects/bullet/bulletup",gp.tileSize,gp.tileSize);
        up2 = setup("objects/bullet/bulletup",gp.tileSize,gp.tileSize);
        down1 = setup("objects/bullet/bulletdown",gp.tileSize,gp.tileSize);
        down2 = setup("objects/bullet/bulletdown",gp.tileSize,gp.tileSize);
        left1 = setup("objects/bullet/bulletleft",gp.tileSize,gp.tileSize);
        left2 = setup("objects/bullet/bulletleft",gp.tileSize,gp.tileSize);
        right1  = setup("objects/bullet/bulletright",gp.tileSize,gp.tileSize);
        right2 = setup("objects/bullet/bulletright",gp.tileSize,gp.tileSize);
    }

    public boolean haveResource(Entity user){
        boolean haveResource = false;
        if(user.pistolAmmo >= useCost || user.shotgunAmmo >= useCost){
            haveResource = true;
        }
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
