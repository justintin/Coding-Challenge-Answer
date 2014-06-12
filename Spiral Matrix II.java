public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if(n==0)return res;
        
        int startX=0;
        int startY=0;
        int endX=res.length-1;
        int endY=res[0].length-1;
        int s=1;
        while(true){
            for(int i=startY;i<=endY;i++){res[startX][i]=s;s++;}
            if(++startX>endX)break;
            for(int i=startX;i<=endX;i++){res[i][endY]=s;s++;}
            if(startY>--endY)break;
            for(int i=endY;i>=startY;i--){res[endX][i]=s;s++;}
            if(startX>--endX)break;
            for(int i=endX;i>=startX;i--){res[i][startY]=s;s++;}
            if(++startY>endY)break;
        }
        return res;
    }
}
