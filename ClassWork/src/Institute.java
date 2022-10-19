import java.util.*;

public class Institute {
    public static int START_COURSE = 1;
    public static int FINISH_COURSE = 5;

    private List<Student> students;
    private List<Student> graduates;

    public Institute() {
        students = new LinkedList<>();
        graduates = new LinkedList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getGraduates() {
        return graduates;
    }

    public void setGraduates(List<Student> graduates) {
        this.graduates = graduates;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void fillStudentsList() {
        students.add(new Student("Joe Black", 5, "GR530"));
        students.add(new Student("Albert Einstein", 4, "GR430"));
        students.add(new Student("Erwin Shredinger", 3, "GR330"));
        students.add(new Student("Nicola Tesla", 2, "GR230"));
        students.add(new Student("Elon Mask", 1, "GR130"));
        students.add(new Student("Vladimir Putin", 5, "GR530"));
        students.add(new Student("Kirkmazhala Abdulbarekovich", 4, "GR430"));
        students.add(new Student("Magomed Magomedov", 3, "GR330"));
        students.add(new Student("Michael Vainstein", 2, "GR230"));
        students.add(new Student("Sveta Borisova", 1, "GR130"));
        students.add(new Student("Solomon Dandi", 5, "GR530"));
        students.add(new Student("Nikita Dzhigurda", 4, "GR430"));
    }

    public void fillStudentsSummaryList() {
        for (Student student : students) {
            student.fillSummaryList();
        }
    }

    public void printStudentsInfo() {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public void printGraduatesInfo() {
        for (Student graduate : graduates) {
            System.out.println(graduate);
        }
        System.out.println();
    }

    public void makeDecision() {
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (averageMark(student) >= 3) {
                student.updateCourse();
                if (student.isGraduate()) {
                    iterator.remove();
                    graduates.add(student);
                } else {
                    iterator.set(student);
                }
            } else {
                iterator.remove();
            }
        }
    }

    public double averageMark(Student student) {
        double averageMark = 0;
        for (Integer integer : student.getResults().values()) {
            averageMark += integer;
        }
        averageMark /= student.subjectsNumber();
        return averageMark;
    }
}
