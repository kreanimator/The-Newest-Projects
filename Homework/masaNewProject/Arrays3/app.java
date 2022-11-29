package Arrays3;

public class app {
    public static void main(String[] args){
        
        int a=0;
        for(int i=1;i<=20;i++){
            if(i>0)a++;
        }
        
        int[] array = new int[a];
        for(int i=1,b=0;i<=20;i++){
                if(i>0){
                    array[b]=i;
                    System.out.print(array[b]+" ");
                    b++;
                }
        }
        System.out.println(" ");
        for(int i=array.length -1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
