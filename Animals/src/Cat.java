public class Cat extends Animal{

    String name;

    public Cat(String name,String food, String location) {
        super(name, food, location);
        this.name = name;
    }

    @Override
    public void makeNoise(){
        System.out.println("Meow");
    }
    @Override
    public void eat(){
        System.out.println("Cat eats: ");
    }
    @Override
    public void sleep(){
        System.out.println("Cat sleeps!");
    }
}
