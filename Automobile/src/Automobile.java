public class Automobile {
    public static void main(String[] args) {

        Driver bmwDriver = new Driver("Elvis Presley", 50, 30);
        Engine bmwEngine = new Engine(300, "BMW");

        Car bmw = new Car("BMW", "C", 5000, bmwDriver, bmwEngine);
        bmw.printInfo();
        bmwDriver.PersonTalk();
        bmwDriver.drivingStage();
        bmwDriver.PersonMove();

        bmw.start();
        bmw.stop();
        bmw.turnLeft();
        bmw.turnRight();
        System.out.println();

        Driver lorryDriver = new Driver("Boris Razor", 45, 20);
        Engine lorryEngine = new Engine(120, "LorryEngine");
        Lorry lorry = new Lorry("Lorry", "D", 8000, lorryDriver, lorryEngine, 7000);
        lorry.printInfo();
        lorryDriver.PersonTalk();
        lorryDriver.drivingStage();
        lorryDriver.PersonMove();
        lorry.start();
        lorry.stop();
        lorry.turnLeft();
        lorry.turnRight();
        System.out.println();

        Driver sportDriver = new Driver("Johny Cash", 30, 15);
        Engine sportEngine = new Engine(800, "Ferrari");
        SportCar sportCar = new SportCar("Ferrari", "Sport Coupe", 1000, sportDriver, sportEngine, 300);
        sportCar.printInfo();
        sportDriver.PersonTalk();
        sportDriver.drivingStage();
        sportDriver.PersonMove();
        sportCar.start();
        sportCar.stop();
        sportCar.turnLeft();
        sportCar.turnRight();
        System.out.println();
    }
}
