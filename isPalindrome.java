import java.util.Stack;

public class Solution {

    /**
     * Disregarding case and non-alphanumeric characters, returns whether String is palindrome.
     * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
     */
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.length() < 1) return true;

        s = s.toLowerCase();

        Stack<Character> reversed = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                reversed.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                if (s.charAt(i) != reversed.pop())
                    return false;
            }
        }
        return true;
    }
}
