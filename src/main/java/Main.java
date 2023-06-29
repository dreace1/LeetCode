import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Two Sum Problem
        TwoSum twoSumObj = new TwoSum();
        System.out.println(Arrays.toString(twoSumObj.twoSum(new int[]{2, 7, 11, 15}, 9)));

        //Pallindrome
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(-123));

        //LongestCommonPrefix
        LongestCommonPrefix longestCommonPrefixObj = new LongestCommonPrefix();
        System.out.println(longestCommonPrefixObj.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
