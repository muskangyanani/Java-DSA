public class wrapper {
  public static void main(String[] args) {
    // int a = 8;

    // // Integer num = new Integer(78);
    // Integer num = 78;
    // // num is an object now.
    // // num. ----> This will give us so many functions 
    
    Integer a =10;
    Integer b =20;
    swap(a,b);
    System.out.println(a+ " " + b);       //wont be swapped
    // this is because the Integer class is a final class so objects of this class can not be modified.

    final A muskan = new A("Muskan Gyanani");
    muskan.name = "Another name";
    // when a non primitive is final you can not reassign it
    // muskan = new A("can not assign to new object");

    for (int i = 0; i < 1000; i++) {
      A obj = new A("random name");
    }
  }

  static void swap(Integer a, Integer b){
    Integer temp = a;
    a=b;
    b=temp;
  }
}

class A{
  String name;
  public A(String name){
    this.name = name;
  }

    @Override
    protected void finalize() throws Throwable {
      System.out.println("Object is destroyed");
    }
  
}