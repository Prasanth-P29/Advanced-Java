// class - class -> extends
// class - interface -> implements
// interface - interface -> extends
interface A
{
    //	public abstract void show();
    //	public abstract void config();
    int age = 21;                //this variables are Final and Static.
    String area = "Cuddalore";

    void show();
    void config();
}
interface X
{
    void run();
}
interface Y extends X
{

}
class B implements A,Y
{
    public void show()
    {
       System.out.println("In Show..");
    }

    public void config()
    {
       System.out.println("In Config..");
    }
    public void run()
    {
       System.out.println("Running..");
    }
}
class Interface
{
    public static void main(String a[])
    {
        A obj ; // Reference of Interface A
        obj = new B();
        obj.show();
        obj.config();

        X obj1; // reference of Interface X
        obj1 = new B();
        obj.run();
      //A.area = "Nellikuppam";
      //A.age = 20; we cannot change the value once its assigned in the interface.
      //System.out.println(A.age);
      //System.out.println(A.area);

    }
}