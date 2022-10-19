public class Lorry extends Car {


    double totalWeight;

    public Lorry(String carContributor, String carClass, double carWeight, Driver driver, Engine engine, double totalWeight) {
        super(carContributor, carClass, carWeight, driver, engine);
        this.totalWeight = totalWeight;
    }
    public void start() {
        System.out.println("Lorry run!");
    }
    public void stop() {
        System.out.println("Lorry stopped!");
    }
    public void printInfo() {
        System.out.print("Lorry brand: " + carContributor + " " + "\nClass: " + carClass + "\nWeight: " + carWeight +
                "\nEngine power: " + engine.power +
                "\nEngine contributor: " + engine.contributor + "\nTotal weight: " + totalWeight);
    }
}
