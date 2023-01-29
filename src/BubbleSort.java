import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] notSortedArray = new int[10];
        Random r = new Random();

        for (int i = 0; i < notSortedArray.length; i++) {
            notSortedArray[i] = r.nextInt(100);
            System.out.print(notSortedArray[i] + " ");
        }
        System.out.println("");
        sort(notSortedArray);
        for (int i = 0; i < notSortedArray.length; i++) {
            System.out.print(notSortedArray[i] + " ");

        }
    }

    static void sort(int[] tab) {
        int temp = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab.length - i; j++) {
                if (tab[j - 1] > tab[j]) {
                    temp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }
}
