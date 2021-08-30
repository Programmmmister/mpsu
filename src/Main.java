import Queue.Queue;
import Stack.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.pushValue(1);
        stack.pushValue(1);
        stack.pushValue(1);

        stack.printAll();
        System.out.println(stack.isFull());
    }
}
