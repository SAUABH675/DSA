class Solution {
    public int mySqrt(int x) {
        long low=0, high=x;
        int res=0;
        while(low<=high){
            long mid= (low+high)/2;
            if(mid*mid==(long)x) {
                return (int)mid;
            }
            else if(mid*mid>(long)x){
                high=mid-1;
            }else{
                low=mid+1;
                res=(int)mid;
            }
        }
        return res;
    }
}