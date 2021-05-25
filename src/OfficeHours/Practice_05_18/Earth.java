package OfficeHours.Practice_05_18;

public class Earth {
    public static void main(String[] args) {
        AnimalSpecies dog = new AnimalSpecies();
        System.out.println(dog.getName());
        dog.setInfo("dogs",50,10);
        System.out.println(dog.getName());
        System.out.println(dog.toString());

        AnimalSpecies cat = new AnimalSpecies();
        cat.setInfo("cats",100,15);
        System.out.println(cat);


        AnimalSpecies birds = cat;
        cat.setInfo("birds",200,20);
        System.out.println(birds);

    }
}
