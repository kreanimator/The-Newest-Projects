final class Processor {




    private int hzs = 0;
    private int quantity = 0;
    private double processorWeight = 0;
    private String producer = "";



    public Processor(int hzs, int quantity, double processorWeight, String producer) {
        this.hzs = hzs;
        this.quantity = quantity;
        this.processorWeight = processorWeight;
        this.producer = producer;
    }
    public void setHzs(int hzs) {
        this.hzs = hzs;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProcessorWeight(double processorWeight) {
        this.processorWeight = processorWeight;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public int getHzs() {
        return hzs;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getProcessorWeight() {
        return processorWeight;
    }

    public String getProducer() {
        return producer;
    }
    public String toString() {
        return "Данные о процессоре:" + "\n" + "\n" +
                "Частота: " + getHzs() + "\n" +
                "Количество ядер: " + getQuantity() + "\n" +
                "Производитель: " + getProducer()+"\n" +
                "Вес: " + getProcessorWeight();

    }
}
