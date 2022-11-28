package leetcode.medium;

import java.util.Arrays;

public class NthMax {

    static int findNthMaxPure(int[] array, int n) {
        int[] clone = Arrays.copyOf(array, array.length);
        Arrays.sort(clone);
        int nthMax = clone[clone.length - 1];
        int counter = 1;
        for (int i = clone.length - 1; i >= 0; i--) {
            if (nthMax > clone[i]) {
                nthMax = clone[i];
                counter++;
            }
            if (counter == n) {
                return nthMax;
            }
        }
        return clone[0];
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 5, 4, 7, 6, 9, 8};
        int[] array2 = {8, 7, 10};
        int[] array3 = {8, 7, 6};
        int[] array4 = {8, 7, 8};
        int[] array5 = {3, 2, 3, 1, 2, 4, 5, 5, 6};

        System.out.println(findNthMaxPure(array5, 4));
    }
}
