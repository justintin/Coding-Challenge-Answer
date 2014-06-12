public class Solution {
    public int numDistinct(String S, String T) {
        if(S.length()<T.length()){return 0;}
        int sl = S.length();
        int tl = T.length();
        int[][] res = new int[sl+1][tl+1];
        for(int i=0;i<=sl;i++){res[i][0]=1;}
        for(int i=1;i<=sl;i++){
            for(int j=1;j<=tl;j++){
                if(S.charAt(i-1)==T.charAt(j-1)){
                    res[i][j]=res[i-1][j-1]+res[i-1][j];
                }
                else{res[i][j]=res[i-1][j];}
            }
        }
        return res[sl][tl];
    }
}
