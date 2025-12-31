class Student
{
  String name;
  int marks;
}


public class arrayobj
{
  public static void main(String[] args)
  {
    // Creating student objects
    Student s1 = new Student();
    s1.name = "Faiaz";
    s1.marks = 97;

    Student s2 = new Student();
    s2.name = "Rahim";
    s2.marks = 88;

    Student students[] = new Student[2]; 
    // Not creating student objects here. Creating an array of student references

    students[0] = s1;
    students[1] = s2;

    /*
    for(int i=0; i<students.length; i++)
    {
      System.out.println(students[i].name + " : " + students[i]. marks);
    }
    */

    for(Student student : students)
    {
      System.out.println(student.name + " : " + student.marks);
    }



  }

}

