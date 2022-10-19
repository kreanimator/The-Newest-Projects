public class Basket {

    private static class AllBaskets {
        static int itemCount;
        static int cost;



        static int basketAveragePrice;
    }

        private static int count = 0;
        private static int basketCount = 0;
        private String items = "";
        private int totalPrice = 0;
        private double totalWeight = 0;
        private int limit;
        private static int totalCost = 0;


        public Basket() {
            increaseCount(1);
            basketCount = basketCount + 1;
            items = "Список товаров:";
            this.limit = 1000000;
        }

        public Basket(int limit) {
            this();
            this.limit = limit;
        }

        public Basket(String items, int limit) {
            this();
            this.items = this.items + items;
            this.limit = limit;
            this.totalPrice = this.totalPrice + totalPrice;
        }

        public static int getCount() {
            return count;
        }

        public static void increaseCount(int count) {
            Basket.count = Basket.count + count;
        }

        public void add(String name, int price) {
            AllBaskets.itemCount += count;
            AllBaskets.cost += price * count;
            add(name, price, 1);
        }

        public void add(String name, int price, int count) {
            boolean error = false;
            if (contains(name)) {
                error = true;
            }

            if (totalPrice + count * price >= limit) {
                error = true;
            }

            if (error) {
                System.out.println("Error occured :(");
                return;
            }
            items = items + "\n" + name + " - " + count + " шт."
                    + " Стоимость составляет " + price + " рублей; ";
            totalPrice = totalPrice + count * price;
        }

        public void add(String name, int price, double weight) {
            add(name, price, 1, weight);
        }

        public void add(String name, int price, int count, double weight) {
            add(name, price, 1);
            totalWeight = totalWeight + count * weight;
        }

        public void clear() {
            items = "";
            totalPrice = 0;
            totalWeight = 0;
        }

        public int getTotalPrice() {
            return totalPrice;
        }

        public static int getTotalCost() {
            return totalCost;
        }

        public static int getTotalCount() {
            return basketCount;
        }

        public double getTotalWeight() {
            return totalWeight;
        }
        public static int getItemCountForAllBaskets() {
            return AllBaskets.itemCount;
        }

        public static int getCostForAllBaskets() {
            return AllBaskets.cost;
        }
    public static int getBasketAveragePrice() {
        return AllBaskets.cost/AllBaskets.itemCount;
    }

        public boolean contains(String name) {
            return items.contains(name);
        }

        public void print(String title) {
            System.out.println(title);
            if (items.isEmpty()) {
                System.out.println("Корзина пуста");
            } else {
                System.out.println(items);
                System.out.println("Общая стоимость товаров в корзине " + totalPrice + " рублей;");
                System.out.println("Общий вес товаров в корзине " + totalWeight + " кг;");

            }

        }
    }





