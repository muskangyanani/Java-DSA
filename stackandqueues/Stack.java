package stackandqueues;
public class Stack {
  public static void main(String[] args) {
    // Stack<Integer> stack = new Stack<>();
    // stack.push(34);
    // stack.push(23);
    // stack.push(29);
    // stack.push(12);
    // System.out.println(stack.pop());

    // Queue<Integer> queue = new LinkedList<>();
    // queue.add(7);
    // queue.add(12);
    // queue.add(34);
    // queue.add(54);
    // queue.add(22);
    // System.out.println(queue);
    // System.out.println(queue.peek());
    // System.out.println(queue.remove());
    // System.out.println(queue);

    // Deque<Integer> deque = new ArrayDeque<>();
    // deque.add(2);
    // deque.addFirst(3);
    // deque.addLast(7);
    // deque.removeFirst();
    // deque.removeLast();

    // CustomStack stack = new CustomStack(3);
    // stack.push(34);
    // stack.push(23);
    // stack.push(29);
    // stack.push(12);
    // System.out.println(stack.pop());

    DynamicStack dstack = new DynamicStack(4);
    dstack.push(34);
    dstack.push(23);
    dstack.push(29);
    dstack.push(12);
    dstack.push(18);
    dstack.push(15);
    dstack.push(16);
    System.out.println(dstack.peek());
  }
}
