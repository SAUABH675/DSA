# Perfect Number

**Difficulty:** Easy  
**Topics:** Math  
**LeetCode URL:** [Perfect Number](https://leetcode.com/problems/perfect-number/)

## Problem Description

<p>A <a href="https://en.wikipedia.org/wiki/Perfect_number" target="_blank"><strong>perfect number</strong></a> is a <strong>positive integer</strong> that is equal to the sum of its <strong>positive divisors</strong>, excluding the number itself. A <strong>divisor</strong> of an integer <code>x</code> is an integer that can divide <code>x</code> evenly.</p>

<p>Given an integer <code>n</code>, return <code>true</code><em> if </em><code>n</code><em> is a perfect number, otherwise return </em><code>false</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> num = 28
<strong>Output:</strong> true
<strong>Explanation:</strong> 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> num = 7
<strong>Output:</strong> false
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= num &lt;= 10<sup>8</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Perfect Number
// Link: https://leetcode.com/problems/perfect-number/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1; i<=num/2; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(num==sum){
            return true;
        }else{
            return false;
        }
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
