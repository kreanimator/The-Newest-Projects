public class Camp {

int value;

    public Camp(int value) {
        this.value = value;
    }
    public Camp() {
        this(0);
    }
    public void addWood(int value){
        this.value += value;
    }
}
