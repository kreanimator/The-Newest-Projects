public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add( "Banana", 60, 4, 100);
        basket.add("Beef", 700, 1, 900);
        basket.print("Ваша корзина:");



        System.out.println("Общая стоимость товаров в корзине = "+ basket.getTotalPrice());
        System.out.println("Общее количество товаров в корзине = " + basket.getTotalCount());
    }
}
