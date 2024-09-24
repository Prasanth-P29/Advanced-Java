import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapFilterReduce {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,7,2,5,6,1,3);

       /*  Predicate<Integer> p = new Predicate<Integer>()
        {

            public boolean test(Integer n) {
                if(n%2==0)
                    return true;
                else
                    return false;
            }

        };*/

        // Predicate<Integer> p = n -> n%2==0;

        /* Function<Integer,Integer> fun = new Function<Integer,Integer>() {

            public Integer apply(Integer n)
            {
                return n*2;
            }

        };*/

        // Function<Integer,Integer> fun =  n -> n*2;


       /* int result = nums.stream()

                        .filter(n->n%2==0)
                        //.filter(p)
                        .map(n->n*2)
                        //.map(fun)
                        .reduce(0, (c,e) -> c+e);// 0 is initual value and c is carry and e is element.

        System.out.println(result);*/

        Stream<Integer> sortedvalues = nums.stream()
                .filter(n->n%2==0)
                .sorted();
        sortedvalues.forEach(n -> System.out.println(n));
    }
}