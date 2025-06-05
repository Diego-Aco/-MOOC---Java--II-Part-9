import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        // You can test your method here

        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));

        Set<Object> mySet = new HashSet<>();
        

    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.

    public static int returnSize(Set<String> s) {
        return s.size();
    }

}
