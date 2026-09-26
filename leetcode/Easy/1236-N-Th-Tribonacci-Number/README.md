# N-th Tribonacci Number

**Difficulty:** Easy  
**Topics:** Math, Dynamic Programming, Memoization  
**LeetCode URL:** [N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/)

## Problem Description

<p>The Tribonacci sequence T<sub>n</sub> is defined as follows:&nbsp;</p>

<p>T<sub>0</sub> = 0, T<sub>1</sub> = 1, T<sub>2</sub> = 1, and T<sub>n+3</sub> = T<sub>n</sub> + T<sub>n+1</sub> + T<sub>n+2</sub> for n &gt;= 0.</p>

<p>Given <code>n</code>, return the value of T<sub>n</sub>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 4
<strong>Output:</strong> 4
<strong>Explanation:</strong>
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 25
<strong>Output:</strong> 1389537
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= n &lt;= 37</code></li>
	<li>The answer is guaranteed to fit within a 32-bit integer, ie. <code>answer &lt;= 2^31 - 1</code>.</li>
</ul>

## Solution

```java
// LeetCode Problem: N-th Tribonacci Number
// Link: https://leetcode.com/problems/n-th-tribonacci-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int tribonacci(int n) {
        int num1=0;
        int num2=1;
        int num3=1;
        int sum=0;
        if(n==0){
            return 0;
        }if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        for(int i=2; i<n; i++){
            sum=num1+num2+num3;
            num1=num2; 
            num2=num3;
            num3=sum;
        }
        return sum;
        
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
