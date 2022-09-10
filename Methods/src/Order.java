public class Order {


    private int count = 0;
    private int totalCost = 0;

    public void addProducts (int productsCount, int cost ) {
        count = count + productsCount;
        totalCost = totalCost + cost;
    }

    public int getTotalCost () {
        return totalCost;
    }

    public int getProductsCount () {
        return count;
    }
}
