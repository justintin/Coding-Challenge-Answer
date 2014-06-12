public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap map =  new HashMap();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!map.containsValue(board[i][j])){map.put(board[i][j],board[i][j]);}
                    else{return false;}
                }
            }
            map.clear();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    if(!map.containsValue(board[j][i])){map.put(board[j][i],board[j][i]);}
                    else{return false;}
                }
            }
            map.clear();
        }
        for(int i=0;i<3;i++){
		    for(int j=0;j<3;j++){
		      for(int k=0;k<3;k++){
		        for(int l=0;l<3;l++){
		        if(board[i*3+k][j*3+l]!='.'){
		            if(!map.containsValue(board[i*3+k][j*3+l])){map.put(board[i*3+k][j*3+l],board[i*3+k][j*3+l]);}
		            else{return false;}
		        }
		        }
		    }
		    map.clear();
		    }
		}
        
        
        return true;
    }
}
