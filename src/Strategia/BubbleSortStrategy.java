package Strategia;

public class BubbleSortStrategy implements Strategy {

    @Override
    public void sortNumbers(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = 0; j < numbers.length - 1; j++){
                if(numbers[j] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }



        System.out.print("Liczby posortowane metodą bąbelkową: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }
}
