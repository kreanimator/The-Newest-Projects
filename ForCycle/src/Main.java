import com.sun.jdi.Value;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int value = new Scanner(System.in).nextInt();{
            System.out.println("Вот ваша последовательность:");}

        for (int i = 1; i <= value; i = i + 1) {
            for ( int b = 1; b <= value; b = b + 1) {

                if ( i * b  == value)

                System.out.println(i + "*"+ b +"=" + value);
            }
        }
    }
}