//To create a Thread we have two choice,
//   ~ one we can extend Thread Class or implement an Runnable interface.
//   ~ But in the Runnable interface it will not have the Thread methods for that we will create
//     a separate Thread object and then we can use the methods.
//class C extends Thread
/*
class C implements Runnable
{
    public void run()
    {
        for(int i = 0;i<=5;i++)
        {
            System.out.println("Hi!");
            try{
                Thread.sleep(5);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
//class D extends Thread
class D implements Runnable
{
    public void run()
    {
        for(int i = 0;i<=5;i++)
        {
            System.out.println("Hello!");
            try{
                Thread.sleep(5);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
*/
public class RunnableVsThread
{
    public static void main(String a[])
    {
        //C obj1 = new C();
        //D obj2 = new D();
        //Runnable obj1 = new C()
       // Runnable obj1 = new Runnable() ~ Runnable is actually a functional interface so we can lamba.
        Runnable obj1 = () ->
       // {
           // public void run()
            {
                for(int i = 0;i<=5;i++)
                {
                    System.out.println("Hi!");
                    try{
                        Thread.sleep(10);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
        //};
        //Runnable obj2 = new Runnable();
        Runnable obj2 = () ->
            {
                for(int i = 0;i<=5;i++)
                {
                    System.out.println("Hello!");
                    try{
                        Thread.sleep(10);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
        //obj1 and obj2 are Runnable objects and reference of Runnable interface.


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        //obj1.start();
        //obj2.start();
    }
}