import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class RegCandidate {

    static ArrayList<String> candidates = new ArrayList<String>();
    static HashMap<String, Integer> loginsandvotes = new HashMap<>();
    static HashMap<String, String> loginsandpasswords = new HashMap<>();

    public static void registercandidate(Scanner in) {
        
        final int defaultvotes = 0;
        String login = "";
        System.out.println("Введите логин кандидата: ");
        login = in.nextLine();
        if (login.equalsIgnoreCase("end")) {
            VotingSystem.commands.removeLast();
            return;
        }
        String password = "";
        System.out.println("Введите пароль: ");
        password = in.nextLine();
        if (password.equalsIgnoreCase("end")) {
            VotingSystem.commands.removeLast();
            return;
        }
        candidates.add(login);
        int votes = defaultvotes;
        loginsandvotes.put(login, votes);
        loginsandpasswords.put(login, password);
    }

    public static ArrayList<String> getArrayList() {
        return candidates;
    }
    
}