import java.util.Arrays;

    public static void main(String args[]){
        int  [] array = {1, 4, 5, 6, 8, 9, 78, 9, 45, 10};
        int n = 1;
        System.out.println("Array "+Arrays.toString(array));

        ShiftToRight(array,9);
    }
    public static void ShiftToRight(int a[],int n){
        int temp = a[n];

        for (int i = n; i > 0; i--) {
            a[i] = a[i-1];
        }

        a[0] = temp;

        System.out.println("Array after shifting to right by one : "+Arrays.toString(a));

    }
        
    }
