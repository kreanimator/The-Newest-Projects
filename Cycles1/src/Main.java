import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (;; ) {
            System.out.println( "Введите первое число:");
            int value1 = new Scanner(System.in).nextInt();
            System.out.println("Введите второе число:");
            int value2 = new Scanner(System.in).nextInt();
            int result = value1 * value2;
            System.out.println("Произведение чисел равно:" + result);
        }
    }
}
