package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        while (seconds <= 117){
            System.out.println("Watching Youtube videos: " + seconds + " second");
            seconds++;
            Thread.sleep(1000); //1sec
        }
        System.out.println("Finished watching Cat video, lets start another one ");

    }
}
