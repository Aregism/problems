package other;

public class SecondMax {

    static int getSecondMax(int[] array) {
        int max = array[0];
        int max2 = max;
        for (int i : array) {
            if (max < i) {
                max = i;
            }
            if (max2 > i) {
                max2 = i;
            }
        }
        for (int i : array) {
            if (i != max && max2 < i) {
                max2 = i;
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 5, 4, 7, 6, 9, 8};
        int[] array2 = {8, 7, 10};
        int[] array3 = {8, 7, 6};
        int[] array4 = {8, 7, 8};

        System.out.println(getSecondMax(array4));
    }
}
