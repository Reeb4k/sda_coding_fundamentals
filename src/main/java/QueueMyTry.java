public class QueueMyTry {


    int[] queueArray;
    int currentSize = 0;

    public QueueMyTry(int size) {
        queueArray = new int[size];
    }

    public void enqueue(int value) {
        if (currentSize == queueArray.length) {
            throw new IllegalStateException("Overflow");
        }
        for (int i = currentSize - 1; i >= 0; i--) {
            queueArray[i + 1] = queueArray[i];
        }
        queueArray[0] = value;
        currentSize++;
    }

    public int dequeue() {
        if (currentSize == 0) {
            throw new IllegalStateException("Underflow");
        }
        int temporaryHead = queueArray[currentSize - 1];
        queueArray[currentSize - 1] = 0;
        currentSize--;
        return temporaryHead;
    }

    public void setQueueArray(int[] queueArray) {
        this.queueArray = queueArray;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int getCurrentSize() {
        return currentSize;
    }
}
