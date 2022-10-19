public class Dog {

    int drinkTime = 0;

    public void setDrinkTime(int time) {
        drinkTime = time;
    }

    public int getDrinkTime() {
        return drinkTime;
    }

    public boolean needsToGo() {
        if (getDrinkTime() > 4) {
            return true;
        }
        return false;
    }

}