public class basic {
  public static void main(String[] args) {
    Student muskan = new Student();
    muskan.rno= 46;
    muskan.name = "Muskan";
    muskan.marks = 87.2f;
    System.out.println(muskan.rno);
    System.out.println(muskan.name);
    System.out.println(muskan.marks);
  }

}

class Student{
  int rno;
  String name;
  float marks;
}