public class Forest {
    int value;
    public Forest(){
        this(5000);
    }
    public Forest(int value) {
        this.value = value;
    }
    public int getWood() throws InterruptedException {
        this.value -=10;
        System.out.println(this.value + " wood left! ");
        Thread.sleep(1000);
        return 10;
    }
}
