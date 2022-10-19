public class Person {

    String fullName;
    int age;


    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;

    }

    public void PersonTalk() {
        System.out.println("My name is " + fullName + " My age is: " + age + " ");
    }

    public void PersonMove() {
        System.out.println("Today I'm going to kill!");
    }

}
