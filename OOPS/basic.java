public class basic {
  public static void main(String[] args) { 
    Student muskan = new Student();
    // Student muskan = new Student(23, "abc", 45.5f);
    // muskan.rno= 46;
    // muskan.name = "Muskan";
    // muskan.marks = 87.2f;
    System.out.println(muskan.rno);
    System.out.println(muskan.name);
    System.out.println(muskan.marks);
    
  }

}

class Student{
  int rno;
  String name;
  float marks;

  Student (){
    this.rno = 5;
    this.name = "abc";
    this.marks = 89.2f;
  }
}