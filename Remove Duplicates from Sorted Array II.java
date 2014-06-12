public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length<3){return A.length;}
        int counter=1;
        int cur=1;
        //boolean lock=false;
        for(int i=1;i<A.length;i++){
         if(A[i]==A[i-1]){
             counter++;
             if(counter<=2){
                 A[cur]=A[i];
                 cur++;}
         }
         else{
             A[cur]=A[i];
             counter=1;
             cur++;
         }
        }
        return cur;
        
    }
}
