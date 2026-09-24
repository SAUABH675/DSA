# LeetCode Problem: Count the Digits That Divide a Number
# Link: https://leetcode.com/problems/count-the-digits-that-divide-a-number/
# Difficulty: Easy
# Language: python

class Solution(object):
    def countDigits(self, num):
    
        temp=num
        count=0
        while(temp!=0):
            digit=temp%10
            if (num%digit==0):
                count+=1
            temp//=10
        return count

        

        