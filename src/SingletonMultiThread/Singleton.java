package SingletonMultiThread;

public class Singleton {

    private static volatile Singleton singletonInstance;

    public String message;

    private Singleton(String message){
        this.message = message;
    }

    public static Singleton getInstance(String message){

        if(singletonInstance != null){
            return singletonInstance;
        }

        synchronized (Singleton.class){
            if(singletonInstance == null){
                singletonInstance = new Singleton(message);
            }

            return singletonInstance;
        }
    }

}
