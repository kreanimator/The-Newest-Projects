public class Car {


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    String carContributor;
    String carClass;
    double carWeight;
    Driver driver;
    Engine engine;

    public Car(String carContributor, String carClass, double carWeight, Driver driver, Engine engine) {
        this.carContributor = carContributor;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Go!");

    }

    public void stop() {
        System.out.println("Stop!");

    }

    public void turnRight() {
        System.out.println("Turning right!");

    }

    public void turnLeft() {
        System.out.println("Turning left!");
    }

    public void printInfo() {
        System.out.print("Brand: " + carContributor + " " + "\nClass: " + carClass + "\nWeight: " + carWeight
                + "\nEngine power: " + engine.power + "\nEngine contributor: " + engine.contributor);
    }
}
//    Создать класс Car содержащий поля - марка автомобиля, класс автомобиля, вес, водитель
//    типа Driver, мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(),
//    которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
//    А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
