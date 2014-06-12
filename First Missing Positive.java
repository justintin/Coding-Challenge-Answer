import java.util.*;

public class Solution {
    public int firstMissingPositive(int[] A) {
        if(A==null||A.length==0){return 1;}
        else{
            int snum=1;
            Arrays.sort(A);
            keepfit(A);
            Arrays.sort(A);
            for(int i=0;i<A.length;i++){
                if(A[i]>0){
                    if(A[i]!=snum){return snum;}
                    else{ snum++;}
            }
            }
            return A[A.length-1]+1;
        }
    }
    public int searchpos(int[] A){
        for(int i=0;i<A.length;i++){
            if(A[i]>0){return i;}
        }
        return -1;
    }
    public void keepfit(int[] A){
        for(int i=0;i<A.length;i++){
            if(i>0){
                if(A[i]==A[i-1]||A[i]<0){A[i-1]=0;}
            }
        }
    }
}
