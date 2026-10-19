// LeetCode Problem: Length of Last Word
// Link: https://leetcode.com/problems/length-of-last-word/
// Difficulty: Easy
// Language: java

class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.trim().split(" ");
        return arr[arr.length-1].length();
    }
}