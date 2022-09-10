import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите факториал:");
        int value = new Scanner(System.in).nextInt();
        int result = 1;

        if (value < 0 || value > 12) {
            System.out.println("Непподерживаемое значение!");
        } else {

            for (int i = 1; i <= value; i++)
                result = result * i;
            {System.out.println("Ваш факториал  " + value + "!  равен:" + result);}
            return;
        }
    }
}


