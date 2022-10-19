public class TShirt extends Clothes implements  WearWoman,WearMan{
    public TShirt(ClothesSize size, String color) {
        super(size, color);
    }

    public TShirt(ClothesSize size, String color, double cost) {
        super(size, color, cost);
    }
    @Override
    public String toString() {
        return "T-Shirt: " +
                "size = " + getSize() +
                ", price = " + getCost() + " $" +
                ", color = " + getColor();
    }
}
