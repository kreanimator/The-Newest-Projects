public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowLactoseMilkAmount = 1000;

        boolean isBlocked = true;

        int cappucinoMilkrequired = 60;
        int cappucinoCoffeerequired = 15;

        boolean milkIsEnough = skimmedMilkAmount >= cappucinoMilkrequired ||
                milkAmount >= cappucinoMilkrequired ||
                lowLactoseMilkAmount >= cappucinoMilkrequired;

        boolean coffeeIsenough = coffeeAmount >= cappucinoCoffeerequired;
        boolean hasErrors = false;

        if (!isBlocked) {
            System.out.println("Кофемашина заблокирована!");
            hasErrors = true;
        }

        if (!coffeeIsenough) {
            System.out.println("Кофе недостаточно!");
            hasErrors = true;
        }
        if (!milkIsEnough) {
            System.out.println("Молока недостаточно!");
            hasErrors = true;
        }
        if (!hasErrors){
            System.out.println("Готовим кофе!");
        }
    }
}