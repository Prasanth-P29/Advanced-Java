import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>
{
    int age;
    String name;


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }


    @Override
    public int compareTo(Student that) {

        if(this.age > that.age)
            return 1;
        else
            return -1;

    }

}

public class ComparatorVsComparable
{
    public static void main(String a[])
    {
        /*List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(3);
        nums.add(1);
        nums.add(9);
        Collections.sort(nums);
        System.out.println(nums);*/

        /*Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                   return 1;
                else
                   return -1;
            }
        };*/

       /* Comparator<Student> com = new Comparator<Student>()
        {
            public int compare(Student i, Student j)
            {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };*/
        Comparator<Student> com = (i, j) ->i.age > j.age?1:-1;//tertary operator and using lambda .

              /*  if(i.age > j.age)
                    return 1;
                else
                    return -1;
              return i.age > j.age?1:-1;

        };*/

        List<Student> nums = new ArrayList<>();
        nums.add(new Student(25, "Prasanth") );
        nums.add(new Student(21, "Naveen"));
        nums.add(new Student(27, "Karthik"));
        nums.add(new Student(20, "Anas"));
        Collections.sort(nums);
        //Collections.sort(nums,com);
        for(Student s : nums)
        {
            System.out.println(s);
        }

       // System.out.println(nums);

       /* List<Integer> nums = new ArrayList<>();
        nums.add(42);
        nums.add(31);
        nums.add(16);
        nums.add(89);
        Collections.sort(nums,com);

        System.out.println(nums);*/

        /*
        Comparator<String> com = new Comparator<String>()
        {
            public int compare(String i, String j)
            {
                   return Integer.compare(i.length(),j.length());
            }
        };

        List<String> StringList = new ArrayList<>();
        StringList.add("Prasanth");
        StringList.add("Anas");
        StringList.add("Asraf");
        StringList.add("Karthik");
        Collections.sort(StringList,com);

        for(String S : StringList)
        {
            System.out.println(S);
        } */

    }
}
