public class IsEmptyQueue implements Queue{
    int maxSize;
    int currentSize;

    @Override
    public int AddQueue(int el) {
        return 0;
    }

    @Override
    public int RemoveQueue(int el) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        if (isEmpty() == false){
            return (maxSize == currentSize);
        }else {
            return (currentSize == 0);
        }
    }

    @Override
    public int AddQueue() {
        return 0;
    }


}
