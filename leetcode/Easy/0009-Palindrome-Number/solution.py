# LeetCode Problem: Palindrome Number
# Link: https://leetcode.com/problems/palindrome-number/
# Difficulty: Easy
# Language: python

class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x<0:
            return False
        temp=x
        rev=0
        while(temp>0):
            digit=temp%10
            rev=rev*10+digit
            temp//=10
        return rev==x
        