public class ValidPalindrome {

    public boolean isPalindrome(String input) {
        // Prepare the string by lowering and keeping alphanum only
        String tidyStr = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (tidyStr.length() <= 1) return true;

        int index = 0;
        while (index < tidyStr.length() / 2) {
            if (tidyStr.charAt(index) != tidyStr.charAt(tidyStr.length() - 1 - index)) return false;
            index++;
        }
        return true;
    }
}
