public class RemoveQueue implements Queue{

    int rear;
    int maxSize;
    int [] queueArray;
    int currentSize;
    int front;

    @Override
    public int AddQueue(int el) {
        return 0;
    }

    @Override
    public int RemoveQueue(int el) {
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        //System.out.println("front= " + front + " maxSize= "+maxSize);
        // retrieve item then increment
        int temp = queueArray[front++];
        if(front == maxSize){
            front = 0;
        }
        currentSize--;
        return temp;
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
