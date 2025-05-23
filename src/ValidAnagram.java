import java.util.HashMap;
import java.util.Objects;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> chars1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> chars2 = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (chars1.containsKey(s.charAt(i))) {
                int count = chars1.get(s.charAt(i)) + 1;
                chars1.put(s.charAt(i), count);
            } else {
                chars1.put(s.charAt(i), 1);
            }
            if (chars2.containsKey(t.charAt(i))) {
                int count = chars2.get(t.charAt(i)) + 1;
                chars2.put(t.charAt(i), count);
            } else {
                chars2.put(t.charAt(i), 1);
            }
        }

        for (int j = 0; j < s.length(); j++){
            Character chr = s.charAt(j);
            if(!Objects.equals(chars1.get(chr), chars2.get(chr))){
                return false;
            }
        }


        return true;
    }
}
