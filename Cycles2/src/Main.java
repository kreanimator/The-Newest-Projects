import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int value = -1 ; value != 0; ) {
            value = new Scanner(System.in).nextInt();
            sum = sum + value;

        }
        System.out.println("Сумма введённых исчислений равна:" + sum );
    }
}
