package day56_abstraction.Greeting;

public class Japanese implements Greeting{
    @Override
    public void hi() {
        System.out.println("Japanese Hy");
    }

    @Override
    public void bye() {
        System.out.println("Japanese Bye");
    }
}
