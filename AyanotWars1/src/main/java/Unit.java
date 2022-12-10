public class Unit{

    double exp = 0;
    double hp = 0;
    int level = 0;
    double damage = 0;

    public Unit() {

    }


    void attack(){
    }
    void getDamage(int value){
        this.hp -= value;
    }
    void increaseLevel(int value){
        this.exp += value;
        if (exp > 1000){
            level++;
        }
    }
    boolean isAlive (){
        return hp > 0;
    }

    }

