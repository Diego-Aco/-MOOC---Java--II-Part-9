import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        items = new ArrayList<>();
    }

    public void add(Item item) {
        if (item.getWeight() + this.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        }
        return false;
    }

    public int getWeight() {    //returns current weight
        int weight =0;
        for (Item item: items) {
            weight+=item.getWeight();
        }
        return weight;
    }

}
