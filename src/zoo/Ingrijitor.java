package zoo;

public class Ingrijitor{
    private String name;

    public Ingrijitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void hranesteAnimal(Animal animal, String mancare){
        animal.mananca(mancare);
    }
}
