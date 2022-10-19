public class Aspirant extends Student {
    String scientificWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }
    public String getScientificWork()
    {
        return scientificWork;
    }
    @Override
    public int getScholarship()
    {
        return averageMark == 5 ? 200 : 180;
    }
    public void aspirantPrint ()
    {
        System.out.println("Aspirant: "+ firstName+" " + lastName+ "\n"+
                "Group:"  + group +"\n" + "Scientific work: " + getScientificWork()+
                "\nScholarship: " + getScholarship()+ "\n\n");
    }
}
