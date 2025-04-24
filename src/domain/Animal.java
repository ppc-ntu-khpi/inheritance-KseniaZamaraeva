package domain;

public class Animal {
    protected String name;
    protected int weight;

    public Animal() {
        this.name = "Unknown";
        this.weight = 0;
    }

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eat() {
        System.out.println(name + " їсть.");
    }

    public void speak() {
        System.out.println(name + " видає звук.");
    }

    @Override
    public String toString() {
        return "Тварина: " + name + ", вага: " + weight + " кг";
    }
}

