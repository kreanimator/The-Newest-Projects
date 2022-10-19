public class Computer {



    private final  String vendor;
    private final String name;
    private   Processor processor;
    private   OperatingMemory operatingMemory;
    private   Storage storage;
    private   Display display;
    private   Keyboard keyboard;
    private   double totalWeight;


    public Computer (String vendor, String name){
        this.vendor = vendor;
        this.name = name;
    }

    public Computer (String vendor, String name, double totalWeight) {
        this.vendor = vendor;
        this.name = name;

    }
    public Computer (String vendor,
                     String name,
                     Processor processor,
                     OperatingMemory operatingMemory,
                     Storage storage,
                     Display display,
                     Keyboard keyboard,
                     double totalWeight) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.operatingMemory = operatingMemory;
        this.storage = storage;
        this.display = display;
        this.keyboard = keyboard;
        this.totalWeight = totalWeight;
    }
    private final String getVendor() {return vendor;}
    private final String getName() {return name;}

    private final double getTotalWeight() {
        return processor.getProcessorWeight()+ operatingMemory.getMemoryWeight()+ storage.getStorageWeight() +
                display.getDisplayWeight() + keyboard.getKeyboardWeight();
    }
    public String toString() {
        return "Данные о компьютере:" + "\n" + "\n" +
                "Название: " + getName() + "\n" +
                "Производитель: " + getVendor() + "\n"
                + "\n" + processor.toString() +
                "\n" + operatingMemory.toString()+
                "\n"  +storage.toString() +
                "\n" + display.toString() +
                "\n" + keyboard.toString() +
                "\nОбщий вес компьютера: " +getTotalWeight() + "гр."  + "\n" ;

    }
    private Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    private OperatingMemory getOperatingMemory() {
        return operatingMemory;
    }

    public void setOperatingMemory(OperatingMemory operatingMemory) {
        this.operatingMemory = operatingMemory;
    }

    private Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    private Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    private Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }
}