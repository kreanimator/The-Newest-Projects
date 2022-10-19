public class Book implements Printable {

    String name;

    public static void printBooks(Printable[] printable){
        for (Printable b : printable) {
            if (b instanceof Book)
                b.print();
        }
    }
    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Printable print (){
        System.out.println("Book " + getName() + " is found!\n");
        return null;
    }
}

