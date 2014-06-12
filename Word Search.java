public class Solution {
    public boolean exist(char[][] board, String word) {
        //boolean res;
       boolean map[][]=new boolean[board.length][board[0].length];
       for(int i=0;i<board.length;i++){
           for(int j=0;j<board[0].length;j++){
              if(dfs(board,word,0,i,j,map)) {return true;}
              
           }
       }
     return false;
    }
    public boolean dfs(char[][] board, String word,int index, int x, int y, boolean[][] map){
        if(index==word.length()){return true;}
        if(x<0||y<0||x>=board.length||y>=board[0].length){return false;}
        if(map[x][y]){return false;}
        if(board[x][y]!=word.charAt(index)){return false;}
        map[x][y]=true;
        boolean res = dfs( board, word,index+1, x-1, y, map)||dfs( board, word,index+1, x+1, y, map)||dfs( board, word,index+1, x, y-1, map)||dfs( board, word,index+1, x, y+1, map);
        map[x][y]=false;
        return res;
    }
}
