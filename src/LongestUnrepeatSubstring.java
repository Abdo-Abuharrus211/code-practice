import java.util.HashSet;

public class LongestUnrepeatSubstring {

        public int lengthOfLongestSubstring(String s) {
            // Hashmap for all unique chars
            HashSet<Object> setsy = new HashSet<>();

            String subs = "";
            for(int i = 0; i < s.length(); i++){
                char current = s.charAt(i);
                if(!setsy.contains(current)){
                    setsy.add(current);
                    subs = subs.concat(String.valueOf(current));
                }else{
                    setsy.clear();
                    subs = "";
                }
            }


            return subs.length();
        }

}
