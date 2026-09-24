# LeetCode Problem: Ugly Number
# Link: https://leetcode.com/problems/ugly-number/
# Difficulty: Easy
# Language: python

class Solution(object):
    def isUgly(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n<=0:
            return False
        for i in [2,3,5]:
            while n%i==0:
                n//=i
        return n==1
        