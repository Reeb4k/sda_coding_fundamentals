public class LinkedStack {

    private final int maxSize;
    private int stackSize = 0;
    private StackNode head = null; // head doesn't exist in the beginning

    public LinkedStack(int maxSize) {
        this.maxSize = maxSize; //constructor of LinkedStack
    }

    public void push(int value) {
        if (stackSize == maxSize) { // doesn't let to push, if stack is full
            throw new IllegalStateException("overflow");
        }
        StackNode oldHead = this.head;
        StackNode newHead = new StackNode(value,oldHead);
        this.head = newHead;
        stackSize++;
        /*this.head = new StackNode (value, this.head)
        Java first makes new StackNode (with new value and current head) than makes new head
        reads from left to right*/
    }

    public int pop() {
        if (isEmpty()){
            throw new IllegalStateException("underflow");
        }
        StackNode temp = head;
        this.head = head.getTail();
        stackSize--;
        return temp.getValue();
    }

    public int size() {
        return stackSize;
    }

    public boolean isEmpty() {
        return stackSize == 0;
    }

    public String toString(){
        String display = "";

        if (head != null){
            StackNode currentNode = head;
            display = display + currentNode.getValue();

            while (currentNode.tail != null){
                currentNode = currentNode.tail;
                display = display + " -> " + currentNode.getValue();
            }

        }
        return display + " Stack size is " + stackSize;
    }

    private class StackNode {
        private final int value;
        private final StackNode tail;

        public StackNode(int value, StackNode previousHead) {
            this.value = value;
            tail = previousHead;
        }

        public int getValue() {
            return value;
        }

        public StackNode getTail() {
            return tail;
        }
    }
}
