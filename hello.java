public class hello
{
    public static void main(String[] args)
    {
      int num1 = 3;
      int num2 = 5;
      int result = num1 + num2;
      System.out.println(result);
      System.out.println(3+3);

      //primitive data type:

      byte by = 127;
      short sh = 222;
      long ln = 1222l;

      float f = 5.8f;
      // by deafult integer type --> double

      double d = 5.8;

      char k = 'K';
      char m = '8';   //literals means values

      System.out.println(m);

      boolean b = true;

      int num3 = 0b101; //binary
      System.out.println(num3);

      int num4 = 0x7E; //hexadecimal
      System.out.println(num4);

      int num5 = 10_00_00_000; //can use underscore
      System.out.println(num5);

      double num6 = 12e10;
      System.out.println(num6);

      char c = 'a';
      c++;
      System.out.println(c);


      byte b1 = 127;
      int a1 = 12;

      b1 = (byte)a1; //doesnt work until you typecast it (EXPLICIT conversion)
      a1 = b1; //automatic (Implicit conversion)

      float f1 = 5.6f;
      int i1 = (int)f1;
      System.out.println(i1);

      int a2 = 250;
      byte b2 = (byte)a2; //big box to smaller box storage so result = 250%256 
      System.out.println(b2);

      byte b3 = 30;
      byte b4 = 10;
      int result2 = b3*b4; //type promotion as product of these bytes produces a result out of range
      //so byte result automatically converts to int. (No need for typecasting)
      System.out.println(result2);  
      
      int num8 = 7;
      num8++;  //post increment
      ++num8;  //pre increment 
      // no change in result if used individual statement

      int result5 = num8++; // fetch the value first and then increment it
      System.out.println(result5);
      result5 = ++num8; //increment the value first and then fetch it
      System.out.println(result5);



    }
}