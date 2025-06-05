public class CustomTacoBox implements TacoBox {
    private int tacos;
    
    public CustomTacoBox(int tacos) {
        this.tacos=tacos;
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        if (this.tacos>0) {
            this.tacos--;
        }
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    
}
