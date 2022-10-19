public class Trousers extends Clothes implements WearMan,WearWoman{
    public Trousers(ClothesSize size, String color) {
        super(size, color);
    }

    public Trousers(ClothesSize size, String color, double cost) {
        super(size, color, cost);
    }
    @Override
    public String toString() {
        return "Trousers: " +
                "size = " + getSize() +
                ", price = " + getCost() + " $" +
                ", color = " + getColor();
    }
}
