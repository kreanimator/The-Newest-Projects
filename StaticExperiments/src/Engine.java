public class Engine {


    private final EngineType type;
private final double volume;
private final int power;


    public Engine(EngineType type, double volume, int power) {
        this.type = type;
        this.volume = volume;
        this.power = power;
    }
    public EngineType getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }

}
