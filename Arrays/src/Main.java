public class Main {
    public static void main(String[] args) {

            int [i] myArray = new int [10];
            int myNum = (int)Math.round(Math.random()*10);

            for (int i = 0; i < myArray.length; ++ i );
            {
                myArray[ i ]=(int)Math.round(Math.random()*10);
            }


            for ( int i = 0 ; i < myArray.length; ++i);
            {
                if(myArray[ i ] == myNum)
                {
                    System.out.println("Number found : " + Integer.toString(myNum));

                }
            }

        }

    }
}
