package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private Ingrijitor ingrijitor;
    private List<Animal> animale;

    public Zoo(String name, Ingrijitor ingrijitor) {
        this.name = name;
        this.ingrijitor = ingrijitor;
        animale = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animale.add(animal);
    }

    public void hranesteAnimale(String mancare){
        for(Animal a: animale){
            ingrijitor.hranesteAnimal(a, mancare);
        }
    }
}
