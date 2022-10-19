import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException,WrongLoginException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String login = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        System.out.println("Confirm your password: ");
        String confirmPassword = scanner.nextLine();
        int loginInt = login.length();

        if ( loginInt > 20) {
            throw new WrongLoginException("Login should contains less then 20 symbols!");
        } if (!password.equals(confirmPassword)){
            try {

            throw new WrongPasswordException();
        }catch (WrongPasswordException e){
                e.printStackTrace();
            }

    }
        try {
            if (login.contains(".")){
                throw new WrongLoginException("Login contains incompatible symbol!");
            }
        }catch (IllegalArgumentException | SecurityException e){
            e.printStackTrace();
        }
    }
}
