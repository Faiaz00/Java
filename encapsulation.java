class Human
{
  private int age;
  private String name; 
  // private variables cannot be accessed by other classes except for its own class.

  public int getAge()
  {
    return age;
  }

  public void setAge(int a)
  {
    age = a;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String n)
  {
    name = n;
  }
  // private variables can only be accessed by other classes using methods created in the same class.
}

public class encapsulation
{
  public static void main(String[] args)
  {
    Human obj = new Human();
    obj.setAge(21);
    obj.setName("Faiaz");

    System.out.println(obj.getName() + " : " + obj.getAge());

  }
}