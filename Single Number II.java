public class Solution {
    public int singleNumber(int[] A) {
        int[] single= new int[32];
        int res=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<32;j++){
                single[j]+=A[i]&0x01;
                A[i]=A[i]>>1;
            }
        }
        for(int j=0;j<32;j++){
            res+=(single[j]%3)<<j;
        }
        return res;
    }
}
