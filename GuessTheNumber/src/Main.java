import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        System.out.println("Введите число от 1 до 100:");

        int result = 1;

        while (true) {
            if (result < value) {
                System.out.println("Загаданное число больше. Введите другое число:" );
                result = new Scanner(in).nextInt();
                continue;
            }
            if (result > value) {
                System.out.println("Загаданное число меньше. Введите другое число:");
                result = new Scanner(in).nextInt();
                continue;
            }
            if (result == value)
                System.out.println("Вы угадали!!!");
            break;
        }
    }
}