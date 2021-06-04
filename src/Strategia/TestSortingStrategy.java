package Strategia;

public class TestSortingStrategy {

    public static void main(String[] args) {
        int[] unsortedNumbers = {3, 21, 14, 54, 6, 2, 32, 13, 8, 92, 27, 17, 9};

        System.out.print("Liczby nieposortowane: ");
        for(int i = 0; i < unsortedNumbers.length; i++){
            System.out.print(unsortedNumbers[i] + ", ");
        }
        System.out.println();


        StrategyContext context = new StrategyContext(new BubbleSortStrategy());
        context.execute(unsortedNumbers);

        context = new StrategyContext(new QuickSortStrategy());

        context.execute(unsortedNumbers);
    }
}
