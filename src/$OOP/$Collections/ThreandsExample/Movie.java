package $OOP.$Collections.ThreandsExample;

public abstract class Movie {
    public abstract void makeMovie();
}

abstract class Comedy extends Movie{
    public abstract void makeJoke();

}

class StandUp extends Comedy{
    public void makeJoke(){
        System.out.println("Joke");
    }

    @Override
    public void makeMovie() {

    }
}
