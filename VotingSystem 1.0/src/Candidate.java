import java.util.Scanner;

public class Candidate {
    
    public static void getLoginandPassword(Scanner in) {

        String buflogin = "";
        String bufpassword = "";
        System.out.println("Введите логин кандидата: ");
        buflogin = in.nextLine();
        if (buflogin.equalsIgnoreCase("end")) {
            VotingSystem.commands.removeLast();
            return;
        }
        System.out.println("Введите пароль кандидата: ");
        bufpassword = in.nextLine();
        if (bufpassword.equalsIgnoreCase("end")) {
            VotingSystem.commands.removeLast();
            return;
        }

        if (RegCandidate.loginsandpasswords.get(buflogin).equals(bufpassword)) {
            System.out.println("Голоса за кандидата " + buflogin + ":" 
            + RegCandidate.loginsandvotes.get(buflogin));
        }
    }
}