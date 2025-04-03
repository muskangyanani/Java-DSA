public class basic {
  public static void main(String[] args) { 
    // Student muskan = new Student();
    // Student muskan = new Student(23, "abc", 45.5f);
    // muskan.rno= 46;
    // muskan.name = "Muskan";
    // muskan.marks = 87.2f;
    // System.out.println(muskan.rno);
    // System.out.println(muskan.name); 
    // System.out.println(muskan.marks);
    Student muskan2 = new Student(23, "abc", 45.5f);  
    // System.out.println(muskan2.rno);
    // System.out.println(muskan2.name);
    // System.out.println(muskan2.marks);
    // Student muskan3 = new Student(muskan2);
    // System.out.println(muskan3.rno);
    // System.out.println(muskan3.name);
    // System.out.println(muskan3.marks);
    Student muskan4 = new Student();
    System.out.println(muskan4.rno);
  }

}

class Student{
  int rno;
  String name;
  float marks;

  // default constructor
  // Student (){
  //   this.rno = 5;
  //   this.name = "abc";
  //   this.marks = 89.2f;
  // }

  // parameterized constructor
  Student (int rno, String name, float marks){
    this.rno = rno;
    this.name = name;
    // this.marks = 89.2f;
  }

  // copy constructor
  Student (Student other){
    this.rno = other.rno;
    this.name = other.name;
    this.marks = other.marks;
  }
  // constructor chaining
  Student (){
    // this is how you call a constructor from another constructor
    this (5, "abc", 89.2f);
  }
}