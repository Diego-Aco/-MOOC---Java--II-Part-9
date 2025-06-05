
public class Main {

    public static void main(String[] args) {
        

        System.out.println();
        System.out.println();
        // test your classes below



        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        //box adding other boxes
        Box otherBox = new Box(5);
        otherBox.add(new CD("Nujabes", "Metaphorical Music", 2003));
        otherBox.add(new Book("F.C. Yee", "Rise of Kyoshi", 1.0));
        box.add(otherBox);

        System.out.println(box);



    }

}
