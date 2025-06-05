import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> movables;

    public Herd() {
        movables=new ArrayList<>();
    }

    public String toString() {
        String str="";

        for (Movable m : movables) {
            str+= m + "\n";
        }
        return str;
    }

    public void addToHerd(Movable movable) {
        this.movables.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable m : movables) {
            m.move(dx, dy);
        }
    }

}
