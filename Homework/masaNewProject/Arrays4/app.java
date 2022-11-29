public class app{
    public static void main(String[] args) {
        int[] array = {10, 30, 20, 50, 40, 10};
        int sum = 0;
        int mult = 0;
        for( int i = 0; i < array.length; i++)
        {

            sum = sum + array[i];
            System.out.println("Сумма элементов массива равна: " + sum);
        break;
        }
        
        for (int i = 0; i < array.length; i++){
            mult = sum * array[i];
            System.out.println("Произведение элементов массива равна: " + mult);
            break;
        }

     }
  }

