public class Cars {
    public static void main(String[] args) {
        Car car = new Car();
        car.year = 2014;
        car.make ="Kia";
        car.speed = 220;

        System.out.println(" Car year of issuance: " + car.year +
                "\n Car distributor: " + car.make +
                "\n Car maximum speed: " + car.speed);
        System.out.println("");

        Car car1 = new Car();
        car1.year = 1958;
        car1.make ="Mustang";
        car1.speed = 320;

        System.out.println(" Car year of issuance: " + car1.year +
                "\n Car distributor: " + car1.make +
                "\n Car maximum speed: " + car1.speed);
        System.out.println("");

    }
}
