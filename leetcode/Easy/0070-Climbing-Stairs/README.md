# Climbing Stairs

**Difficulty:** Easy  
**Topics:** Math, Dynamic Programming, Memoization  
**LeetCode URL:** [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)

## Problem Description

<p>You are climbing a staircase. It takes <code>n</code> steps to reach the top.</p>

<p>Each time you can either climb <code>1</code> or <code>2</code> steps. In how many distinct ways can you climb to the top?</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 2
<strong>Output:</strong> 2
<strong>Explanation:</strong> There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 45</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Climbing Stairs
// Link: https://leetcode.com/problems/climbing-stairs/
// Difficulty: Easy
// Language: java

class Solution {
    public int climbStairs(int n) {
        if(n<2){
            return n;
        }
        int a=1; 
        int b=2;
        for(int i=3; i<=n; i++){
            int c=b+a;
            a=b;
            b=c;
        }
        return b;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
