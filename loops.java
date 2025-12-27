public class loops
{
  public static void main(String[] args)
  {
    int i = 1;

    while(i<=4)
    {
      System.out.println("Hi " + i);

      int j = 1;

      while(j<=3)
      {
        System.out.println("Hello " + j);
        j++;
      }
      i++;
    }

    System.out.println("Bye " + i);

    int m = 5;

    do
    {
      System.out.println("Meow " + m);
      m++;
    }while(m<=4);  // doesnt check condition for the first time and executes atleast once
    
    for(int k=0; k<7; k++)
    {
      System.out.println("day " + (k+1)); // in brackets to avoid concatenation 
      
      for(int l=9; l<19; l++)
      {
        System.out.println("hour " + l);
      }
    }



  }

}
