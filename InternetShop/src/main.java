public class main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Milk", 80);
        vasyaBasket.add("Bread", 40);


        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Shovel", 280);
        petyaBasket.add("Barrel", 2900);

        Basket mashaBasket = new Basket("Table", 5000);

        vasyaBasket.print("Vasya's basket:");
        petyaBasket.print("Petya's basket:");
        mashaBasket.print("Masha's Basket:");
    }

}
