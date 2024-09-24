import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Children
{
    private String name;
    private int age;

    public Children(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Children [name=" + name + ", age=" + age + "]";
    }




}

public class ConstructorReference
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prasanth","Karthik","Naveen");

       /*  List<String> uNames = names.stream()
                                .map(name -> name.toUpperCase())
                                .toList();

        uNames.forEach(System.out::println);*/

        List<Children> childrens = new ArrayList<>();

       /* for(String name : names)
        {
            childrens.add(new Children(name));
        }
        System.out.println(childrens);*/
        childrens = names.stream()
                //.map(name -> new Children(name))
                .map(Children :: new)//simply mention the operator keyword with class name.
                .toList();

        System.out.println(childrens);
    }
}