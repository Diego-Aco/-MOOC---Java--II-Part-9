public class Cat extends Animal implements NoiseCapable {

    public Cat() {
        super("Cat");
    }

    public Cat(String name) {
        super(name);
    }

    public void purr() {
        System.out.println(this.name + " purrs");
    }

    public void makeNoise() {
        purr();
    }

}
