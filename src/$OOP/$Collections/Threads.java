package $OOP.$Collections;

public class Threads {


    public static class MyThread extends Thread {

        public void run() {
            System.out.println("MyTread running");
            System.out.println("MyThread finished");
        }

    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }

}

