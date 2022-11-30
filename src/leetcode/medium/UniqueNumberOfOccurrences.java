package leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    static boolean uniqueOccurrences(int[] arr) {
        if (arr.length < 2) {
            return true;
        }
        Map<Integer, Integer> integerOcc = new HashMap<>();
        for (int i : arr) {
            if (integerOcc.containsKey(i)) {
                integerOcc.put(i, integerOcc.get(i) + 1);
            } else {
                integerOcc.put(i, 1);
            }
        }
        Set<Integer> set = new HashSet<>(integerOcc.values());
        return set.size() == integerOcc.size();
    }

    public static void main(String[] args) {

    }
}
