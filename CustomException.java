class PrasanthException extends Exception
{
    public PrasanthException(String str)
    {
        super(str);
    }
}
public class CustomException
{
    public static void main(String a[])
    {
        int i=20;
        int j=0;


        try {
            j=18/i;
            if(j==0)
                throw new Exception("I don't want zero to print");
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot Divide by Zero..");
        }
        catch(Exception e) {
            System.out.println("Something went wrong" + e);
        }
        System.out.println(j);

        System.out.println("In progress");

    }


}
