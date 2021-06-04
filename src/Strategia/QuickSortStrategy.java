package Strategia;

public class QuickSortStrategy implements Strategy {

    @Override
    public void sortNumbers(int[] numbers) {

        quickSort(numbers, 0, numbers.length-1);

        System.out.print("Liczby posortowane algorytmem Quick Sort: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }

    private void quickSort(int[] numbers, int low, int high){
        if (low < high)
        {
            int pi = partition(numbers, low, high);

            quickSort(numbers, low, pi - 1);
            quickSort(numbers, pi + 1, high);
        }
    }

    private int partition(int[] numbers, int low, int high){

        int pivot = numbers[high];

        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {

            if (numbers[j] < pivot)
            {
                i++;
                swap(numbers, i, j);
            }
        }
        swap(numbers, i + 1, high);
        return (i + 1);
    }
    private void swap(int[] numbers, int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
