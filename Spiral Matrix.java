public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(matrix==null||matrix.length==0)return res;
        
        int startX=0;
        int startY=0;
        int endX=matrix.length-1;
        int endY=matrix[0].length-1;
        while(true){
            for(int i=startY;i<=endY;i++){res.add(matrix[startX][i]);}
            if(++startX>endX)break;
            for(int i=startX;i<=endX;i++){res.add(matrix[i][endY]);}
            if(startY>--endY)break;
            for(int i=endY;i>=startY;i--){res.add(matrix[endX][i]);}
            if(startX>--endX)break;
            for(int i=endX;i>=startX;i--){res.add(matrix[i][startY]);}
            if(++startY>endY)break;
        }
        return res;
    }
}
