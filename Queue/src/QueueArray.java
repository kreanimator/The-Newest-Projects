public class QueueArray implements Queue{
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    @Override
    public int AddQueue(int el) {
        return 0;
    }

    public QueueArray(int size){
        this.maxSize = size;
        this.queueArray = new int[size];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    @Override
    public int RemoveQueue(int el) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int AddQueue() {
        return 0;
    }

}
