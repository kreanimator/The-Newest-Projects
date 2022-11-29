import java.util.Scanner;

public class Lesson4 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number: ");
//            int a = scanner.nextInt();
//            if (a == 10){
//                System.out.println("Correct!");
//            }else{
//                System.out.println("Incorrect!");
//            }
//
//            int b = scanner.nextInt();
//            if (b == 0){
//                System.out.println("Correct!");
//            }else{
//                System.out.println("Incorrect!");
//            }
//
//            boolean test =true;
//            if (test = true){
//                System.out.println("Correct!");
//            }else{
//                System.out.println("Incorrect!");
//            }
//            int min = scanner.nextInt();
//            if (min < 15){
//                System.out.println("First part of an hour");
//            } else if (min < 30 && min > 15) {
//                System.out.println("Second part of an hour");
//            } else if (min < 45 && min > 30) {
//                System.out.println("Third part of an hour");
//            }else {
//                System.out.println("Forth part of an hour");
//            }
//            int num = scanner.nextInt();
//            switch (num) {
//                case 1 -> System.out.println("Winter");
//                case 2 -> System.out.println("Spring");
//                case 3 -> System.out.println("Summer");
//                case 4 -> System.out.println("Autumn");
//            }
//            int month = scanner.nextInt();
//            if ( month >= 1 && month < 3){
//                System.out.println("Winter");
//            }else if (month >=3 && month< 6){
//                System.out.println("Spring");
//            }else if (month >= 6 && month <9 ){
//                System.out.println("Summer");
//            }else {
//                System.out.println("Autumn");
//            }
//            int number = scanner.nextInt();
//            int i;
//            boolean isPrime = false;
//            for (i = 2; i < number; i ++){
//                if(number % i == 0){
//                    isPrime =true;
//                    break;
//                }
//                }
//            if (isPrime){
//                System.out.println("Number is prime!");
//            }else{
//                System.out.println("Number is not prime!");
//            }
            int length = scanner.nextInt();
            for (int i = length; i >= 0; i--, System.out.println())
                for (int j = 1; j <= i; j++, System.out.print("*"));
        }
}



