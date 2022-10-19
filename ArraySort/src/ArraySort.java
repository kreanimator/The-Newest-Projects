import java.util.Arrays;


public class ArraySort {
    public static void main(String[] args) {

        int[] array = fillArray();
        boolean isSorted = true;


        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;

            }
        }
        if (isSorted) {
            System.out.println("Array is sorted!");
        } else {
            System.out.println(" Array is not sorted!");

        }
    }

    public static int[] fillArray() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 5);


        }
        System.out.println(Arrays.toString(array));
        System.out.println(" ");
        return array;
    }
}


