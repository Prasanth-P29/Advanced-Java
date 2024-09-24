class T
{
    public void show() throws ClassNotFoundException
    //  try{
    //      Class.forName("Class");
    //  }
    //  catch(ClassNotFoundException e){
    //      System.out.println("Not able to find the class");
    //  }

    {
       Class.forName("Calc");
}
}
public class DuckingException
{
  //  try{
  //      Class.forName("Calc");
  //  }
  //  catch(ClassNotFoundException e){
  //      System.out.println("Not able to find the class");
  //  }

    static {
        System.out.println("Class Loaded..");
    }
    public static void main(String a[])
    {
        T obj = new T();
        try {
            obj.show();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}