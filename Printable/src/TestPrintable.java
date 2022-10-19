public class TestPrintable {
    public static void main(String[] args) {

        Printable[] test = new Printable[4];
        test[0] = new Book(" Daniel Neder - Java for MASA Students");
        test[1] = new Magazine("Men's health");
        test[2] = new Book("Fedor Dostoevsky Idiot ");
        test[3] = new Magazine("Java for dummies");
        Book.printBooks(test);
        Magazine.printMagazine(test);

//        int k = 0;
//        for (Printable printable : test) {
//            test[k].print();
//            k++;
//        }
    }
}
//    Определить интерфейс Printable, содержащий метод void print().
//        Определить класс Book, реализующий интерфейс Printable.
//        Определить класс Magazine, реализующий интерфейс Printable.
//        Создать массив типа Printable, который будет содержать книги и журналы.
//        В цикле пройти по массиву и вызвать метод print() для каждого объекта.
//        Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
//        который выводит на консоль названия только журналов.
//        Создать статический метод printBooks(Printable[] printable)
//        в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof.

