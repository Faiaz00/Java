class Calculator
{
  int a = 1;

  public int add(int n1,int n2)
  {
    int r = n1 + n2;
    return r;

  }

}


public class object 
{
  public static void main(String[] args) 
  {
    //object - has property: knows something
    // has behaviour: does something

    //design class files -> Byte code -> JVM -> creates object

    int num1 = 4;
    int num2 = 5;

    Calculator calc = new Calculator();
    // type - reference variable = new - object/design

    int result = calc.add(num1,num2);

    System.out.println(result);

  }

}
