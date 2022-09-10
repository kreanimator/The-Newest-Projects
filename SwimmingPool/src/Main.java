public class Main {
    public static void main(String[] args) {

        int volume = 1200;
        int fillingSpeed = 30; // 30 litres per minute
        int drainSpeed = 10; // 10 litres per minute
        int poolNow = 0;
        int time = 0;

        while ( poolNow <= volume){
            poolNow = ((poolNow + fillingSpeed)- drainSpeed);
            time = time + 1;
            System.out.println(poolNow +"-" + time+ "min.00 sec.");
            if ( poolNow == volume)
            break;}
        {System.out.println("Бассейн полон!");}
    }
}
