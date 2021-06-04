package Stan;

public class TestEngineState {

    public static void main(String[] args) {
        EngineContext engineContext = new EngineContext();

        StartEngine startEngine = new StartEngine();
        startEngine.doAction(engineContext);
        System.out.println(engineContext.getState().toString());

        System.out.println();

        StopEngine stopEngine = new StopEngine();
        stopEngine.doAction(engineContext);
        System.out.println(engineContext.getState().toString());
    }
}
