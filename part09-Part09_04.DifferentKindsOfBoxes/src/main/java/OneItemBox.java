public class OneItemBox extends Box {

    private final int capacity = 0;
    private Item item;

    public OneItemBox() {
        this.item=null;
    }

    @Override
    public void add(Item item) {
        if (this.item != null) {
            return;
        }
        this.item=item;
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.item==null) {
            return false;
        }
        return this.item.equals(item);
    }

    public Item getItem() {
        return this.item;
    }

}
