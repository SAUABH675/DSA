class Solution {
    public int fib(int n) {
        int num1=0;
        int num2=1;
        int sum=0;
        if(n==0){
            return 0;
        }if(n==1){
            return 1;
        }
        for(int i=1; i<n; i++){
            sum=num1+num2;
            num1=num2;
            num2=sum;
        }
        return sum;
    }
}