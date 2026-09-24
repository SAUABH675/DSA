# Add Binary

**Difficulty:** Easy  
**Topics:** Math, String, Bit Manipulation, Simulation  
**LeetCode URL:** [Add Binary](https://leetcode.com/problems/add-binary/)

## Problem Description

<p>Given two binary strings <code>a</code> and <code>b</code>, return <em>their sum as a binary string</em>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> a = "11", b = "1"
<strong>Output:</strong> "100"
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> a = "1010", b = "1011"
<strong>Output:</strong> "10101"
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= a.length, b.length &lt;= 10<sup>4</sup></code></li>
	<li><code>a</code> and <code>b</code> consist&nbsp;only of <code>&#39;0&#39;</code> or <code>&#39;1&#39;</code> characters.</li>
	<li>Each string does not contain leading zeros except for the zero itself.</li>
</ul>

## Solution

```python
# LeetCode Problem: Add Binary
# Link: https://leetcode.com/problems/add-binary/
# Difficulty: Easy
# Language: python

class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        i=len(a)-1
        j=len(b)-1
        carry=0
        result=[]
        while i>=0 or j>=0 or carry:
            x=int(a[i]) if i>=0 else 0
            y=int(b[j]) if j>=0 else 0
            total =x+y+carry
            result.append(str(total%2))
            carry=total//2
            j-=1
            i-=1
        return "".join(reversed(result))
        
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
