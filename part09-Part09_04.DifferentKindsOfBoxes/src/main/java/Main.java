
public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        // Test the classes below

        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));

    }
}
