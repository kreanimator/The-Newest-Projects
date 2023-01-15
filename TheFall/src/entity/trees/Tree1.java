package entity.trees;


import entity.Entity;
import main.GamePanel;



public class Tree1 extends Entity {
    GamePanel gp;
    public static final String objName = "Tree1";


    public Tree1(GamePanel gp) {
        super(gp);
        this.gp = gp;
        name = objName;
        speed = 0;
        direction = "down";
        type = typeObstacle;
        collision = true;

        getImage();
        setAction();



        solidArea.x = gp.tileSize+12;
        solidArea.y = gp.tileSize +24;
        solidArea.width = 24;
        solidArea.height = gp.tileSize*2;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

    }
    public void getImage() {
        int width= gp.tileSize *3;
        int height = gp.tileSize * 4;
        up1 = setup("tiles/trees/tree1/1",width,height );
        up2= setup("tiles/trees/tree1/2",width,height );
        up3 = setup("tiles/trees/tree1/3",width,height );
        down1 = setup("tiles/trees/tree1/4",width,height );
        down2 = setup("tiles/trees/tree1/5",width,height );
        down3 = setup("tiles/trees/tree1/6",width,height );
        left1 = setup("tiles/trees/tree1/7",width,height );
        left2 = setup("tiles/trees/tree1/8",width,height );
        left3 = setup("tiles/trees/tree1/9",width,height );
        right1 = setup("tiles/trees/tree1/10",width,height );
        right2 = setup("tiles/trees/tree1/11",width,height );
        right3 = setup("tiles/trees/tree1/12",width,height );
    }

}
