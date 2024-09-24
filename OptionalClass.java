import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prasanth","Lakshmi","Naveen","Karthik");

        String name = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst()
                .orElse("Not Found");

        System.out.println(name);

        //System.out.println(name.get());

        // ( or )

      /*   Optional<String> name = names.stream()
                .filter(str -> str.contains("x") )
                .findFirst();
        System.out.println(name.orElse("Not Found"));
        */
    }
}
/*
import java.util.Arrays;
import java.util.List;

public class MethodReference
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prasanth","Naveen","Karthik");

        List<String> unames = names.stream()

    }
}
 */