import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        while (true) { // Создание цикла
            showMenu();// Вызов метода для показа меню калькулятора
            int choice = Integer.parseInt(String.valueOf(getSelection()));// Переменная для выбора знака операции
            if (choice == 1)
            {
                getTriangle();
            }
            else if (choice == 2)
            {
                getRectangular();
            }
            else if ( choice == 3)
            {
               getSquare();
            }
            else if ( choice == 4 )
            {
               getCircle();
                
            }
            if (choice == 5)// Условие прерывания цикла
            {
                break;// Разрыв цикла
            }
        }
    }


    private static void showMenu()
    {// Метод меню
        System.out.print("\nChoose your figure: \n" +
                "1. Triangle\n" +
                "2. Rectangle\n" +
                "3. Square\n" +
                "4.Circle\n" +
                "\n5. Quit \n" +
                "\nEnter your choice:  ");
        return;
    }
    private static void getTriangle()
    { // Рассчитывает площадь треугольника:
                                            //( int base, int height)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base : ");
        double base = input.nextDouble();
        System.out.print("Enter height : ");
        double height = input.nextDouble();
        System.out.println("Square of the triangle = "+ (0.5* base) * height);
    }
    private static void getRectangular()
    { // Рассчитывает площадь прямоугольника:
        Scanner input = new Scanner(System.in);//public static int area_rectangle( int length, int width)
        System.out.print("Enter length: ");
        double length = input.nextDouble();
        System.out.print("Enter width : ");
        double width = input.nextDouble();
        System.out.println("Square of the rectangular = "+ length * width);

    }
    private static void getSquare() { //Рассчитывает площадь квадрата:
        Scanner input = new Scanner(System.in);//public static int area_rectangle( int length, int width)
        System.out.print("Enter length : ");
        double length = input.nextDouble();
        System.out.print("Enter width : ");
        double width = input.nextDouble();
        System.out.println("Square of the triangle = "+ length * width);

    }
    private static void getCircle() { // Метод для возвращения круга
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        System.out.println("Circle return = "+ radius * Math.PI);


    }

    private static int getSelection()
    { // Метод для выбора операций
        Scanner input = new Scanner(System.in);

        int choice = Integer.parseInt(scanner.next());

        switch (choice)
        { // Выбор операции и назначеие ошибки для всех остальных значений
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