import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int numberStart = -1;
        int index = 0;
        int sum = 0;
        while(index >= 0) {
            index = text.indexOf(' ', index + 1);
            if (Character.isDigit(text.charAt(index + 1))) {
                numberStart = index + 1;
            }
            if (numberStart > 0 &&
                    Character.isDigit(text.charAt(index - 1))) {
                sum += Integer.parseInt(
                        text.substring(numberStart, index)
                );
                numberStart = -1;
            }
        }
        System.out.println(sum);
    }
}
