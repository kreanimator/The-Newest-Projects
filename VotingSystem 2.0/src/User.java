import java.util.Scanner;
import java.util.Set;

public class User implements Register,Enter {
    String name;
    String login;
    String password;
    boolean repeation;

    Set<Role> roles;

    public User (){

}
    public User (String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
    }
    @Override
    public String toString() {
        return "User: " + " \n"+
                "Login: " + login + "\n"+
                "Name: '" + name + '\'';
    }

    @Override
    public User findUser(String login, String password) {
        return null;
    }

    @Override
    public User addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new user: ");
        name = scanner.nextLine();
        System.out.println("Enter new login: ");
        login = scanner.nextLine();
        System.out.println("Enter password: ");
        password = scanner.nextLine();


        return null;
    }


    public void findUser() {
    }
}
