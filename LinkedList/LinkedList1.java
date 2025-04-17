public class LinkedList1 {

  private Node head;
  private Node tail;
  private int size;

  public LinkedList1(){
    this.size= 0; 
  }

  public void InsertAtFirst(int value){
    Node node = new Node(value);
    node.next = head;
    head = node;
    if(tail == null){
      tail = head;
    }
    size+=1; 
  }

  public void insertAtEnd(int value){
    if(tail == null){
      InsertAtFirst(value);
      return;
    }
    Node node = new Node(value);
    tail.next = node;
    tail = node;
    size++;
  }

  public void insert(int val, int index){
    if(index ==0 ){
      InsertAtFirst(val);
      return;
    }
    if(index == size){
      insertAtEnd(val);
    }

    Node temp = head;
    for (int i = 1; i < index; i++) {
      temp = temp.next;
    }
    Node node = new Node(val, temp.next);
    temp.next = node;
    size++;
  }

  public int deleteFirst(){
    int val = head.value;
    head = head.next;
    if(head == null){
      tail= null;
    }
    size--;
    return val;
  }

  public Node get(int index){
    Node node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  public int deleteLast(){
    if(size<=1){
      return deleteFirst();
    }
    int val = tail.value;
    tail = get(size-2);
    tail.next = null;
    size--;
    return val;
  }

  public int delete(int index){
    if(index==0){
      return deleteFirst();
    }
    if(index == size-1){
      return deleteLast();
    }

    Node prev = get(index-1);
    int val = prev.next.value;
    prev.next = prev.next.next;
    size--;
    return val;
  }

  public Node find(int val){
    Node node = head;
    while(node != null){
      if(node.value == val){
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public void display(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.value + " --> ");
      temp = temp.next; 
    }
    System.out.println("END");
  }

  private class Node{
    private int value;
    private Node next;

    public Node(int value){
      this.value = value;
    }

    public Node(int value, Node next){
      this.value = value;
      this.next = next;
    }
  }

}
