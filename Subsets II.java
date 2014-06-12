public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> last=null;
        res.add(new ArrayList<Integer>());
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
    	ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();
    	ArrayList<ArrayList<Integer>> prev = (i == 0 || num[i] != num[i - 1] ? res : last);
    	for(ArrayList<Integer> s: prev){
    	    ArrayList<Integer> newset = new ArrayList<Integer>(s);
    	    newset.add(num[i]);
    	    tmp.add(newset);
    	}
    	res.addAll(tmp);
    	last=tmp;
        }
        return res;
    }
}
