package HomeWorkSaim;

public class AnimalSpecies {
    String name;
    int population;
    int growthRate;

    public void setInfo(String str, int pop, int growth){
        name = str; population = pop; growthRate = growth;
    }

    public String getName() { return name; }

    public int getPopulation(){
        population *= 1_000_000_000;
        return population;
    }

    public int getGrowthRate(){ return growthRate; }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthRate=" + growthRate +
                '}';
    }
}

class Earth{
    public static void main(String[] args) {
        AnimalSpecies animal = new AnimalSpecies();
        animal.setInfo("cow", 2, 4);

        System.out.println("animal.getName() = " + animal.getName());
        System.out.println("animal = " + animal.getPopulation());
        System.out.println("animal = " + animal.getGrowthRate());
    }
}
