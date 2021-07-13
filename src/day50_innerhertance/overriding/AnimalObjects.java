package day50_innerhertance.overriding;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Gray";
        animal.type = "Pitbul";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}
