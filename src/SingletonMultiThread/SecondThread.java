package SingletonMultiThread;

public class SecondThread implements Runnable {

    @Override
    public void run() {
        Singleton singletonSecondThread = Singleton.getInstance("Wątek drugi");
        System.out.println(singletonSecondThread.message);
    }
}
