public class Pipe implements Instrument {

    int diameter;

    Pipe (int diameter){
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("A " + diameter + " diameter pipe is playing.");

    }
}
