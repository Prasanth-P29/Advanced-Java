import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Maps
{
    public static void main(String a[])
    {
        //Map<String,Integer> students = new HashMap<>();
        Map<String,Integer> students = new Hashtable<>();//It is synchronised.
        students.put("Prasanth", 80);
        students.put("Naveen", 90);
        students.put("Karthik", 75);
        students.put("Anas", 95);
        students.put("Karthik", 85);

        //System.out.println(students);
        //System.out.println(students.get("Karthik"));

        System.out.println(students.keySet());
        for(String name : students.keySet())
        {
            System.out.println(name + " : " + students.get(name));
        }

    }
}