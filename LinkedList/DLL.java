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

  public void insertLast(int value){
    Node node = new Node(value);
    Node last = head;
    node.next = null;
    if(head == null){
      node.prev = null;
      head = node;
    }
    while(last.next != null){
      last = last.next;
    }
    last.next = node;
    node.prev = last;
  }

  public Node find(int val){
    Node p = head;
    while(p != null){
      if(p.value == val){
        return p;
      }
      p = p.next;
    }
    return null;
  }

  public void insertAfter(int after, int val){
    Node p = find(after);
    if(p == null){
      System.out.println("Node does noe exist");
    }
    Node node = new Node(val);
    node.next = p.next;
    p.next = node;
    node.prev = p;
    if(node.next != null){
      node.next.prev = node;
    }
  }

  public void display(){
    Node node = head;
    Node last = null;
    System.out.println("Forward");
    while(node != null){
      System.out.print(node.value + " --> ");
      last = node;
      node = node.next;
    }
    System.out.println("END");
    System.out.println("Backward");
    while(last!=null){
      System.out.print(last.value + " --> ");
      last = last.prev;
    }
    System.out.println("START");
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
