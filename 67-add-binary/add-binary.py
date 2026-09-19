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
        