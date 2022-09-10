import java.util.Scanner;

public class Arithmetic {

    public int number1;
    public int number2;

    public Arithmetic ( int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int sum() {return number1 + number2;}
    public int multiplication (){return number1 * number2;}
    public int maximum (){return Math.max(number1,number2);}
    public int minimum () {return Math.min(number1,number2);}
}
