// LeetCode Problem: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isPalindrome(int x) {
        int result=0;
        boolean isNegative = x < 0;
        x = Math.abs(x);
        int temp=x;
        while(temp!=0){
            int div=temp%10;
            result=result*10+div;
            temp/=10;
        }
        if (isNegative) {
            result = -result;
        }
        if(result==x){
            return true;
        }
        return false;
    }
}