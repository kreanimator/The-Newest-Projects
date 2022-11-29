import java.lang.reflect.Array;
import java.util.Arrays;

public class app{
public static void main(String[] args) {
	int[] arr =new int[20];
	int pos =0;
	int cons =0 ;
	int chet = 0;
	int zero = 0;
	int nechet = 0;

	for (int i = 0; i < arr.length; i++) {
		arr[i] = (int)(Math.random()*20);
		if (arr[i] >= 0) {
			pos++;
		}
		else{
			cons--;
		}
		if (arr[i] % 2 ==0){
			chet ++;
		}
		else{
			nechet++;
		}
		if(arr[i]==0){
			zero++;
		}
		System.out.println(Arrays.toString(arr));
	System.out.println("В массиве " + pos + " положительных элементов\n"+
	"В массиве " + cons + " отрицательных элементов\n"+
	"В массиве " + zero + " нулей\n"+
	"В массиве " + chet + " чётных элементов\n"+
	"В массиве " + nechet + " нечётных элемонтов");
}
}
}


