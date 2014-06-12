public class Solution {
    public void solve(char[][] board) {
        if(board==null||board.length==0){return;}
        Queue<Integer> qx = new LinkedList<Integer>();
        Queue<Integer> qy = new LinkedList<Integer>();
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0||i==n-1||j==0||j==m-1)&&board[i][j]=='O'){qx.add(i);qy.add(j);}
            }
        }
            while(!qx.isEmpty()){
                int x=qx.remove();
                int y=qy.remove();
                board[x][y]='@';
                if(x-1>0&&board[x-1][y]=='O'){qx.add(x-1);qy.add(y);}
                if(x+1<n&&board[x+1][y]=='O'){qx.add(x+1);qy.add(y);}
                if(y-1>0&&board[x][y-1]=='O'){qx.add(x);qy.add(y-1);}
                if(y+1<m&&board[x][y+1]=='O'){qx.add(x);qy.add(y+1);}
            }
            for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(board[i][j]=='O'){board[i][j]='X';}
               if(board[i][j]=='@'){board[i][j]='O';}
            }
        } 
        
    }
}
