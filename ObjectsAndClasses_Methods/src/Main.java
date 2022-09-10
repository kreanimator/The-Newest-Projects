public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add( "Banana", 60, 4, 100);
        basket.add("Beef", 700, 1, 900);
        basket.add("Beer", 50, 10);
        basket.print("Ваша корзина:");
    }
}
