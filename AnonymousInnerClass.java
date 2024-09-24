class X
{
    public void show()
    {
        System.out.println("In X show..");
    }
}
/*class Y extends X
{
    public void show()
    {
        System.out.println("In Y show..");
    }
}
*/
public class AnonymousInnerClass
{
    public static void main(String a[])
    {
        //X obj = new Y();
        X obj = new X()
        {
            public void show()
            {
                System.out.println("In Y show..");
            }
        };
        obj.show();
    }
}

/*                  Abstract and Anonymous Inner Class

abstract class A
{
	public abstract void show();
	public abstract void config();

}

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}


public class  Demo{
    public static void main(String[] args) {

//    	A obj=new B();

    	A obj=new A()
    	{
    		public void show()
    		{
    			System.out.println("In new show");
    		}
    		public void config()
    		{
    		    System.out.println("In Config");
    		}
    	};
    	obj.show();
    	obj.config();

    }
}
 */