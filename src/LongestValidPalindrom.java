public static class LongestValidPalindrome {

    public String longestPalindrome(String input) {
        int len = input.length();
        if (len <= 1) {
            return input;
        }


        if (input.charAt(0) != input.charAt(len - 1) && len == 2) {
            return longestPalindrome(input.substring(0, len - 1));
        } else if (input.charAt(0) != input.charAt(len - 1) && len > 2) {
            return longestPalindrome(input.substring(1, len - 1));
        } else {
            return (input.charAt(0) + longestPalindrome(input.substring(1, len - 1)) + input.charAt(len - 1));
        }

    }
}

public static void main(String[] args) {
    LongestValidPalindrome lol = new LongestValidPalindrome();
    System.out.println(lol.longestPalindrome(("ac")));
}
