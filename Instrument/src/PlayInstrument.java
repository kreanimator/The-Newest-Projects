public abstract class PlayInstrument implements Instrument{
    public static void main(String[] args) {
        Instrument [] musicTools = new Instrument[6];
        musicTools[0] = new Guitar(6);
        musicTools[1] = new Guitar(7);
        musicTools[2] = new Drum(24);
        musicTools[3] = new Drum(48);
        musicTools[4] = new Pipe(12);
        musicTools[5] = new Pipe(38);

        // for (int i = 0; i < musicTools.length; i++) {
//            Instrument a = musicTools[i]();
//            a.play();

        for ( Instrument obj : musicTools){
            obj.play();
        }
    }
}
