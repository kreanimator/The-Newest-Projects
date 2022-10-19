import org.testng.annotations.Test;

public class BlobservationTest {

    //                             {0,4,3}  =>  ["x"=0, "y"=4, "size"=3]
    private static int[][] gen0 = {{0,4,3}, {0,7,5},  {2,0,2}, {3,7,2}, {4,3,4},  {5,6,2}, {6,7,1}, {7,0,3}, {7,2,1}};
    private static int[][] gen1 = {{3,6,3}, {8,0,2},  {5,3,6}, {1,1,1}, {2,6,2},  {1,5,4}, {7,7,1}, {9,6,3}, {8,3,4}, {5,6,3}, {0,6,1}, {3,2,5}};
    private static int[][] gen2 = {{5,4,3}, {8,6,15}, {1,4,4}, {2,7,9}, {9,0,10}, {3,5,4}, {7,2,6}, {3,3,2}};

    private static int[][] invalidGen = {{4,6,3}, {3,2,-1}};



    private List<Map<String,Integer>> genToLstOfMap(int[][] g) {
        return Arrays.stream(g)
                .map( arr -> IntStream.range(0,3).boxed().collect(Collectors.toMap( i -> i==0 ? "x" : i==1 ? "y" : "size", i -> arr[i]==-1 ? null:arr[i] )) )
                .collect(Collectors.toList());
    }

    private List<List<Integer>> expArrToLofL(int[][] exp) {
        return Arrays.stream(exp)
                .map( arr -> Arrays.stream(arr ).boxed().collect(Collectors.toList()) )
                .collect(Collectors.toList());
    }



    @Test
    public void sampleTest1() {

        int[][] expArr0 = {{0,6,5}, {1,5,3}, {3,1,2}, {4,7,2}, {5,2,4}, {6,7,3}, {7,1,3}, {7,2,1}};
        int[][] expArr1 = {{1,5,5}, {2,6,3}, {4,2,2}, {5,6,2}, {5,7,3}, {6,1,4}, {7,2,4}};
        int[][] expArr2 = {{4,3,23}};


        Blobservation blobs = new Blobservation(8);
        blobs.populate(genToLstOfMap(gen0));

        blobs.move();
        checker(blobs, expArr0);

        blobs.move();
        checker(blobs, expArr1);

        blobs.move(1000);
        checker(blobs, expArr2);
    }



    @Test
    public void sampleTest2() {

        int[][] expArr0 = {{0,6,1},  {1,1,1},  {1,6,2}, {2,1,5}, {2,6,7}, {4,2,6},  {6,7,3}, {7,1,2}, {7,4,4},  {7,7,1}, {8,7,3}};
        int[][] expArr1 = {{0,6,7},  {1,5,3},  {2,2,6}, {4,1,6}, {6,1,2}, {6,4,4},  {6,6,7}};
        int[][] expArr2 = {{2,4,13}, {3,3,3},  {6,1,8}, {6,2,4}, {6,4,7}};
        int[][] expArr3 = {{1,4,4},  {2,4,13}, {2,7,9}, {3,3,5}, {3,5,4}, {5,4,3},  {6,1,8}, {6,2,4}, {6,4,7},  {7,2,6}, {8,6,15}, {9,0,10}};
        int[][] expArr4 = {{2,4,9},  {3,3,13}, {3,6,9}, {4,4,4}, {5,3,4}, {5,4,10}, {6,2,6}, {7,2,8}, {7,5,15}, {8,1,10}};
        int[][] expArr5 = {{4,3,22}, {5,3,28}, {5,4,9}, {6,2,29}};
        int[][] expArr6 = {{5,3,88}};

        Blobservation blobs = new Blobservation(10,8);

        blobs.populate(genToLstOfMap(gen1));
        blobs.move();
        checker(blobs, expArr0);
        blobs.move(2);
        checker(blobs, expArr1);
        blobs.move(2);
        checker(blobs, expArr2);

        blobs.populate(genToLstOfMap(gen2));
        checker(blobs, expArr3);
        blobs.move();
        checker(blobs, expArr4);
        blobs.move(3);
        checker(blobs, expArr5);

        assertFailMove(blobs, -3);

        blobs.move(30);
        checker(blobs, expArr6);

        assertFailPopulate(blobs, invalidGen);
    }


    private void checker(Blobservation blobs, int[][] expAsArr) {
        assertEquals(expArrToLofL(expAsArr), blobs.printState());
    }

    private void assertFailMove(Blobservation blobs, int m) {
        try {
            blobs.move(m);
            fail(String.format("Call of 'move(%d)' should have raised a RuntimeException", m));
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }

    private void assertFailPopulate(Blobservation blobs, int[][] gen) {
        try {
            blobs.populate(genToLstOfMap(gen));
            fail("Invalid elements should trigger a RuntimeException in 'populate'");
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }

}