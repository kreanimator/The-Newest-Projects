final class OperatingMemory {




    private String type = "";
    private int size = 0;
    private double memoryWeight = 0;

    public OperatingMemory(String type, int size, double memoryWeight) {
        this.type = type;
        this.size = size;
        this.memoryWeight = memoryWeight;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setMemoryWeight(double memoryWeight) {
        this.memoryWeight = memoryWeight;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public double getMemoryWeight() {
        return memoryWeight;
    }
    public String toString() {
        return "Данные об оперативной памяти:" + "\n" + "\n" +
                "Тип: " + getType() + "\n" +
                "Размер: " + getSize() + "\n" +
                "Вес:" + getMemoryWeight();

    }
}
