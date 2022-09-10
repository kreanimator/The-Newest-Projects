import jdk.swing.interop.SwingInterOpUtils;

public class VariablesAndNames {
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;

        System.out.println("There are "+cars+ " available." +
                "\nThere are only " + drivers+ " drivers available." +
                "\nThere will be "+(cars-drivers)+ " empty cars today." +
                "\nWe can transport " +(drivers+passengers) + " people today." +
                "\nWe have to "+passengers+ " to carpool today." +
                "\nWe need to put about " +(space_in_a_car-1) + " in each car.");

    }
}

