enum Status{
    Running,Success,Failed,Pending;
}
public class Enums
{
    public static void main(String a[])
    {
        //Status s0 = Status.Running;
        //Status s1 = Status.Success;
        //Status s2 = Status.Failed;
        //Status s3 = Status.Pending;
        //System.out.println(s);
        //System.out.println(s.ordinal());// Used to get the numbering of those named constants(Objects).

        Status[] ss = Status.values();// to get all values with number using enhanced for loop.
        for(Status s : ss)
        {
            System.out.println(s+" : "+s.ordinal());
        }

              //Using Enums with If-Else

        Status s1 = Status.Pending;

        if(s1 == Status.Running)
            System.out.println("All Good..");
        else if(s1 == Status.Pending)
            System.out.println("Please Wait..!");
        else if(s1 == Status.Failed)
            System.out.println("Try Again..");
        else
            System.out.println("Done..");

              //Using Enums with Switch

        Status s2 = Status.Failed;

        switch(s2)
        {
            case Running :
                System.out.println("All Good..");
                break;
            case Failed:
                System.out.println("Try Again..!");
                break;
            case Pending:
                System.out.println("Please Wait..!");
                break;
            default:
                System.out.println("Done..");
                break;
        }

    }
}