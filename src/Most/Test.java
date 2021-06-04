package Most;

public abstract class Test {

    protected Task task;

    public Test(Task task) {
        this.task = task;
    }

    abstract public void solveTask();
}
