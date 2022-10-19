import java.util.Scanner;

public class Main
{
   static Scanner scanner = new Scanner(System.in);// Создание сканера для ввода с клавиатуры

    public static void main(String[] args)
    {
       while (true)
       { // Создание цикла
           double num1 = getFirstNumber(); //Ввод первой переменной
           double num2 = getSecondNumber();//Ввод второй переменной3
           showMenu();// Вызов метода для показа меню калькулятора
           int choice = Integer.parseInt(String.valueOf(getSelection()));// Переменная для выбора знака операции
           double result = doTheMath(Integer.parseInt(String.valueOf(choice)), num1, num2);// Результат операции и вызов последующих методов
           displayResult(Integer.parseInt(String.valueOf(choice)), result, num1, num2);
           if ( choice == -1)// Условие прерывания цикла
           {
               break;// Разрыв цикла
           }
       }
    }

    private static double getFirstNumber()
    { // Метод для назначения первого числа
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        if ( false){
            System.out.println("Something went wrong. Try again!");
        }
        return num1;
    }
    private static double getSecondNumber()
    {// Метод для назначения второго числа
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the second number - "
                + "\n(Cannot be zero for Divison): ");
        double num2 = input.nextDouble();
        if (false){
            System.out.println("Something went wrong. Try again!");
        }

        return num2;
    }
    private static void showMenu()
    {// Метод меню
        System.out.print("\n1. Addition (+) \n2. Subtract (-)\n3. Multiply (*)"
                + "\n4. Divide (/)"+"\n5.Pow (^) "+"\n\nWhich math operation?\n\n "
                + "Enter your choice:  \n");
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
                System.out.println("Illegal Operation! Please try again!\n");

        }

        return choice;
    }
    private static double doTheMath(int choice, double num1, double num2)
    { // Метод содержащий в себе все рассчёты
        double result = 0;
        if (choice == 1)
            result = num1 + num2;
        else if (choice == 2)
            result = num1 - num2;
        else if (choice == 3)
            result = num1 * num2;
        else if (choice == 4)
            result = num1 / num2;
        else if (choice == 5)
            result = Math.pow(num1,num2);

        return result;
    }
    private static void displayResult(int choice, double result, double num1, double num2)
    { //Метод для вывода результата


        if (choice == 1)
            System.out.println(num1 + " + " + num2 + " = " + result +"\n");
        else if (choice == 2)
            System.out.println(num1 + " - " + num2 + " = " + result +"\n");
        else if (choice == 3)
            System.out.println(num1 + " * " + num2 + " = " + result +"\n");
        else if (choice == 4)
            System.out.println(num1 + " / " + num2 + " = " + result+"\n");
        else if (choice == 5)
            System.out.println(num1 + " / " + num2 + " = " + result+"\n");

        }

    }
