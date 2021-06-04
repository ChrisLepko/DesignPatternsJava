package Most;

public class EnglishTest extends Test{

    public EnglishTest(Task task) {
        super(task);
    }

    @Override
    public void solveTask() {
        System.out.println("Test z angielskiego zostal rozwiązany");
        task.solveTask();
    }
}
