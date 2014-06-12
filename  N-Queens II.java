public class Solution {
    
    public int totalNQueens(int n) {
        //int res = 0;
        boolean[] cols = new boolean[n];
		int[] row = new int[n];
		return findnextqueen(n, 0, row, cols);
		//return res;
    }
    public int findnextqueen(int n,int start, int[] row,boolean[] cols){
        int res=0;
        if(start==n){return 1;}
        else{
            for(int i=0;i<n;i++){
                if(cols[i]) continue;//means I take line i
                    boolean ok=true;
                	for (int j = 0; j < start; j++) {
					if (Math.abs(start - j) == Math.abs(i - row[j])) {// j means in colum j, row[j] means queen put in which line
						ok = false;
						break;}}
            	if (ok) {
					cols[i] = true;
					row[start] = i;
					res+=findnextqueen(n, start + 1,row, cols);
					row[start] = 0;
					cols[i] = false;
				}

            }
        }
        return res;
    }
}
