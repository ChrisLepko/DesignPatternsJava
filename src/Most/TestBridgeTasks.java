package Most;

public class TestBridgeTasks {
    public static void main(String[] args) {
        Test mathTest = new MathTest(new HardTask());
        mathTest.solveTask();

        Test englishTest = new EnglishTest(new EasyTask());
        englishTest.solveTask();

    }
}
