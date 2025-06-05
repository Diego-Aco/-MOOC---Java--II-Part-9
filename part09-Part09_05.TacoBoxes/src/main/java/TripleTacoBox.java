public class TripleTacoBox implements TacoBox {

    private int tacos;

    public TripleTacoBox() {
        tacos = 3;
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        if (tacos>0) {
            tacos--;
        }
    }

    @Override
    public int tacosRemaining() {
        // TODO Auto-generated method stub
        return tacos;
    }

}
