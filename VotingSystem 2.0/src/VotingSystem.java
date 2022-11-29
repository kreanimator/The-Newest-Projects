import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VotingSystem implements CheckResults,CreateVoting {

    private List<User> users;
    private Voting currentVoting;
    private User currentUser;
    static ArrayList<String> winners = new ArrayList<String>();
    static LinkedList<String> commands = new LinkedList<>();
    static  ArrayList<String> users1 = new ArrayList<>();

    public static void main(String[] args) {

        List users = new ArrayList<>();
        User user = new User();
        User admin = new User();
        while (true) {
            System.out.println("Welcome to electronic voting system: " + "\n" +
                    "Please choose your action:\n" +
                    "1.Register to the system.\n" +
                    "2.Enter to the system.\n" +
                    "3.Add new candidate. (For admins only)\n" +
                    "4.Vote \n" +
                    "5. Show voting results.\n" +
                    "6.Print all users.");
            int choice = new Scanner(System.in).nextInt();
            if (choice == 1) {
                user.addUser();
                System.out.println("You're successfully registered!\n");
            } else {
                if (choice == 2) {
                    user.findUser();
                } else {
                    if (choice == 3) {
                        for (Object u : users) {
                            if (u instanceof Admin) ((Admin) u).addVoting();
                        }
                        if (choice == 4) {
                            Voting voting = new Voting();
                        } else {
                            if (choice == 5) {
                                //VotingSystem.getResults();

                            }else {
                                if(choice == 6){
                                    System.out.println(users);
                                }
                            }
                        }
                    }
                }

            }

        }
    }


    @Override
    public List getResults() {
        return null;
    }

    @Override
    public void addVoting() {

    }
}



//        public void save(){
//        }
//        public void load(){
//        }