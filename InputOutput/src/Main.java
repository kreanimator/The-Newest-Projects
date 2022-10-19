import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Print your numbers:");
        String inputLine = new Scanner(System.in).nextLine();
        new InputOutput().inputNumbersToStrings(inputLine).printNumbers();
    }
}
