public class Magazine implements Printable{
    String name;
    public static void printMagazine (Printable [] printable){
        for (Printable m : printable){
            if ( m instanceof Magazine)
                m.print();
        }
    }
    public Magazine(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Printable print() {
        System.out.println("Magazine " + getName() + " is found\n");
        return null;
    }
}
