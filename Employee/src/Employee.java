import java.util.Scanner;

public class Employee {
    public String name = "";
    public double sal = 0;
    public double work = 0;


    public String getName() {

        return name;
    }
    public double getWork() {


        if ( work > 6){
            sal = sal +5;
        }
        return work;
    }
    public double getSal() {

        if ( sal < 500){
            sal = sal +10;
        }
        return sal;
    }
    public void getInfo (){
        System.out.println("Введите имя: ");
        name = new Scanner(System.in).next();
        System.out.println("Введите количество часов работы: ");
        work = new Scanner(System.in).nextInt();
        System.out.println("Введите зарплату: ");
        sal = new Scanner(System.in).nextInt();

        System.out.println(" Сотрудник:" + name +
                "\n Зарплата:" + sal +
                "\n Время работы: " + getWork() +
                "\n Итоговая зарплата: " + getSal());
        System.out.println();
    }

//    getInfo(), который принимает имя сотрудника в качестве параметра и печатает
//    зарплату, количество часов работы в день сотрудника
//    AddSal(), которая добавляет 10 долларов к зарплате сотрудника, если она меньше 500 долларов.
//    AddWork(), которая добавляет $5 к зарплате сотрудника, если количество часов работы в день превышает 6 часов.

}
