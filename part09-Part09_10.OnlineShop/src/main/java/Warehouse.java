import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> quantities;
    private Map<String, Integer> prices;

    public Warehouse() {
        this.quantities = new HashMap<>();
        this.prices = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        quantities.put(product, stock);
        prices.put(product, price);
    }

    public int price(String product) {
        if (prices.get(product) == null) {
            return -99;
        }
        return prices.get(product);
    }

    public int stock(String product) {
        if (quantities.get(product) == null) {
            return 0;
        }
        return quantities.get(product);
    }

    public boolean take(String product) {
        if (this.quantities.get(product) == null || this.quantities.get(product) ==0) {
            return false;
        }
        int newStock = this.stock(product) - 1;
        this.quantities.put(product, newStock);
        return true;
    }

    public Set<String> products() {
        return quantities.keySet();
    }

}
