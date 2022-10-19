public class Main {
    public static void main(String[] args) {
        Institute institute = new Institute();
        institute.fillStudentsList();
        institute.fillStudentsSummaryList();
        System.out.println("Total student's list after exams: ");
        institute.printStudentsInfo();
        institute.makeDecision();
        System.out.println("List of updated students: ");
        institute.printStudentsInfo();
        System.out.println("List of graduates: ");
        institute.printGraduatesInfo();
    }
}
