public class Elector extends User {

    boolean voted;
    boolean isVoted = false;
    public Elector(String name, String login, String password) {
        super(name, login, password);
    }

    public void isVoted(boolean voted){

    }
    public void vote(){
    }

    public void setVoted() {
        if (isVoted) {
            System.out.println("Error! Only one time you can voice");
        } else {
            isVoted = true;
        }
    }
    @Override
    public String toString() {
        return "User: " +
                "Name: " + name + '\'' +
                "Login: " + login + '\'' +
                "Password: " + password + '\'' +
                "Voice " + isVoted +"\n";
    }
}
