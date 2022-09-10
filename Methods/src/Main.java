public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("some text 133", "Справка");
        printer.append("some text 210", 544);
        System.out.println(printer.getPendingPagesCount());
        printer.print();
        printer.append("some text 8", 530);
        printer.clear();
        printer.append("some text 23", "Договор", 312);
        printer.append("some text 11");
        printer.print();
        System.out.println(printer.getPrintedPagesCount());


    }
    }
