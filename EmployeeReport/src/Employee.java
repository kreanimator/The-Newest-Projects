import java.io.IOException;
import java.util.ArrayList;

public class Employee {
    Report report;


    String fullName;
    double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    void Report(ArrayList<String> e) throws IOException {
        // Output to console

        // Save to file:
        System.out.println("Employee: "+ fullName + "Salary: " + salary + "$");
        this.report.generateReport();
    }

}
