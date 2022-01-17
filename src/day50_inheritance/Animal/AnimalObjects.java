package day50_inheritance.Animal;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Gray";
        animal.type = "Pitbul";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();

//        Dog dog = new Dog();
//        dog.speak();
    }
}
