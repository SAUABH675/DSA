# LeetCode Problem: Two Sum
# Link: https://leetcode.com/problems/two-sum/
# Difficulty: Easy
# Language: python

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        seen={}
        for i, j in enumerate(nums):
            temp=target-j
            if temp in seen:
                return [seen[temp],i]
            seen[j]=i