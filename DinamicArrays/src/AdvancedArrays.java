
import java.util.Arrays;

public class AdvancedArrays {
    private int[] array;
    int size;
    int el;
    int index;

    void createArray(int size) {
        this.array = new int[size];
        this.size = size;
        System.out.println("Massive :" + Arrays.toString(array) + "\n");
        System.out.println("Massive length:" + array.length + "\n");
    }

    void remove(int index) {

        if (index == size - 1) {
            this.array = Arrays.copyOf(array, --size);
            System.out.println("Massive after delete: " + Arrays.toString(array) + "\n");
            System.out.println("Massive length after delete: " + size +"\n");
        } else {
            int[] temp = new int[size - 1];
            System.arraycopy(array, 0, temp, 0, index);
            System.arraycopy(array, index + 1, temp, index, temp.length - index);
            this.array = temp;
            this.size = this.size - 1;
            System.out.println("Massive after delete: " + Arrays.toString(array)+ "\n");
            System.out.println("Massive length after delete: " + size + "\n");
        }

    }

    void setArray(int[] array) {
        this.array = array;
        this.size = array.length;
    }

    int size() {
        return size;
    }

    void add(int el) {
        this.array = Arrays.copyOf(array, size + 1);
        this.array[size] = el;
        this.size = size + 1;
        System.out.println("Massive after add: " + Arrays.toString(array) +"\n");
        System.out.println(" Size of the massive: " + size+"\n");

    }

    int get(int index) {
        return array[index];
    }

    void printArray() {
        System.out.println("Massive is printed:" + Arrays.toString(array));
    }
}
