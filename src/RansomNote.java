import java.util.Arrays;
import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String note, String magazine) {
        if (magazine.length() < note.length()) return false;

        int[] charCount = new int[26];
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (int i = 0; i < note.length(); i++) {
            if (charCount[note.charAt(i) - 'a'] >= 1) {
                charCount[note.charAt(i) - 'a']--;
            }
            else return false;
        }
        return true;
    }
}
