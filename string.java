public class string
{
  public static void main(String[] args)
  { 
    // Immutable String
    String name = "Faiaz"; // String is basically a class
    //String name = new String("Faiaz"); // Object of class string is created auto behind the scene

    System.out.println("Hello " + name);
    System.out.println(name.charAt(1));
    System.out.println(name.concat(" Fahmid"));

    // Mutable String
    StringBuffer sb = new StringBuffer("Faiaz"); // stringbuffer - thread safe
    sb.append(" Fahmid");
    System.out.println(sb.length());
    System.out.println(sb.capacity());

    StringBuilder sbd = new StringBuilder("Faiaz"); // stringbuilder - not thread safe
    sbd.append(" Fahmid");
    System.out.println(sbd.insert(6,"Java ")); 

  }
}