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