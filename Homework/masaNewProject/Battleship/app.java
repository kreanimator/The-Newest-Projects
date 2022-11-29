public class app{
    public static void main(String[] args) {

        int ship1 =0;
        int ship2 = 0;
        int ship3 =0;

            int [][] battlefield = {
                    { 0,0,0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0,0,0},
                    { 0,0,0,0,0,0,0,0,0,0},
            };

            printMatrix(battlefield);}

    
        public static void printMatrix(int[][] battlefield) {
            for (int[] array : battlefield) {
                for (int anInt : array) {
                    System.out.print(String.format("%5d", anInt));
                }
                System.out.println();
            }
        }
    }
