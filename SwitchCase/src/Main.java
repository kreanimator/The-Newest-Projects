import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Введите новое сообщение:" );
            String input = new Scanner(System.in).nextLine();

//            if (input.equals ("Привет")){
//                System.out.println("Привет)");
//            }else if (input.equals("Как дела?")){
//                System.out.println("Отлично! У тебя как? ");
//            }else{
//                System.out.println("Не понимаю сообщение :(");
//            }

            switch ( input ) {
                case "Привет!" -> System.out.println("Привет!");
                case "Как дела?" -> {
                    System.out.println("Отлично!");
                    System.out.println("А у тебя как?");
                }
                default -> System.out.println("Не понимаю сообщение :(");
            }
        }
    }
}
