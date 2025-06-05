import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> products;

    public ShoppingCart() {
        this.products = new HashMap<>();
    }

    public void add(String product, int price) {
        if (!this.products.containsKey(product)) {
            this.products.put(product, new Item(product, 1, price));
            return;
        } else {
            this.products.get(product).increaseQuantity();
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : products.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : products.values()) {
            System.out.println(item);
        }
    }

}
