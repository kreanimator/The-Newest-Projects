public class University
{
    public static void main(String[] args)
    {
        Student student = new Student("John", "Brown", "Quantum Mechanics", 5);
        Student student1 = new Student("Joe", "Black", "Strings Theory", 4);
        Aspirant aspirant = new Aspirant("Gordon", "Freeman", "Quantum Paradoxes", 5, "Xen theory");
        Aspirant aspirant1 = new Aspirant("Alice", "Iranon", "Natural Philosophy", 4, "The mystery of the legend 108");

        student.studentPrint();
        student1.studentPrint();
        aspirant.aspirantPrint();
        aspirant1.aspirantPrint();

    }
}
