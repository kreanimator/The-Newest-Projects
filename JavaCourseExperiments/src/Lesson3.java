import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

            double soundSpeed = 1100; // feet in second
            double soundInt = 7.2;
            double distance = soundInt * soundSpeed;
            System.out.println("Distance to the lightning is " + distance + " feet.\n\n");


            int gravityOnMoon = 17;
            System.out.println("Enter your weight: ");
            Scanner scr = new Scanner(System.in);
            double myWeight = scr.nextInt();
            double myWeightOnMoon = myWeight * gravityOnMoon/100;
            System.out.println("Your weight on moon will be " + myWeightOnMoon + " kgs.");

    }

}
