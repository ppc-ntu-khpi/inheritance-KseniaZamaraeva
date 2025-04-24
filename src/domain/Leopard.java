package domain;

public class Leopard extends CarnivoreAnimal {
    private double speed;
    private int spotsCount;

    public Leopard() {
        super("Леопард", 60);
        this.speed = 58.0;
        this.spotsCount = 100;
    }

    public Leopard(String name, int weight, double speed, int spotsCount) {
        super(name, weight);
        this.speed = speed;
        this.spotsCount = spotsCount;
    }

    public void climb() {
        System.out.println(name + " лазить по деревах.");
    }

    public void runFast() {
        System.out.println(name + " біжить зі швидкістю " + speed + " км/год.");
    }

    public void roar() {
        System.out.println(name + " гарчить.");
    }

    @Override
    public void speak() {
        roar();
    }

    @Override
    public String toString() {
        return super.toString() + ", швидкість: " + speed + " км/год, кількість плям: " + spotsCount;
    }
}
