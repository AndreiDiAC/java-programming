package $OOP.Quiz4;

public class Sport {
    String name;
    int numOfPlayers;
    boolean teamBased;
    static int asd;

    public void makesSport(String nameOfSport, int players, boolean teams) {
        name = nameOfSport;
        numOfPlayers = players;
        teamBased = teams;
    }

    public static class asd{
    }

    public String toString() {
        return "This sport is " + name + " and has " + numOfPlayers + " players in " + teamBased;
    }



    public static void main(String[] args) {
        Sport soccer = new Sport();
        soccer.makesSport("Soccer",22,true);
        System.out.println(soccer);


    }
}
