public class Car {

    private final Engine engine;
private final CarType type;
private final int weight;


    public Car(Engine engine, CarType type, int weight) {
        this.engine = engine;
        this.type = type;
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public CarType getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }



}
