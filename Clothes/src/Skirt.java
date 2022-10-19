public class Skirt extends Clothes implements WearWoman{
    public Skirt(ClothesSize size, String color) {
        super(size, color);
    }

    public Skirt(ClothesSize size, String color, double cost) {
        super(size, color, cost);
    }
    @Override
    public String toString() {
        return "Skirt: " +
                "size = " + getSize() +
                ", price = " + getCost() + " $" +
                ", color = " + getColor();
    }
}
