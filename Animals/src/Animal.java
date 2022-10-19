public class Animal {

    String food;
    String location;
    String name;

    public Animal(String name,String food, String location) {
        this.food = food;
        this.location = location;
        this.name = name;
    }
    public void makeNoise(){
        System.out.println("Noise: ");

    }
    public void eat(){
        System.out.println("Eats: ");

    }
    public void sleep(){
        System.out.println("Sleep ");

    }


}
