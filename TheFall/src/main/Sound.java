package main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Sound {
    Clip clip;
    URL[] soundURL = new URL[30];

    public Sound() {

        soundURL[0]= getClass().getResource("/resources/sounds/music/Dawn - slow - scary.wav");
        soundURL[1]= getClass().getResource("/resources/sounds/pickup.wav");
        soundURL[2]= getClass().getResource("/resources/sounds/door.wav");
        soundURL[3]= getClass().getResource("/resources/sounds/inventory/coin3.wav");
        soundURL[4]= getClass().getResource("/resources/sounds/swing.wav");
        soundURL[5]= getClass().getResource("/resources/sounds/hitslime.wav");
        soundURL[6]= getClass().getResource("/resources/sounds/locker.wav");
        soundURL[7]= getClass().getResource("/resources/sounds/receivedamage.wav");
        soundURL[8]= getClass().getResource("/resources/sounds/levelup.wav");
        soundURL[9]= getClass().getResource("/resources/sounds/cursor.wav");

    }

    public void setFile(int i){
        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void play(){

        clip.start();

    }
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);

    }
    public void stop(){
        clip.stop();

    }
}
