package main;

import zoo.Girafa;
import zoo.Ingrijitor;
import zoo.Zebra;
import zoo.Zoo;

public class Main {
    //psvm
    public static void main(String[] args) {
        Ingrijitor i1 = new Ingrijitor("Vasile");
        Zoo z1 = new Zoo("Gradina zoo din Berlin",i1);

        Girafa g1 = new Girafa("Joannah");
        Zebra zeb1 = new Zebra("Cristina");
        z1.addAnimal(g1);
        z1.addAnimal(zeb1);

        z1.hranesteAnimale("paie");
    }
}
