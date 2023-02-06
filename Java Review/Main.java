public class Main {
  public static void main(String[] args)
  {
    Dog dog = new Dog();
    dog.name = "Stanley";
    dog.eat();
    dog.bark();

    int num = 0;

    try
      {
        int num2 = 5/num;
      }
    catch (ArithmeticException e)
      {
        System.out.println("Can't do it.");
      }
  }
}