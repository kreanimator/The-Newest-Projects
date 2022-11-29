import java.util.Scanner;
import java.util.ArrayList;

public class RegUser {

    static ArrayList<String> usernames = new ArrayList<String>();
    
    public static boolean registration(Scanner in) {
        String name;
        String login;
        String password;
        System.out.println("Введите имя: ");
        name = in.nextLine();
        if (name.equalsIgnoreCase("end")) {
            VotingSystem.commands.removeLast();
            return false;
        }
        System.out.println("Введите логин: ");
        login = in.nextLine();
        if (login.equalsIgnoreCase("end")) {
            VotingSystem.commands.removeLast();
            return false;
        }
        System.out.println("Введите пароль: ");
        password = in.nextLine();
        if (password.equalsIgnoreCase("end")) {
            VotingSystem.commands.removeLast();
            return false;
        }
        boolean check = false;
        for (int i = 0; i < usernames.size(); ++i) {
            if (name.equals(usernames.get(i))) {
                check = true;
            }
        }
        if (check == true) {
            System.out.println("Вы уже зарегистрированы");
            return false;
        } else {
            System.out.println("Вы успешно зарегистрировались");
            usernames.add(name);
            return true;
        }
    }
}