package stackandqueues;

public class QueueMain {
  public static void main(String[] args) throws Exception {
    // CustomQueue queue = new CustomQueue();
    // queue.insert(3);
    // queue.insert(4);
    // queue.insert(6);
    // queue.insert(21);
    // queue.insert(24);
    // queue.display();
    // System.out.println(queue.remove());
    // queue.display();

    CircularQueue queue = new CircularQueue(5);
    queue.insert(3);
    queue.insert(4);
    queue.insert(6);
    queue.insert(21);
    queue.insert(24);
    queue.display();
    System.out.println(queue.remove());
    queue.display();
  }
}
