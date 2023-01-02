package tile_interactive;

import main.GamePanel;

public class IT_Box extends InteractiveTile{

    GamePanel gp;
    public IT_Box(GamePanel gp) {
        super(gp);
        this.gp = gp;

        down1=(setup("objects/interactiveobjects/destructiblebox",gp.tileSize,gp.tileSize));
        destructible=true;
    }
}
