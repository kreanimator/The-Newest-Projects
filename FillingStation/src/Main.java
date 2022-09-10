public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчёта стоимости топлива");

        int fuelType = 95;
        int amount = 50;
        boolean hasdiscount = amount > 10;

        double fuel92price = 60.2;
        double fuel95price = 67.33;

        double discount = 0.1;

       String wrongFuelTypeMessage = "Указан неверный тип топлива!";

        double fuelPrice = 0;
        if(fuelType == 92) {
            fuelPrice = fuel92price;

        }
       else if(fuelType == 95) {
            fuelPrice = fuel95price;

        } else {
            System.out.println(wrongFuelTypeMessage);
            amount = 0;
        }
if (hasdiscount){
    fuelPrice = ( 1 - discount) * fuelPrice;
}
        if (amount < 1) {
            System.out.println("Указано слишком малое количество топлива!");
        }

        String fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + "руб.";

        System.out.println(fuelPriceMessage);

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}
