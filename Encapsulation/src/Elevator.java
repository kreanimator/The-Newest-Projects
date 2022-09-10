public class Elevator {


    public int currentFloor = 1;
    public int maxFloor;
    public int minFloor;

    public Elevator(int maxFloor, int minFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }
    public void moveUp(){
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }
    public void moveDown (){
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
    public void move(int floor){
        if ( floor > maxFloor || floor < minFloor){
            System.out.println("Этаж задан неверно. Попробуйте снова.");
        }
        if ( currentFloor != floor){
            while (currentFloor > floor)
                moveDown();
            System.out.println("Текущий этаж: " + floor);
        }

    }
}