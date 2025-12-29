class Computer
{
  public void playMusic()
  {
    System.out.println("Music Playing...");
  }

  public String getMeAPen(int cost)
  {
    if(cost == 10)
      return "Here's your pen"; // if true, executes this block and doesnt go below. Jumps out of the method.

    return "You need to pay exactly 10 cents"; //no need for else, since if above condition false then automatically comes here and return this statement.

  }
}

// Method overloading - using methods with same name but with different no.of parameters

class Calculator
{
  public int add(int n1, int n2)
  {
    return n1 + n2;
  }

  public int add(int n1, int n2, int n3)
  {
    return n1 + n2 + n3;
  }
}


public class method 
{
  public static void main(String[] args) 
  {
    Computer comp = new Computer();

    String ask_for_pen = comp.getMeAPen(5);

    System.out.println(ask_for_pen);

    comp.playMusic();

    Calculator obj = new Calculator();

    int sum = obj.add(3,7,10);

    System.out.println(sum);
  }
}
