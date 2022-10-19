public class Admin extends User implements CreateVoting{
    public Admin(String name, String login, String password) {
        super(name, login, password);
    }

    @Override
    public void addVoting() {
        System.out.println("admin");
    }

    @Override
    public User addUser() {
        return null;
    }
}
