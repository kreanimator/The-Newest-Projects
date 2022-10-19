public class Drum implements Instrument {

    int size;

    Drum (int size){
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println( "A " + size + " size drum is playing.");

    }
}
