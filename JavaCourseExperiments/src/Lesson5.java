import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args) {
        System.out.println("x^2 на интервале [0, 10]\n");
        double lowerBound = 0;
        double upperBound = 10;
        double maxValue = 0;
        double maxX = 0;
        for (double x = lowerBound; x <= upperBound; x += 0.01) {
            double y = Math.pow(x, 2);
            if (y > maxValue) {
                maxValue = y;
            }
            if (x > maxX) {
                maxX = x;
            }
        }
        System.out.println("Function max value is: " + maxValue);
        System.out.println("X max value is : " + maxX + "\n");

        System.out.println("x^2 – x + 3 на интервале [-15, 15]\n");
        double lowerBound1 = -15;
        double upperBound1 = 15;
        double maxValue1 = 0;
        double maxX1 = 0;
        for (double x = lowerBound1; x <= upperBound1; x += 0.01) {
            double y = Math.pow(x, 2) - x + 3;
            if (y > maxValue1) {
                maxValue1 = y;
            }
            if (x > maxX1) {
                maxX1 = x;
            }
        }
        System.out.println("Function max value is: " + maxValue1);
        System.out.println("X max value is : " + maxX1 + "\n");

        System.out.println("sin(x) + x^2 на интервале [-10, 10)\n");
        double lowerBound2 = -10;
        double upperBound2 = 10;
        double maxValue2 = 0;
        double maxX2 = 0;
        for (double x = lowerBound2; x <= upperBound2; x += 0.01) {
            double y = Math.sin(x) + Math.pow(x, 2);
            if (y > maxValue2) {
                maxValue2 = y;
            }
            if (x > maxX2) {
                maxX2 = x;
            }
        }
        System.out.println("Function max value is: " + maxValue2);
        System.out.println("X max value is : " + maxX2 + "\n");

        System.out.println("cos(x) + x^2 на интервале [-10, 10)\n");
        double lowerBound3 = -10;
        double upperBound3 = 10;
        double maxValue3 = 0;
        double maxX3 = 0;
        for (double x = lowerBound3; x <= upperBound3; x += 0.01) {
            double y = Math.cos(x) + Math.pow(x, 2);
            if (y > maxValue3) {
                maxValue3 = y;
            }
            if (x > maxX3) {
                maxX3 = x;
            }
        }
        System.out.println("Function max value is: " + maxValue3);
        System.out.println("X max value is : " + maxX3 + "\n");

        System.out.println("x^3 на интервале [-50, 50]\n");
        double lowerBound4 = -50;
        double upperBound4 = 50;
        double maxValue4 = 0;
        double maxX4 = 0;
        for (double x = lowerBound4; x <= upperBound4; x += 0.01) {
            double y = Math.pow(x, 3);
            if (y > maxValue4) {
                maxValue4 = y;
            }
            if (x > maxX4) {
                maxX4 = x;
            }
        }
        System.out.println("Function max value is: " + maxValue4);
        System.out.println("X max value is : " + maxX4 + "\n");


        System.out.println("1/ x^3 на интервалах [-10, -1] и [1, 10]\n");
        double lowerBound5 = 1;
        double upperBound5 = 10;
        double maxValue5 = 0;
        double maxX5 = 0;
        for (double x = lowerBound5; x <= upperBound5; x += 0.01) {
            double y = Math.pow(x, 3);
            if (y > maxValue5) {
                maxValue5 = y;
            }
            if (x > maxX5) {
                maxX5 = x;
            }
        }
        System.out.println("Function max value is: " + maxValue5);
        System.out.println("X max value is : " + maxX5 + "\n");
        }
    }

