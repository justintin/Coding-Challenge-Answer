public class Solution {
    public boolean canJump(int[] A) {
        if(A.length<=1) return true;
        int maxjump=0;
        int curmax=0;
        for(int i=0;i<A.length;i++){
            if(maxjump<i) return false;
            curmax=i+A[i];
            if(curmax>maxjump){maxjump=curmax;}
            if(maxjump>=A.length-1) return true;
        }
        return false;
    }
}
