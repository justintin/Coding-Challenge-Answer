public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
       	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> solution = new ArrayList<Integer>();
		Arrays.sort(num);
		combinationSum(num, 0, 0, target, ret, solution);
		return ret; 
    }
    private void combinationSum(int[] candidates, int start, int sum,
			int target, ArrayList<ArrayList<Integer>> ret,
			ArrayList<Integer> solution) {
		if (sum == target) {
			ret.add(new ArrayList<Integer>(solution));
			return;
		}
		if (sum > target)
			return;
			int pre=-1;
		for (int i = start; i < candidates.length; i++) {
		    if(pre==candidates[i]){continue;}
		    pre = candidates[i];
			solution.add(candidates[i]);
			combinationSum(candidates, i+1, sum + candidates[i], target, ret, solution);
			solution.remove(solution.size() - 1);
		}
	}
}
