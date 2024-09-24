@functionalInterface
interface M
{
   // void run();
   // void run(int i);
    int add(int i,int j);
}
public class LambdaExpression
{
    public static void main(String a[])
    {
        //M obj = new M()
        //{
        //    System.out.println("The Program is Running..");
        //};

      // M obj = () ->     //This is Lambda Expression.
        //         System.out.println("The Program is Running..");

        //M obj = (i) -> System.out.println("The Program is Running.." + i);

       // M obj = i -> System.out.println("The Program is Running.." + i); //we dont need that bracket also

       // obj.run(5);

        /*M obj = new M()
        {
            public int add(int i,int j)
            {
                return i+j;
            }
        };*/
        //M obj = (int i, int j) -> return i+j; the return is not needed in the using lambda expression.
        M obj =(i,j) -> i+j;
        int result = obj.add(7,2);
        System.out.println(result);

    }
}