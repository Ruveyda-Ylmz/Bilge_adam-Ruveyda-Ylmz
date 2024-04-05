package week04.threads.implementsrunnable;

public class Main {
    public static void main(String[] args) {
        MyRunnable myrunnable = new MyRunnable();
        myrunnable.run();

        Thread thread = new Thread(myrunnable);
        thread.start();
    }
}
