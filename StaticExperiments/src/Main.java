public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(EngineType.DIESEL, 5.0, 120);

        Car car = new Car(engine, CarType.CABRIOLET, 1500);
        System.out.println("Тип автомобиля:"+ car.getType());
        System.out.println("Тип двигателя:" + engine.getType());
        System.out.println("Объём двигателя:"+ engine.getVolume());
        System.out.println("Мощность двигателя:"+ engine.getPower());
        System.out.println("Масса автомобиля:"+ car.getWeight());


    }
}
