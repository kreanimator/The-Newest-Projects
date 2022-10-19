public class Main {

    public static void main(String[] args) {
        Basket johnBasket = new Basket(100);
        johnBasket.add("Пиво", 40,4,50);
        johnBasket.print("Корзина Джона");
        System.out.println();

        Basket mashaBasket = new Basket(200);
        mashaBasket.add("Водка", 400,1,50);
        mashaBasket.add("Селёдка", 80,1,3);
        mashaBasket.print("Корзина Маши");
        System.out.println();

        Basket katyaBasket = new Basket("", 500);
        katyaBasket.add("Cапоги", 200);
        katyaBasket.print("Корзина Кати");
        System.out.println(Basket.getTotalCount());
        System.out.println(Basket.getTotalCost());
        System.out.println("Общее количество корзин: " + Basket.getItemCountForAllBaskets());
        System.out.println( "Общая стоимость корзин: " + Basket.getCostForAllBaskets());
        System.out.println("Средняя стоимость корзины:" + Basket.getBasketAveragePrice());
    }
}