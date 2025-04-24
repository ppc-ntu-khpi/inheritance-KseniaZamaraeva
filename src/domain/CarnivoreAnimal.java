package domain;

public class CarnivoreAnimal extends Animal {

    public CarnivoreAnimal() {
        super();
    }

    public CarnivoreAnimal(String name, int weight) {
        super(name, weight);
    }

    public void hunt() {
        System.out.println(name + " полює.");
    }
}

