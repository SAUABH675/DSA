# LeetCode Problem: Shuffle the Array
# Link: https://leetcode.com/problems/shuffle-the-array/
# Difficulty: Easy
# Language: python

class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        list=[]
        for i in range(n):
            list.append(nums[i])
            list.append(nums[i+n])
        return list    
        