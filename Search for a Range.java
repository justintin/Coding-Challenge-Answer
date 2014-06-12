public class Solution {
    public int[] searchRange(int[] A, int target) {
        int[] index={-1,-1};
        for(int i =0;i<A.length;i++){
            if(A[i]==target){
             index[0]=i;
             break;
            }}
            if(index[0]==-1) return index;
            index[1]=index[0];
            for(int i =index[0];i<A.length;i++){
                if(A[i]==target){index[1]=i;}
                else{break;}
                
            }
            return index;
    }
}
