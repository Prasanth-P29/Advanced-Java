import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TryResources
{
    public static void main(String a[]) throws IOException
    {
       /*
        int i = 0;
        int j = 0;
        try
        {
            j = 18/i;
           // System.out.println("Bye");
        }
        catch(Exception e)
        {
            System.out.println("Something Went Wrong..");
            //System.out.println("Bye");
        }
        finally
        {
            System.out.println("Bye");
        */
        int num = 0;
       // BufferedReader br = null;
        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        // It can close resources automatically // we don't have to use finally to close resource.
        {
            //InputStream in = new InputStreamReader(System.in);
            //BufferedReader br = new BufferedReader(in);
            //br = new BufferedReader(in);
            //br = new BufferedReader(new InputStreamReader(System.in));
            //num = br.readLine(); we have to parse it.
            System.out.println("Enter the Number");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
            //br.close();
        }
        /*
        finally //Normally used to close the resource for file,input,connections like network,database and Everything.
        {
            //System.out.println("Bye");
            br.close();
        }
        */
    }
}