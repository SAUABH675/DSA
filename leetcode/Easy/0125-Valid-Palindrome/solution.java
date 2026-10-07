// LeetCode Problem: Valid Palindrome
// Link: https://leetcode.com/problems/valid-palindrome/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isPalindrome(String s) {
        String cleaned="";
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cleaned+=Character.toLowerCase(c);
            }
        }
        String rev="";
        for(int i=cleaned.length()-1; i>=0; i--){
            rev+=cleaned.charAt(i);
        }
        return rev.equals(cleaned);
    }
}