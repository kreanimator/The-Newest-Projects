final class Storage {




    private String type = "";
    private int volume = 0;
    private double storageWeight =0;

    public Storage(String type, int volume, double storageWeight) {
        this.type = type;
        this.volume = volume;
        this.storageWeight = storageWeight;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setStorageWeight(double storageWeight) {
        this.storageWeight = storageWeight;
    }

    private String getType() {
        return type;
    }

    private int getVolume() {
        return volume;
    }

    double getStorageWeight() {
        return storageWeight;
    }
    public String toString() {
        return "Данные о памяти:" + "\n" + "\n" +
                "Тип: " + getType() + "\n" +
                "Объём: " + getVolume() + "\n" +
                "Вес:" + getStorageWeight();

    }
}


