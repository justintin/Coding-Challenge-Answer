public class Solution {
    public int maxSubArray(int[] A) {
        int current,max;
        if(A==null||A.length==0){return 0;}
        else{
            current=A[0];
            max=A[0];
            for(int i=1;i<A.length;i++){
                current+=A[i];        
                if(current>=A[i]&&current>max){max=current;}
                else{
                    if(A[i]>current){
                        if(A[i]>=max){max=A[i];} 
                        current=A[i];
                        }
                }
            }
        }
        return max;
    }
}
