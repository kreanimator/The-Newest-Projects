import java.util.Arrays;
import java.util.Random;

public class app{
    public static void main(String[] args) {
 
        int[] arr10 = new int[10];
        Random rd = new Random();
 
        for (int i = 0; i < arr10.length; i++) {
            arr10[i] = nextInt(rd, arr10.length, i);
        }
 
        int min, max = min = arr10[0];
 
        System.out.println(Arrays.toString(arr10));
 
        for (int i : arr10) {
            min = Math.min(min, i);
            max = Math.max(max,i);
        }
 
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        
    }
 
    public static int nextInt(Random rd, int max, int min){
        return rd.nextInt(Math.abs(max - min) + 1) + min;
    }
}

    