public abstract class Unit {

    protected int hp = 0;
    void getDamage(int value){
        this.hp -= value;

    }
    void  status(){
        System.out.println(this.getClass().getSimpleName()+": " + hp);
    }
    boolean isAlive(){
       return hp > 0;
    }
}

