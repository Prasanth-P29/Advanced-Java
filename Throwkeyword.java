public class Throwkeyword
{
    public static void main(String a[])
    {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException("I don't want to print zero");
        }
        catch(ArithmeticException e){
            j = 18/1;
            System.out.println("That's the default output " + e);
        }
        catch(Exception e){
            System.out.println("Something Went Wrong.." + e);
        }
        System.out.println(j);
        System.out.println("In progress..");
    }
}