import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        // test your method here

        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));

    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    // as a parameter

    public static int returnSize(List l) {
        if (l == null) {
            return 0;
        }
        return l.size();
    }

}
