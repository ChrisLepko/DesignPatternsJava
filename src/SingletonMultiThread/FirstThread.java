package SingletonMultiThread;

public class FirstThread implements Runnable {

    @Override
    public void run() {
        Singleton singletonFirstThread = Singleton.getInstance("Wątek pierwszy");
        System.out.println(singletonFirstThread.message);
    }
}
