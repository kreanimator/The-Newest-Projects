public class SportCar extends Car {


    double totalSpeed;

    public SportCar(String carContributor, String carClass, double carWeight, Driver driver, Engine engine, double totalSpeed) {
        super(carContributor, carClass, carWeight, driver, engine);
        this.totalSpeed = totalSpeed;
    }

    public void start() {
        System.out.println("Sportcar go!");
    }
    public void stop() {
        System.out.println("Sportcar stopped!");
    }
    public void printInfo() {
        System.out.print("Sportcar brand: " + carContributor + " " + "\nClass: " + carClass + "\nWeight: " + carWeight
                + "\nEngine power: " + engine.power + "\nEngine contributor: " + engine.contributor
                + "\nMax speed: " + totalSpeed + "\n");
    }
}
