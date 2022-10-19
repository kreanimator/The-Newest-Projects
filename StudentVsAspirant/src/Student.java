public class Student
{

    String firstName, lastName, group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    int getScholarship()
    {
        return averageMark == 5 ? 100:80;
    }
    public void studentPrint()
    {
        System.out.println("Student: " +firstName+" "+ lastName+ "\n"+
                "Group:"  + group +"\n"+ "Scholarship: " + getScholarship()+ "\n\n");
    }
}
