public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int[] path = new int[triangle.size()];
        int n = triangle.size()-1;
        for(int i=0;i<triangle.get(n).size();i++){path[i]=triangle.get(n).get(i);}
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0,t=0;j<triangle.get(i+1).size()-1;j++,t++){
                path[t]=triangle.get(i).get(t)+Math.min(path[j],path[j+1]);
            }
        }
        return path[0];
    }
}
