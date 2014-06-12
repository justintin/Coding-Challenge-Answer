public class Solution {
    public int removeElement(int[] A, int elem) {
        int start=-1;
        int end=-1;
        if(A==null|A.length==0){return 0;}
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            if(A[i]==elem){start=i;break;}
        }
        for(int i=A.length-1;i>=0;i--){
            if(A[i]==elem){end=i;break;}
        }
        if(start==-1){return A.length;}    
        else{
            if(A.length-(end-start+1)==0){return 0;}
            else{
                end++;
                while(end<A.length){
                    A[start]=A[end];
                    start++;
                    end++;
                }
                return start;
            }
        }
        
    }
}
