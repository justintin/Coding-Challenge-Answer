public class Solution {
    public int climbStairs(int n) {
       if(n<3){return n;}
       else{
           int[] record = new int[n];
       record[0]=1;
       record[1]=2;
       for(int i=2;i<n;i++){
        record[i]=record[i-1]+record[i-2];    
        }
        return record[n-1];
       }
       
    }
}
