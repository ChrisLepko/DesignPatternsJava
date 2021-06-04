package Stan;

public class StartEngine implements State {

    @Override
    public void doAction(EngineContext engineContext) {
        System.out.println("Uruchamianie silnika...");
        engineContext.setState(this);
    }

    public String toString(){
        return "Silnik jest uruchomiony.";
    }
}
