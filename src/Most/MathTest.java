package Most;

public class MathTest extends Test {

    public MathTest(Task task) {
        super(task);
    }

    @Override
    public void solveTask() {
        System.out.println("Test z matematyki został rozwiązany");
        task.solveTask();
    }
}
