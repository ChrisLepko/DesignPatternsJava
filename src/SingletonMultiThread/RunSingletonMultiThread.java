package SingletonMultiThread;

public class RunSingletonMultiThread {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());

        firstThread.start();
        secondThread.start();

        System.out.println("Ta sama wartość zwracana przez oba wątki oznacza że zostałą utworzona tylko jedna instancja Singleton ");
    }
}
