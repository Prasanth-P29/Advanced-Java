import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.Collection;
import java.util.HashSet;

public class Sets
{
    public static void main(String a[])
    {
    /*
    Set<Integer> nums = new HashSet<Integer>();

     nums.add(7);
     nums.add(5);
     nums.add(2);
     nums.add(9);
     nums.add(7);
    */

    /*Set<Integer> nums = new HashSet<Integer>();
    nums.add(17);
    nums.add(92);
    nums.add(75);
    nums.add(50);

    for(int n : nums)
     {
        System.out.println(n);
     }
     */

        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(17);
        nums.add(92);
        nums.add(75);
        nums.add(50);
        for(int n : nums)
        {
            System.out.println(n);
        }


        // Iterator<Integer> values = nums.iterator<Integer>();






    }
}