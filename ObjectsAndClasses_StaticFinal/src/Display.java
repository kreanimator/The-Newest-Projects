final class Display {

    private int displaySize =0;
    private boolean lcdOrPlasma = true;
    private double displayWeight = 0;
    public Display(int displaySize, boolean lcdOrPlasma, double displayWeight) {
        this.displaySize = displaySize;
        this.lcdOrPlasma = lcdOrPlasma;
        this.displayWeight = displayWeight;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public boolean isLcdOrPlasma() {
        return lcdOrPlasma;
    }

    public void setLcdOrPlasma(boolean lcdOrPlasma) {
        this.lcdOrPlasma = lcdOrPlasma;
    }

    public double getDisplayWeight() {
        return displayWeight;
    }

    public void setDisplayWeight(double displayWeight) {
        this.displayWeight = displayWeight;
    }
    public String toString() {
        return "Данные о дисплее:" + "\n" + "\n" +
                "Диагональ: " + getDisplaySize() + "\n" +
                "ЖК или плазма: " + lcdOrPlasma + "\n" +
                "Вес:" + getDisplayWeight();

    }


}
