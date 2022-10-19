import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please create a password!\n" +
                "      1. A password must have at least eight characters.\n" +
                "      2. A password consists of only letters and digits.\n" +
                "      3. A password must contain at least two digits\n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = input.next();
        while (isValid(password)) {
            System.out.println("Password " + password + " is not valid!Please, try again: ");
            input.next();
            if (true) {
                System.out.println("Password " +password+" is valid!");
         }break;
        }

    }

    public static boolean isValid(String password) {
        if (password.length() < 8) {
            return false;
        } else {
            char c;
            int count = 1;
            for (int i = 0; i < password.length()-1; i++) {
                c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return false;
                } else if (Character.isDigit(c)) {
                    count++;
                    if (count < 2) {
                        return false;
                    }


                }
            }
        }return true;
    }
}
