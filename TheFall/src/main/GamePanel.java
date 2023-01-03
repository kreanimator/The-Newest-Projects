package main;

import entity.Entity;
import entity.Player;
import tile_interactive.InteractiveTile;
import tiles.TileManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class GamePanel extends JPanel implements Runnable {

    //SCREEN SETTINGS
    final int originalTileSize = 16; //16x16 tile
    final int scale = 3;
    public final int tileSize = originalTileSize * scale; //48 x 48 tile
    //How many tiles will be displayed on the screen
    public final int maxScrCol = 16;
    public final int maxScrRow = 12;
    public final int screenWidth = maxScrCol * tileSize;
    public final int screenHeight = maxScrRow * tileSize;

    //WORLD SETTINGS

    public final int maxWorldCol = 100;
    public final int maxWorldRow = 100;


    //FPS

    int FPS = 60;

    //SYSTEM
    TileManager tileM = new TileManager(this);
    public KeyHandler keyH = new KeyHandler(this);
    Sound music = new Sound();
    Sound se = new Sound();

    public CollisionDetector cDetector = new CollisionDetector(this);
    public AssetSetter aSetter = new AssetSetter(this);
    public UI ui = new UI(this);
    public EventHandler eHandler = new EventHandler(this);
    Thread gameThread;
    //ENTITY AND OBJECTS
    public Player player = new Player(this, keyH);
    public Entity[] obj = new Entity[100];
    public Entity[] npc = new Entity[10];
    public Entity[] enemy = new Entity[40];
    public InteractiveTile [] iTile = new InteractiveTile[50];
    public ArrayList <Entity> projectilesList = new ArrayList<>();
    public ArrayList<Entity> particleList = new ArrayList<>();
    ArrayList<Entity> entityList = new ArrayList<>();

    //GAME STATE

    public int gameState;
    public final int titleState = 0;
    public final int playState = 1;
    public final int pauseState = 2;
    public final int dialogState = 3;
    public final int charState = 4;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void setUpGame() {
        aSetter.setObject();
        aSetter.setNPC();
        aSetter.setEnemy();
        aSetter.setInteractiveTile();
        // playMusic(0);
        gameState = titleState;
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / FPS;//0.01666 seconds
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        long drawCount = 0;


        while (gameThread != null) {

            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if (delta >= 1) {
//            1.UPDATE: information such as characters position
                update();
//            2.DRAW: draw the screen with the updated information
                repaint();
                delta--;
                drawCount++;
            }
            if (timer >= 1000000000) {
                drawCount = 0;
                timer = 0;
            }

        }

    }

    public void update() {

        if (gameState == playState) {
            //PLAYER
            player.update();

            //NPC

            for (Entity entity : npc) {
                if (entity != null) {
                    entity.update();
                }
            }

            //ENEMIES
            for (int i = 0; i < enemy.length; i++) {
                if (enemy[i] != null) {
                    if (enemy[i].alive && !enemy[i].dying) {
                        enemy[i].update();
                    }
                    if (!enemy[i].alive) {
                        enemy[i].checkDrop();
                        enemy[i] = null;
                    }
                }
            }

            //PROJECTILES

            for (int i = 0; i < projectilesList.size(); i++) {
                if (projectilesList.get(i) != null) {
                    if (projectilesList.get(i).alive) {
                        projectilesList.get(i).update();
                    }
                    if (!projectilesList.get(i).alive) {
                        projectilesList.remove(i);
                    }
                }
            }
            //PARTICLES
            for (int i = 0; i < particleList.size(); i++) {
                if (particleList.get(i) != null) {
                    if (particleList.get(i).alive) {
                        particleList.get(i).update();
                    }
                    if (!particleList.get(i).alive) {
                        particleList.remove(i);
                    }
                }
            }
            for (int i = 0; i < iTile.length; i++) {
                if (iTile[i] != null) {
                   iTile[i].update();
                }
            }

        }
        if (gameState == pauseState) {


        }


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        //DEBUG

        long drawStart = 0;
        if (keyH.checkDrawTime) {
            drawStart = System.nanoTime();
        }

        //TITLE SCREEN

        if (gameState == titleState) {
            ui.draw(g2);
        }
        //OTHERS
        else {


            // TILE
            tileM.draw(g2);


            //INTERACTIVE TILE
            for (int i = 0; i < iTile.length; i++){
                if(iTile[i] != null){
                    iTile[i].draw(g2);
                }
            }

            //ADD ENTITIES TO THE LIST
            entityList.add(player);
            for (int i = 0; i < npc.length; i++) {
                if (npc[i] != null) {
                    entityList.add(npc[i]);
                }
            }
            for (int i = 0; i < obj.length; i++) {
                if (obj[i] != null) {
                    entityList.add(obj[i]);
                }
            }
            for (int i = 0; i < enemy.length; i++) {
                if (enemy[i] != null) {
                    entityList.add(enemy[i]);
                }
            }
            for (int i = 0; i < projectilesList.size(); i++) {
                if (projectilesList.get(i) != null) {
                    entityList.add(projectilesList.get(i));
                }
            }
            for (int i = 0; i < particleList.size(); i++) {
                if (particleList.get(i) != null) {
                    entityList.add(particleList.get(i));
                }
            }
            // SORT

            entityList.sort(new Comparator<Entity>() {
                @Override
                public int compare(Entity o1, Entity o2) {
                    int result = Integer.compare(o1.worldY, o2.worldY);
                    return result;
                }
            });
            //DRAW ENTITIES

            for (int i = 0; i < entityList.size(); i++) {
                entityList.get(i).draw(g2);
            }
            // EMPTY ENTITY LIST
            entityList.clear();


            ui.draw(g2);
        }

        if (keyH.checkDrawTime) {

            long drawFinish = System.nanoTime();
            long passed = drawFinish - drawStart;
            long x = player.worldX/tileSize;
            long y = player.worldY/tileSize;
            g2.setColor(Color.WHITE);
            g2.drawString("Draw string: " + passed, 10, 400);
            g2.drawString("Player X = " + x, 10, 448);
            g2.drawString("Player Y = " + y, 10, 496);
            System.out.println("Draw time " + passed);
        }
        g2.dispose();
    }

    public void playMusic(int i) {
        music.setFile(i);
        music.play();
        music.loop();
    }

    public void stopMusic() {
        music.stop();
    }

    public void playSE(int i) {
        se.setFile(i);
        se.play();
    }
}
