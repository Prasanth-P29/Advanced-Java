/*
Types of error:-
        1. Complile - time error
        2. Runtime error -> Exception handling
        3. Logical error


public class Exception {
    public static void main(String[] args) {

//  	System.out.Println();
        System.out.println(2+2);

    }
}
 */
//Exceptions have two types of statements,
//1.Normal Statement --> no need for try block --> try{
//                                                      critical statement;
//                                                     }
//2.Critical Statement -->for this we use try block and in this critical statement has any exception it'll throw an error as an Object.
//                        we have to catch this object by catch block -->catch(Exception e) -here,
//                                                                                              Exception is a class and e is an object.
//
public class Exceptions
{
    public static void main(String a[])
    {
        //int i = 0;  -->Normal statement
        //int j = 8/i; -->Critical statement

        int i=2;
        int j=0;
        int nums[] = new int[5];
        String str = null;

        try {
            j=18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot Divide by Zero..");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Don't Cross your Array Limit");
        }
        catch(Exception e) {
            System.out.println("Something went wrong" + e);
        }
        System.out.println(j);

        System.out.println("In progress");

    }


}
