public class Solution {
    public int trap(int[] A) {
        if(A.length<3) return 0;
        int water=0;
        int maxleft=0;
        int maxright=A.length-1;
        for(int i=0; i<A.length;i++){
            if(A[i]>A[maxleft]){maxleft=i;}
        }
        for(int i=A.length-1;i>=0;i--){
            if(A[i]>A[maxright]){maxright=i;}
        }
        int max=A[0];
        for(int i=1;i<maxleft;i++){
            if(A[i]<max){water+=max-A[i];}
            else{max=A[i];}
        }
        max=A[A.length-1];
        for(int i=A.length-1;i>maxright;i--){
            if(A[i]<max){water+=max-A[i];}
            else{max=A[i];}
       }
       for(int i=maxleft+1;i<maxright;i++){
           water+=A[maxleft]-A[i];
       }
       return water;
    }
}
