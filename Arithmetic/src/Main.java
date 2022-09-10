import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое значение:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе значение:");
        int number2 = new Scanner(System.in).nextInt();
        Arithmetic arithmetic = new Arithmetic (number1, number2);
        arithmetic.sum();
        System.out.println("Сумма ваших чисел равна:"+ arithmetic.sum());
        arithmetic.multiplication();
        System.out.println("Произведение ваших чисел равно:" + arithmetic.multiplication());
        arithmetic.minimum();
        System.out.println("Минимальное число:" + arithmetic.minimum());
        arithmetic.maximum();
        System.out.println("Максимальное число:" + arithmetic.minimum());
    }
}
