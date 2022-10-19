public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone(100876,"Nokia",400);
        Phone phone1 = new Phone(123345, "Vertu", 589);

        System.out.println("Telephone Article №: "+ phone.getNumber()+"\nModel: "+ phone.getModel()+ "\nWeight: " + phone.getWeight());
        System.out.println();
        System.out.println("Telephone Article №: "+ phone1.getNumber()+"\nModel: "+ phone1.getModel()+ "\nWeight: " + phone1.getWeight());
    }
}

