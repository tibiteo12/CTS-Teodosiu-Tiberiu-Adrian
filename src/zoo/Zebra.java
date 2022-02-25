package zoo;

public class Zebra extends Animal{

    public Zebra(String name) {
        super(name);
    }

    public void mananca(String mancare) {
        System.out.println("Zebra " + super.getName() + " a mancat" + mancare);
    }
}
