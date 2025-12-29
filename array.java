public class array
{
  public static void main(String[] args)
  {
    //int num[] = {3,4,5}; // the [] specifies that it is not a regular variable rather an array
    //int num1[] = new int[4]; // you know the size but not the elements

    // 1D-Array
    int nums[] = {3,7,2,4};

    nums[1] = 6;
    
    System.out.println(nums[1]);

    // 2D-Array

    int nums1[][] = new int[3][4];

    //Assigning random values

    for(int i=0; i<3; i++)
    {
      for(int j=0; j<4; j++)
      {
        nums1[i][j] = (int)(Math.random()*10); // Would result in 0 if Math.random not in parenthesis
        //Math.random() generates a random value < 1
      }
    }

    // Printing the values

    for(int i=0; i<3; i++)
    {
      for(int j=0; j<4; j++)
      {
        System.out.print(nums1[i][j] + " ");
      }
      System.out.println();
    }

    //Alternate method: Using Enhanced for loops
    
    for (int n[]:nums1)
    {
      for (int m : n)
      {
        System.out.print(m + " ");
      }
      System.out.println();
    }

    
  }
}
