public class QueueUserMyTry {
    static QueueMyTry queue1 = new QueueMyTry(5);

    public static void main(String[] args) {
        System.out.println("Is queue empty? " + queue1.isEmpty());
        queue1.enqueue(4);
        System.out.println("Queue currents size is " + queue1.getCurrentSize());
        queue1.enqueue(6);
        System.out.println("Queue currents size is " + queue1.getCurrentSize());
        queue1.enqueue(5);
        System.out.println("Queue currents size is " + queue1.getCurrentSize());
        queue1.enqueue(3);
        System.out.println("Queue currents size is " + queue1.getCurrentSize());
        queue1.enqueue(1);
        System.out.println("Queue currents size is " + queue1.getCurrentSize());
        System.out.println("Is queue empty? " + queue1.isEmpty());
        System.out.println(queue1.dequeue());
        System.out.println("Queue currents size is " + queue1.getCurrentSize());
        System.out.println(queue1.dequeue());
        System.out.println("Queue currents size is " + queue1.getCurrentSize());
        System.out.println(queue1.dequeue());
        System.out.println("Queue currents size is " + queue1.getCurrentSize());
        System.out.println("Is queue empty? " + queue1.isEmpty());
        queue1.enqueue(5);
        queue1.enqueue(7);
        System.out.println("Queue currents size is " + queue1.getCurrentSize());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println("Queue currents size is " + queue1.getCurrentSize());
        }
}
