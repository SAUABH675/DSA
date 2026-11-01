// LeetCode Problem: Contains Duplicate
// Link: https://leetcode.com/problems/contains-duplicate/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}