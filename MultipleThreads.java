/*
Threads:-
        Multiple threads can run at same time in a code.This is known as Multithreading.
        ~ A thread is a smallest unit to work with.(Individual task)
        ~ They can run parallely.
        ~ Multiple threads can share resources.
 */
class P extends Thread
{
    //public void show()
    public void run()//In the thread we use run method only.
    {
        //for(int i =0;i<=10;i++)
        for(int i = 0;i<=100;i++)
        {
            System.out.println("Hi!");
        }
    }
}
class Q extends Thread
{
    //public void show()
    public void run()
    {
        //for(int i = 0;i<=10;i++)
        for(int i = 0;i<=100;i++)
        {
            System.out.println("Hello!");
        }
    }
}
public class MultipleThreads
{
    public static void main(String a[])
    {
        P obj1 = new P();
        Q obj2 = new Q();
       // obj1.show();
       // obj2.show();
        obj1.start();
        obj2.start();
    }
}