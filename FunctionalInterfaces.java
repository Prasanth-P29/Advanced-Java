@functionalInterface
//-->by using this annotation,it shows the error.
interface P
{
    void show();
   // void run();
}
//class Q implements P --> With this we cant instantiate the interface P.
//{
//    public void show()
//    {
//        System.out.println("The Show is Started..!");
//    }
//}
public class FunctionalInterfaces
{
    public static void main(String a[])
    {
      //P obj = new Q();
        P obj = new P()//--> We can instantiate the class which implements the interface P so we use Anonymous class.
        {
            public void show()
            {
                System.out.println("The Show is Started..!");
            }
        };
        obj.show();
    }
}