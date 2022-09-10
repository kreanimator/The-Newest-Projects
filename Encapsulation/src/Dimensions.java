public class Dimensions {
    private final int height;
    private final int width;
    private final int depth;

    @Override
    public String toString() {
        return "" +
                "Высота = " + height +
                ",Ширина = " + width +
                ",Глубина = " + depth +
                ", Объём = " + cargoVolume() + " м3";
    }

    public Dimensions(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public int getDepth() {
        return depth;
    }
    public int cargoVolume (){
        return height * width * depth;
    }
}