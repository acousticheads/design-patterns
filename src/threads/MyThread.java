package threads;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("new thread using extends Thread class!");
    }
}
