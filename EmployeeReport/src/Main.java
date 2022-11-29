
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Petya Ivanov", 3000));
        employees.add(new Employee("Vasya Pupkin", 2000));
        employees.add(new Employee("KtoTo Tam", 500));
        Report report = new Report();
        report.generateReport();


    }
}
