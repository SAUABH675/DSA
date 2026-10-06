// LeetCode Problem: Single Number
// Link: https://leetcode.com/problems/single-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int singleNumber(int[] nums) {
        int result=0; 
        for(int num:nums){
            result^=num;
        }
        return result;
    }
}