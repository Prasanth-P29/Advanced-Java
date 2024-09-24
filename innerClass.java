class House
{
    int age;
    public void show()
    {
        System.out.println("In Show..");
    }
    //	class B
    //	{
    //		public void config()
    //		{
    //			System.out.println("in config");
    //		}
    //	}
    static class Door
   {
       public void config()
       {
           System.out.println("In Config..");
       }
   }
}
public class innerClass
{
    public static void main(String a[])
    {
        House obj = new House();
        obj.show();

        //Door obj1 = new Door();
        //House.Door obj1 = obj.new Door();
        House.Door obj1 = new House.Door();
        obj1.config();
    }
}