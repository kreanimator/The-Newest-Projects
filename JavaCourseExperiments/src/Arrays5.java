import java.util.Arrays;
import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
        double[] myList = new double[10];

        for ( int i = 1; i < myList.length+1; i++){
            myList [i-1] = myList[i-1] + i;
        }
        System.out.println(Arrays.toString(myList));

        double max = myList[0];
        for (int k = 1; k < myList.length; k++) {
            if (myList[k] > max) max = myList[k];
        }
        System.out.println("Наибольший элемент: " + max);

        double min = myList[0];
        for (int k = 1; k < myList.length; k++) {
            if (myList[k] < min) min = myList[k];
        }
        System.out.println("Наименьший элемент: " + min);

        double sum = myList[0];
        for (int k = 1; k < myList.length; k++) {
            sum += myList[k];
        }
        System.out.println("Сумма элементов массива: " + sum);

        double average = myList[0];
        for (int k = 1; k < myList.length; k++) {
            average = sum/ myList.length;
        }
        System.out.println("Средняя арифметическая всех элементов массива: " + average);

        double mul = myList[0];
        for (int k = 1; k < myList.length; k++) {
            mul *= myList[k];
        }
        System.out.println("Произведение всех элементов массива: " + mul);

        double uncountable = myList[0];
        for (int k = 1; k < myList.length; k++) {
            if(myList[k]%2!=0){
                uncountable += myList[k];
            }
        }
        System.out.println("Сумма всех нечётных элементов массива: " + uncountable);

        double countable = myList[0];
        for (int k = 1; k < myList.length; k++) {
            if(myList[k]%2==0){
                countable += myList[k];
            }
        }
        System.out.println("Сумма всех чётных элементов массива: " + countable);

        double muluncountable = myList[0];
        for (int k = 1; k < myList.length; k++) {
            if(myList[k]%2!=0){
                muluncountable *= myList[k];
            }
        }
        System.out.println("Произведение всех нечётных элементов массива: " + muluncountable);

        double mulcountable = myList[0];
        for (int k = 1; k < myList.length; k++) {
            if(myList[k]%2==0){
                mulcountable *= myList[k];
            }
        }
        System.out.println("Произведение всех чётных элементов массива: " + mulcountable);

        int zero = 0;
        for (int k = 1; k < myList.length; k++) {
            if(myList[k] ==0){
                zero ++;
            }
        }
        System.out.println("Количество нулевых элементов массива: " + zero);

        int uncountables = 0;
        for (int k = 1; k < myList.length; k++) {
            if(myList[k] %2 !=0){
                uncountables++;
            }
        }
        System.out.println("Количество нечётных элементов массива: " + uncountables);

        int ks = 0;
        for (int k = 1; k < myList.length; k++) {
            if(myList[k] >k){
                ks++;
            }
        }
        System.out.println("Количество элементов, превышающих заданное число k: " + ks);

        int nks = 0;
        for (int k = 1; k < myList.length; k++) {
            if(myList[k] <k){
                nks++;
            }
        }
        System.out.println("Количество элементов, не превышающих заданное число k: " + nks);


    }

}
