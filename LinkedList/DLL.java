public class DLL {

  Node head;

  public void insertFirst(int value){
    Node node = new Node(value);
    node.next = head;
    node.prev = null;
    if(head != null){
      head.prev = node;
    }
    head = node;
  }

  public void display(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.value + " <--> ");
      temp = temp.next;
    }
    System.out.println("END");
  }
  public void displayReverse(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.value + " <--> ");
      temp = temp.next;
    }
    System.out.println("END");
  }

  private class Node {
    private int value;
    private Node next;
    private Node prev;

    public Node(int value){
      this.value = value;
    }

    public Node(int value, Node next, Node prev){
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }
}
