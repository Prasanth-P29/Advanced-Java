import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelStream
{
    public static void main(String[] args)
    {
        int size = 10_000;

        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();//this class gives random values .
        //ran.nextInt(100); for bound the value.

        for(int i=1;i<=size;i++){
            nums.add(ran.nextInt(100));
        }
        //System.out.println(nums);

       /*  int sum1 = nums.stream()
                    //.filter(n->n%2==0)
                    .map(i->i*2)
                    .reduce(0,(c,e)->c+e);*/
        Long startseq = System.currentTimeMillis();
        int sum2 = nums.stream()
                //.map(i->i*2)
                .map(i->{

                    try{
                        Thread.sleep(1);
                    }
                    catch(Exception e) {
                    }

                    return i*2;
                })
                .mapToInt(i->i)
                .sum();
        Long endseq = System.currentTimeMillis();

        Long startpara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                //.map(i->i*2)
                .map(i->{

                    try{
                        Thread.sleep(1);
                    }
                    catch(Exception e) {
                    }

                    return i*2;
                })
                .mapToInt(i->i)
                .sum();
        Long endpara = System.currentTimeMillis();

        System.out.println(sum2 + " " + sum3);
        System.out.println("Seq : "+ (endseq-startseq));
        System.out.println("Para : "+ (endpara-startpara));
    }
}
