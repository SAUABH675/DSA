class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int temp=x;
        int result=0;
        while(temp!=0){
            result=result*10+temp%10;
            temp/=10;
        }
        return x == result || x == result / 10;
    }
}