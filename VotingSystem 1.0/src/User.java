import java.util.Scanner;
import java.util.ArrayList;

public class User {

    static ArrayList<String> votedusers = new ArrayList<String>();
    static String name = "";
    
    public static boolean enter(Scanner in) {
        System.out.println("Введите имя: ");
        name = in.nextLine();
        if (name.equalsIgnoreCase("end")) {
            VotingSystem.commands.removeLast();
            return false;
        }
        boolean check = false;
        for (int i = 0; i < RegUser.usernames.size(); ++i) {
            if (name.equals(RegUser.usernames.get(i))) {
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Ваше имя не было найдено, пройдите регистрацию");
            return false;
        } else {
            return true;
        }
    }

    public static boolean vote(Scanner in) {
        String currentLine = "";
        boolean votecheck = false;
        System.out.println("Список кандидатов: ");
        System.out.println(RegCandidate.getArrayList());
        System.out.println("Введите имя кандидата за которого хотите проголосовать: ");
        currentLine = in.nextLine();
        if (currentLine.equalsIgnoreCase("end")) {
            VotingSystem.commands.removeLast();
            return false;
        }
        for (int i = 0; i < RegCandidate.candidates.size(); ++i) {
            if (currentLine.equals(RegCandidate.candidates.get(i))) {
                RegCandidate.loginsandvotes.put(RegCandidate.candidates.get(i), RegCandidate.loginsandvotes.get(RegCandidate.candidates.get(i)) + 1);
                votecheck = true;
            }
        }
        if (votecheck == true) {
            votedusers.add(name);
            System.out.println("Ваш голос принят");
            return true;
        } else {
            System.out.println("Такого кандидата не существует");
            return false;
        }
    }

    public static boolean isVoted() {
        boolean check = false;
        for (int i = 0; i < votedusers.size(); ++i) {
            if (name.equals(votedusers.get(i))) {
                check = true;
            }
        }
        if (check == true) {
            return true;
        } else {
            return false;
        }
    }
}
