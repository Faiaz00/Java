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

    int a = 5;

    switch(a)
    {
      case 1:
      System.out.println("Monday");
      break;

      case 2:
      System.out.println("Tuesday");
      break;

      case 3:
      System.out.println("Wednesday");
      break;

      case 4:
      System.out.println("Thursday");
      break;

      case 5:
      System.out.println("Friday");
      break;

      case 6:
      System.out.println("Saturday");
      break;

      case 7:
      System.out.println("Sunday");
      break;

      default:
      System.out.println("Valid days are 1 to 7");
    }
      
    // With Strings

    String day = "Monday";

    switch(day)
    {
      case "Saturday","Sunday":
      System.out.println("6am");
      break;

      case "Monday":
      System.out.println("8am");
      break;

      default:
      System.out.println("7am");

    }

    // Without breaks

    String day1 = "Monday";
    String time = "";

    switch(day1)
    {
      case "Saturday","Sunday" -> time = "6am"; // cannot use -> and : in the same switch-case
      case "Monday" -> time = "8am";
      default -> time = "7am"; 

    }

    /* result = switch(day1)
    {
      case "Saturday","Sunday" -> "6am"; //another method to return value directly
      case "Monday" -> "8am";
      default -> "7am";       
    } */

    System.out.println(time);


  }
}