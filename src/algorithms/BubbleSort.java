package algorithms;

/**
 * Bubble Sort - Compare the adjacent elements and 
 * swap them if they are not order. Repeat the comparison
 * for all the adjacent elements in the array.
 * @author Sanjeev
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numbers = new int[]{23,3,7,245,454,67,38,34,8,677,643,1289,8788};
        sort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }

    private static void sort(int[] numbers) {

        for (int j = 0; j < numbers.length-1; j++) {
            boolean swapped = false;
            for (int i = 0; i < numbers.length-2; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) break;
        }
    }
}