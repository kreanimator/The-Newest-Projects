public class Main {
    public static void main(String[] args) {
      Computer computer1 = new Computer("Irbis", "GX400");
      OperatingMemory operatingMemory1 = new OperatingMemory("DDR",16,200);
      Storage storage1 = new Storage("SDD",500,300);
      Display display1 = new Display(24,true,500);
      Processor processor1 = new Processor(5,300,10,"Intel");
      Keyboard keyboard1 = new Keyboard("Keys", "Yes",200);
      computer1.setStorage(storage1);
      computer1.setDisplay(display1);
      computer1.setProcessor(processor1);
      computer1.setKeyboard(keyboard1);
      computer1.setOperatingMemory(operatingMemory1);
        System.out.println(computer1.toString());


    }
}
