public class demo
{
  public static void main(String[] args)
  {
    int x = 8;
    int y = 7;
    int z = 6;

    if(x>y && x>z)
    System.out.println("Max value is: " + x); //Java is not dependent on indentation
    else if(y>z)
    System.out.println("Max value is: " + y);
    else
    System.out.println("Max value is: " + z);

    //Ternary operator 

    int n = 4;
    int k = 9;

    int result = (n%2==0) ? (k>10 ? 70:80):20;
    System.out.println(result);



  }



}