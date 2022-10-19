public class MyQueue implements Queue {

    int counter = 1;
    int[] myArray;

    @Override
    public void add(int el) {
        int[] arrayBigger;
        if (counter >= myArray.length) {
            arrayBigger = new int[myArray.length * 2];
        } else {
            arrayBigger = myArray;

        }
        arrayBigger[counter] = el;
        for (int i = 0; i < myArray.length; i++) {

        }

        arrayBigger = myArray;
        counter++;
    }

    @Override
    public void remove() {
        int delete = myArray[0];
        int[] arraySmaller = new int[myArray.length - 1];
        for (int i = 0; i < myArray.length - 1; i--) {
            arraySmaller[i] = myArray[i];
        }
        arraySmaller = myArray;
        counter--;
    }


    @Override
    public boolean isEmpty() {
        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }
}
