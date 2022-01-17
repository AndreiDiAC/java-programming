package day50_inheritance.Animal;

public class Dog extends Animal{
    public Dog(String next, int nextInt, String next1) {
        super();
    }

    public void run() {
        System.out.println("Dog is running...");
    }

    @Override
    public void speak(){
        System.out.println("Dog is barking ruff woof");
    }
}
