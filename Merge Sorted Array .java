public class Solution {
    public void merge(int A[], int m, int B[], int n) {
    if(A.length!=0&&B.length!=0){
     int k=m+n-1;
        while(m>0&&n>0){
        if(B[n-1]>=A[m-1]){A[k]=B[n-1];n--;}
        else{A[k]=A[m-1];m--;}
        k--;
        }
        if(m==0){
            while(k>=0){A[k]=B[k];k--;}
        }
    }
    else{
        if(A.length==0&&B.length!=0){
            for(int i=0;i<B.length;i++){
                A[i]=B[i];
            }
        }
    }
    }
}


