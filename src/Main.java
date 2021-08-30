import Queue.Queue;

public class Main {

    public static void main(String[] args) {
	    Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(3);

        queue.printAll();
        System.out.println(queue.peek());
    }
}
