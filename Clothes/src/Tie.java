public class Tie extends Clothes implements WearMan{
    public Tie(ClothesSize size, String color) {
        super(size, color);
    }

    public Tie(ClothesSize size, String color, double cost) {
        super(size, color, cost);
    }
    @Override
    public String toString() {
        return "Tie: " +
                "size = " + getSize() +
                ", price = " + getCost() + " $" +
                ", color = " + getColor();
    }
}
