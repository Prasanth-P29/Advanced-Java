//Stream is an interface and it returns the object of Stream.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

        public static void main(String[] args) {

                //List<Integer> nums = new ArrayList<>();
                List<Integer> nums = Arrays.asList(4,7,2,5,6,1,3);

                //Stream<Integer> s1 = nums.stream();
                //s1.filter( n ->n%2==0);
                //Stream<Integer> s2 = s1.filter( n ->n%2==0);
                // s1.forEach(n -> System.out.println(n));
                //Stream<Integer> s3 = s2.map(n -> n*2);
               // s2.forEach(n -> System.out.println(n));
               // s3.forEach(n -> System.out.println(n));
               //int result = s3.reduce(0,(c,e) -> c+e);
               // System.out.println(result);

                int result = nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0, (c,e) -> c+e);

                System.out.println(result);

             /* Consumer<Integer> con = new Consumer<Integer>()
            {
               public void accept(Integer n)
              {
                System.out.println(n);
              }
            }; */
                // Consumer<Integer> con =  n ->System.out.println(n);//using lambda .
              //  nums.forEach(n ->System.out.println(n));//(using for-each method)


                //System.out.println(nums);
           /*for(int i=0;i<nums.size();i++)
          {
           System.out.println(nums.get(i));
          }

          for(int n : nums)
         {
           System.out.println(n);
          }*/

          //nums.forEach(n -> System.out.println(n));

        /*int sum=0;
        for(int n : nums)
        {
            if(n%2==0)
            {
                n = n * 2;
                sum = sum + n;
            }
        }
        System.out.println(sum);*/

        }
}