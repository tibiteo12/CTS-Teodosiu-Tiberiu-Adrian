package zoo;

public abstract class Animal {
    private String name;
    public abstract void mananca(String mancare);

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
