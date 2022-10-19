public abstract class Clothes {
    private ClothesSize size;
    private String color;
    private double cost;

    public Clothes(ClothesSize size, String color) {
        this.size = size;
        this.color = color;
    }

    public Clothes(ClothesSize size, String color, double cost) {
        this(size, color);
        this.cost = cost;
    }

    public ClothesSize getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothes)) return false;

        Clothes clothes = (Clothes) o;

        if (Double.compare(clothes.cost, cost) != 0) return false;
        if (size != clothes.size) return false;
        return color.equals(clothes.color);
    }

}