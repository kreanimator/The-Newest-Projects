import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {// add_keychains(), remove_keychains(), view_order() и checkout().
        System.out.print("Yee Olde Keychain Shoppe: \n");
        while (true) { // Создание цикла
            showMenu();
            int choice = Integer.parseInt(String.valueOf(getSelection()));// Переменная для выбора знака операции
            if (choice == 1) {
                add_keychains();
            } else if (choice == 2) {
                remove_keychains();
            } else if (choice == 3) {
                view_order();
            } else if (choice == 4) {
                checkout();

            }
            if (choice == 5)// Условие прерывания цикла
            {
                break;// Разрыв цикла
            }
        }
    }
            private static void showMenu() {// Метод меню
                System.out.print("1. Add keychains to order.\n" +
                        "2. Remove keychains from order\n" +
                        "3. View current order\n" +
                        "4.Checkout\n" +
                        "5. Quit \n" +
                        "\nEnter your choice:  \n");
                return;
            }
    private static void add_keychains() { // Add keychains
        System.out.print("ADD KEYCHAINS\n\n");
    }
    private static void remove_keychains() { // Add keychains
        System.out.print("KEYCHAINS WERE REMOVED FROM ORDER\n\n");
    }
    private static void view_order() { // Add keychains
        System.out.print("VIEW ORDER\n\n");
    }
    private static void checkout() { // Add keychains
        System.out.print("CHECKOUT\n\n");
    }
    private static int getSelection() {// Метод для выбора операций

        int choice = Integer.parseInt(scanner.next());

                switch (choice) { // Выбор операции и назначеие ошибки для всех остальных значений
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        break;
                    default:
                        System.out.println("Illegal Operation! Please try again!");

                }

                return choice;
    }

}

