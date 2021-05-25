package day44_;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat("banana");
        animal.speak();
        Animal cheetahObj = new Animal();

        animal.type = "cheetah"; //reassign
        System.out.println(animal.type);
        animal.eat("meat");
    }
}
