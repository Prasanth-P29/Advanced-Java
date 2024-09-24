class X
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("In X show");
    }
}
class Y extends X
{
    //public void showTheDataWhichBelongToThisClass()
    @Override
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("In Y show");
    }

}
public class Annotations
{
    public static void main(String a[])
    {
        Y obj = new Y();
        obj.showTheDataWhichBelongsToThisClass();
    }
}