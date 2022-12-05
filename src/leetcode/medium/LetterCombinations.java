package leetcode.medium;

import java.util.*;

// Original problem name
// Letter Combinations of a Phone Number
public class LetterCombinations {

    static Map<Integer, List<Character>> map = Map.of(
            2, List.of('a', 'b', 'c'),
            3, List.of('d', 'e', 'f'),
            4, List.of('g', 'h', 'i'),
            5, List.of('j', 'k', 'l'),
            6, List.of('m', 'n', 'o'),
            7, List.of('p', 'q', 'r', 's'),
            8, List.of('t', 'u', 'v'),
            9, List.of('w', 'x', 'y', 'z')
    );


    static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        int number = Integer.parseInt(digits);
        int[] array = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            array[digits.length() - i - 1] = number % 10;
            number /= 10;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            System.out.println(map.get(array[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        letterCombinations("5678");

    }
}
