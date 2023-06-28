public class Palindrome {
    /*
    https://leetcode.com/problems/palindrome-number
     */
    public boolean isPalindrome(int x) {
        if (x < 0 ){
            return false;
        }

        char[] digits = String.valueOf(x).toCharArray();
        int j = digits.length-1;
        for (char digit : digits) {
            if (digit != digits[j]) {
                return false;
            }
            j--;
        }
        return true;
    }
}
