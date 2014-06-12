public class Solution {
    public void sortColors(int[] A) {
        int red=0;
        int white=0;
        int blue=0;
        for (int i=0;i<A.length;i++){
            if (A[i]==0) red++;//
            if (A[i]==1) white++;//
            if (A[i]==2) blue++;//
        }//red=1; white=1; blue=0
        for(int i=0; i<red;i++){A[i]=0;}
        for(int i=red;i<red+white;i++){A[i]=1;}
        for(int i=red+white;i<red+white+blue;i++){A[i]=2;}
    }
}
