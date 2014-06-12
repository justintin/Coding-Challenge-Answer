c class Solution {
    public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> res = new ArrayList<String[]>();
        if(n==0){return res;}
        StringBuffer line =  new StringBuffer();
        for (int i = 0; i < n; i++) {
			line.append('.');
		}
		StringBuffer[] sol = new StringBuffer[n];
		for (int i = 0; i < n; i++) {
			sol[i] = new StringBuffer(line.toString());
		}
		boolean[] cols = new boolean[n];
		int[] row = new int[n];
		findnextqueen(n, 0, res, sol, row, cols);
		return res;

    }
    public void findnextqueen(int n,int start,  ArrayList<String[]> res,StringBuffer[] sol,int[] row,boolean[] cols){
        if(start==n){String[] newsol = new String[n];
        for (int i = 0; i < n; i++) {
				newsol[i] = sol[i].toString();
			}
            res.add(newsol);
        }
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
					sol[start].setCharAt(i, 'Q');
					row[start] = i;
					findnextqueen(n, start + 1, res, sol, row, cols);
					row[start] = 0;
					sol[start].setCharAt(i, '.');
					cols[i] = false;
				}

            }
        }
    }
}
