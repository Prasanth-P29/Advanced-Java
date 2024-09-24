//basically it just passing a function to a function or pass a method name inside the method by specifying
//this method is responsible.(mention class name or object name)
import java.util.Arrays;
import java.util.List;

public class MethodReference
{
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Prasanth","Karthik","Naveen");

        List<String> uNames = names.stream()
                //.map(name -> name.toUpperCase())
                .map(String::toUpperCase)
                .toList();

        //System.out.println(uNames);

        //uNames.forEach(i-> System.out.println(i));
        uNames.forEach(System.out::println);//->println is a method to print values.
        //                 |
        //                println belongs to System.out
    }
}
