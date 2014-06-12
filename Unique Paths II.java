public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] res = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<res[0].length;i++){
            if(obstacleGrid[0][i]!=1){res[0][i]=1;}
            else{break;}
        }
        for(int i=0;i<res.length;i++){
            if(obstacleGrid[i][0]!=1){res[i][0]=1;}
            else{break;}
        }
        for(int i=1;i<res.length;i++){
            for(int j=1;j<res[0].length;j++){
                if(obstacleGrid[i][j]!=1){res[i][j]=res[i][j-1]+res[i-1][j];}
            }
        }
        return res[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
