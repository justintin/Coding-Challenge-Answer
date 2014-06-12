public class Solution {
    public int singleNumber(int[] A) {
        int i;
        //int uni;
        for(i=1;i<A.length;i++)
        {
            A[0]^=A[i];
        }
        return A[0];
    }
}
