import java.util.HashMap;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        if (s.length() <= 1) return s.length();

        int maxLength = 0;
        int[] freqs = new int[52];

        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                freqs[c - 'a']++;
                if (freqs[c - 'a'] % 2 == 0) maxLength += 2;
            }
            if (Character.isUpperCase(c)) {
                freqs[c - 'A' + 26]++;
                if (freqs[c - 'A' + 26] % 2 == 0) maxLength += 2;
            }
        }

        for (int i : freqs) {
            if (i % 2 != 0) {
                maxLength++;
                break;
            }
        }

        return maxLength;
    }
}
