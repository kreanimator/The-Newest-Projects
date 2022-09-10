public class Employee {

    private String email = "Не задан.";
    private String name;
    private int telephone;


    public Employee (String name, String email){
        this.name=name;
        this.email=email;

    }
    public Employee (String name, int telephone){
        this.name = name;
        this.telephone = telephone;
    }
    public Employee (String name, String email, int telephone){
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }
    public void printInfo(){
        System.out.println("Имя:"+ name);
        System.out.println("E-mail:"+ email);
        System.out.println("Телефон:" + ((telephone > 0) ? telephone : " не задан."));
        System.out.println();
    }

}
