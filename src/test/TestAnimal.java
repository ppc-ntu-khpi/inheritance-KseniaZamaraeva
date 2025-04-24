package test;
import domain.Leopard;
public class TestAnimal {
    public static void main(String[] args) {
        Leopard leo = new Leopard("Леопард", 70, 60.0, 120);
        System.out.println(leo);
        leo.eat();
        leo.speak();
        leo.hunt();
        leo.climb();
        leo.runFast();
    }
}

