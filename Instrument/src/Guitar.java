public class Guitar implements Instrument {

    int stringQuantity;

    Guitar (int stringQuantity){
        this.stringQuantity = stringQuantity;
    }

    @Override
    public void play() {
        System.out.println("A " + stringQuantity+ " guitar is playing.");

    }
}
