package stackandqueues;
import java.util.Stack;

public class QueueUsingStack{
  public static void main(String[] args) {
    QueueByStack queue = new QueueByStack();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    queue.display();
    queue.remove();
    queue.remove();
    queue.display();
    queue.peek();
  }
}

class QueueByStack{
  private Stack<Integer> First;
  private Stack<Integer> Second;

  public QueueByStack() {
    First = new Stack<>();
    Second = new Stack<>();
  }

  // ==============Insertion Optimized=================
  public void add(int item){
    First.push(item);
  } 

  public int remove(){
    // insert in second
    while(!First.isEmpty()){
      Second.push(First.pop());
    }
    // pop from second
    int removed = Second.pop();
    // insert remaining in first
    while(!Second.isEmpty()){
      First.push(Second.pop());
    }
    return removed;
  }

  // ==================Removal optimized==================
  // public void add(int item){
  //   while(!First.isEmpty()){
  //     Second.push(First.pop());
  //   }
  //   First.push(item);
  //   while(!Second.isEmpty()){
  //     First.push(Second.pop());
  //   }
  // }

  // public int remove(){
  //   return First.pop();
  // }

  public void peek(){
   System.out.println(First.firstElement());
  }

  public void display(){
    System.out.println(First);
  }
}
