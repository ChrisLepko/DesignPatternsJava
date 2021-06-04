package Stan;

public class StopEngine implements State {

    @Override
    public void doAction(EngineContext engineContext) {
        System.out.println("Wyłączanie silnika...");
        engineContext.setState(this);
    }

    public String toString(){
        return "Silnik jest wyłączony.";
    }
}
