package Stan;

public class EngineContext {

    private State state;

    public EngineContext(){
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
