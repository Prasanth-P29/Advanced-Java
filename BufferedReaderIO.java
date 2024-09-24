import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderIO
{
    public static void main(String a[]) //throws IOException
    {

       /* System.out.println("Enter a Number");
        int num = System.in.read();--> this method give the ASCII value of the character.
        System.out.println(num);
        System.out.println(num-48); */

       /* System.out.println("Enter a Number");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        //int num = bf.readLine();
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();*/

        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

    }
}