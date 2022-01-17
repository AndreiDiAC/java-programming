package $OOP.Dog;

public class Dog extends Animal {
    String breed;
    int humanYears;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        getAgeInHumanYears();
    }

    @Override
    public void getAgeInHumanYears() {
        if(getAge() <= 2){
            humanYears = getAge() * 11;
        }else{
            humanYears = 22 + ((getAge() - 2) * 5);
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nBreed: " + breed +
                "\nAge in calendar years: " + getAge() +
                "\nAge in human years: " + humanYears;
    }



    public boolean equals(Dog dog){
        if(dog.getAge() == getAge() && dog.getName().equals(getName()) && dog.breed.equals(breed)){
            return true;
        }else{
            return false;
        }

    }
}
