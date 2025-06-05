import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history=new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double max = history.get(0);
        for (Double d : history) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public double minValue() {
        double min = history.get(0);
        for (Double d : history) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        int count = 0;

        for (Double d : history) {
            count++;
            sum += d;
        }

        return 1.0 * sum / count;
    }

}
