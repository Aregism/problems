package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {

    static int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int maxSize = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!chars.contains(s.charAt(i))) {
                chars.add(s.charAt(i));
            } else {
                i = s.substring(0, i).lastIndexOf(s.charAt(i));
                chars.clear();
            }
            if (maxSize < chars.size()) {
                maxSize = chars.size();
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abcabc";
        String s3 = "wwkekw";
        String s4 = "lulziballs";
        String s5 = "aab";
        String s6 = "dvdf";
        System.out.println(lengthOfLongestSubstring(s6));
    }
}
