package leetcode.medium;

import java.util.ArrayList;

public class ReverseNumber {

    static int reverse(int x) {
        boolean isNegative = x < 0;
        int divisor = 10;
        int remainder;
        ArrayList<Integer> list = new ArrayList<>();
        if (x == 0) {
            return 0;
        }

        while (x % 10 == 0) {
            x = x / 10;
        }
        while (x != 0) {
            remainder = x % divisor;
            x = (x - remainder) / divisor;
            list.add(Math.abs(remainder));
        }
        long result = 0;
        int multiplier = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            result += (long) multiplier * list.get(i);
            multiplier *= 10;
        }
        if (isNegative) {
            result = -result;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) result;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(15342369));
    }
}
