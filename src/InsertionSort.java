import java.util.Random;

public class InsertionSort {
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
            sortedArray[i] = -1;
        }

        sortedArray[0] = notSortedArray[0];

        for (int i = 1; i < notSortedArray.length; i++) {
            boolean flag = false;
            for (int j = 0; j < sortedArray.length; j++) {
                if (notSortedArray[i] < sortedArray[j]) {
                    for (int n = sortedArray.length - 1; n > j; n--) {
                        sortedArray[n] = sortedArray[n - 1];
                    }
                    sortedArray[j] = notSortedArray[i];
                    flag = true;
                    break;
                }
            }
            if(!flag){
                sortedArray[i] = notSortedArray[i];
            }
        }
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}
