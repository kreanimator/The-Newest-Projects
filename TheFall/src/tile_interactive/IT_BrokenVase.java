package tile_interactive;

import main.GamePanel;

public class IT_BrokenVase extends InteractiveTile{

    public IT_BrokenVase(GamePanel gp, int col, int row) {
        super(gp, col, row);
        this.gp = gp;

        this.worldX = gp.tileSize * col;
        this.worldY = gp.tileSize * row;

        down1=(setup("objects/interactiveobjects/brokenvase",gp.tileSize,gp.tileSize));
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 0;
        solidArea.height = 0;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        destructible=false;
    }
    public void playSE(){

    }
    public InteractiveTile getDestroyedForm(){
        InteractiveTile tile = null;
        return tile;

    }
}
