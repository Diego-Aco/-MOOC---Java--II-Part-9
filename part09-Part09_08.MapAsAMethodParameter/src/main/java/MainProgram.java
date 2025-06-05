import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        // test your method here

        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));
    }

    // Implement here a method returnSize, which takes a Map-object as a parameter
    // and returns the size of the map object
    public static int returnSize(Map m) {
        if (m == null) {
            return 0;
        }
        return m.size();
    }

}
