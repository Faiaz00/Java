class mobile
{
  String brand;
  int price;
  String model;
  static String type; // static variable is shared between all objects in a class. 
  // Class specific not Object specific.
  // static variables do not create same variables for each object rather creates only one variable that is shared by all the objects.
  // Saves memory space.

/*   static 
  {
    type = "Feature Phone"; // static block to initialize static variable
    system.out.println("Static block called");
  } */

  public void show()
  {
    System.out.println(brand + " : " + price + " : " + model + " : " + type);
  }

  public static void show1(mobile obj) // static method - uses only static variables not instance variables.
  {
    System.out.println(obj.brand + " : " + obj.price + " : " + obj.model + " : " + type);
    // That is how you use instance variables INDIRECTLY in static method.
  }
}


public class Static
{
public static void main(String[] args)
{
  mobile obj1 = new mobile();
  obj1.brand = "Iphone";
  obj1.price = 1400;
  obj1.model = "14 Pro";
  mobile.type = "Smartphone"; // Defining once is enough to be shared by all the objects in the entire class

  mobile obj2 = new mobile();
  obj2.brand = "Samsung";
  obj2.price = 1500;
  obj2.model = "S25";

  obj1.show();
  obj2.show();

  mobile.show1(obj1);
  mobile.show1(obj2);

}

}

