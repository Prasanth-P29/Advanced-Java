/*abstract class Computer
{
    public abstract void code();

}
 */
interface Computer
{
    void code();
}
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code, Compile, Run");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code, Compile, Run : Faster");
    }
}
class Developer
{
    public void devApp(Computer lap)
    {
      //System.out.println("Coding..");
        lap.code();
    }
}
class NeedInterface
{
    public static void main(String a[])
    {
      //Laptop lap = new Laptop();
      //Desktop desk = new Desktop();

        Computer lap = new Laptop(); // with reference of Computer we create the object of Laptop.This two objects are reference of interfaces.
        Computer desk = new Desktop();// with reference of Computer we create the object of Computer.

        Developer prasanth = new Developer();
        prasanth.devApp(desk);

    }
}
