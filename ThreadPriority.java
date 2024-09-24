class M extends Thread
{
    public void run()
    {
        for(int i = 0;i<=100;i++)
        {
            System.out.println("Hi!");
            try{
                Thread.sleep(10);// this method will wait the thread for milliseconds.
                                 // It will throw an InterruptedException.
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class N extends Thread
{
    public void run()
    {
        for(int i = 0;i<=100;i++)
        {
            System.out.println("Hello!");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class ThreadPriority
{
    public static void main(String a[])
    {
        M obj1 = new M();
        N obj2 = new N();

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        //obj1.setPriority(1);//basically the scheduler give priority to thread.
                            //the priority ranges are between 1 to 10.
                            //1 is lowest ,5 is normal, 10 is highest.

        //obj2.setPriority(Thread.MAX_PRIORITY);
        //obj2.setPriority(Thread.MIN_PRIORITY);
        //obj2.setPriority(Thread.NORM_PRIORITY);//These are methods in Thread Class for Thread Priority.

        obj1.start();// we can use this only in the thread class or Thread.
        try{
            Thread.sleep(2);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        obj2.start();

    }
}