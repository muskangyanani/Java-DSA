public class Main {
  public static void main(String[] args) {
    // ===========Singly LL================
    // LinkedList1 list = new LinkedList1();
    // list.InsertAtFirst(3);
    // list.InsertAtFirst(4);
    // list.InsertAtFirst(5);
    // list.InsertAtFirst(6);
    // list.insertAtEnd(99);
    // list.insert(109, 2);
    // list.display();
    // System.out.println(list.deleteFirst()); 
    // list.display();
    // System.out.println(list.deleteLast()); 
    // list.display();
    // System.out.println(list.delete(2)); 
    // System.out.println(list.find(109));
    // list.display();
    
    
    // ===========Doubly LL================
    DLL list = new DLL();
    list.insertFirst(3);
    list.insertFirst(2);
    list.insertFirst(1);
    list.insertLast(88);
    list.insertAfter(2, 65);
    list.insertAfter(88, 76);
    list.display();
  }
}
