package zoo;

public class Girafa extends Animal{

    public Girafa(String name) {
        super(name);
    }

    public void mananca(String mancare) {
        System.out.println("Girafa " + super.getName() + " a mancat" + mancare);
    }
}
