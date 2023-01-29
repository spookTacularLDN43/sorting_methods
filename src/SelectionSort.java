import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] notSortedArray = new int[10];
        Random r = new Random();

        for (int i = 0; i < notSortedArray.length; i++) {
            notSortedArray[i] = r.nextInt(100);
            System.out.print(notSortedArray[i] + " ");
        }
        System.out.println("");

        int[] sortedArray = new int[notSortedArray.length];
        for (int i = 0; i < sortedArray.length; i++) {
            int max = notSortedArray[0];
            int index = 0;
            for (int j = 1; j < notSortedArray.length; j++) {
                if (notSortedArray[j] > max) {
                    max = notSortedArray[j];
                    index = j;
                }
            }
            notSortedArray[index] = -1;
            sortedArray[i] = max;
        }
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}