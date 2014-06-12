public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
            odd.add(1);
            pascal.add(odd);
            pascal.add(even);
            for(int i=1;i<rowIndex+1;i++){
             pascal.get(i%2).clear();
             pascal.get(i%2).add(1);
             for(int j=1;j<i;j++){
                 pascal.get(i%2).add(pascal.get((i+1)%2).get(j-1)+pascal.get((i+1)%2).get(j));
             }
            pascal.get(i%2).add(1);
            }
            return pascal.get((rowIndex)%2);
    }
}
