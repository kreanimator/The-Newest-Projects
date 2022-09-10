
public class Main {
    public static void main(String[] args) {
        int milkAmount = 1500; // ml
        int powderAmount = 500; // g
        int eggsCount = 30; // items
        int sugarAmount = 500; // g
        int oilAmount = 300; // ml
        int appleCount = 10; // items

        boolean ingridientsAppleJuiceIsEnough = appleCount >=5;
        boolean ingridientsPancakesIsEnough = powderAmount >= 400 &&
                milkAmount >= 1000 && sugarAmount >= 10 && oilAmount >= 30;
        boolean ingridientsOmeletteIsEnough = eggsCount >= 5 && milkAmount >= 300 && powderAmount >= 5;
        boolean ingridientsApplePieIsEnoughr = milkAmount >= 100 && powderAmount >= 300
                && eggsCount >= 4 && sugarAmount >= 100 && appleCount >= 3;


        if (ingridientsAppleJuiceIsEnough) {
            System.out.println("Preparing Apple juice");
        }
        if (ingridientsPancakesIsEnough) {
            System.out.println("Preparing Pancakes");
        }
        if (ingridientsOmeletteIsEnough) {
            System.out.println("Preparing Omelette");
        }
        if (ingridientsApplePieIsEnoughr) {
            System.out.println("Preparing Apple Pie");
        }

    }
}