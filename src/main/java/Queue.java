public class Queue {

    private QueueNode head = null; // we can wright without null also
    private QueueNode last = null;

    private int queueSize = 0;
    private final int maxSize;

    public Queue (int maxSize){
        this.maxSize = maxSize;
    }

    public void enqueue(int value){
        if (queueSize == maxSize){
            throw new IllegalStateException ("overflow");
        }
        QueueNode newNode = new QueueNode(value);
        queueSize++;
        if (last == null){
            last = newNode;
            head = newNode;
        } else {
            last.setTail(newNode);
            this.last = newNode;
        }
    }

    public int dequeue (){
        if (queueSize == 0){
            throw new IllegalStateException("underflow");
        } QueueNode oldHead = head;
        this.head = oldHead.getTail();

        if (this.head == null){
            this.last = null;
        }
        queueSize--;
        return oldHead.getValue();
    }

    public int size(){
        return queueSize;
    }

    public boolean isEmpty(){
        return queueSize == 0;
    }

    private class QueueNode{
        private final int value;
        private QueueNode tail;

        private QueueNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public QueueNode getTail() {
            return tail;
        }

        public void setTail(QueueNode tail) {
            this.tail = tail;
        }
    }

    @Override
    public String toString() {
        String displayQueue = "";
        if (head != null) {
            QueueNode node = head;
            displayQueue = displayQueue + node.getValue();

            while (node.getTail() != null) {
                node = node.getTail();
                displayQueue = displayQueue + " -> " + node.getValue();
            }
        }

        return "Queue size: " + size() + "   " + displayQueue;
    }

}
