public class Solution {
   public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates,
			int target) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> solution = new ArrayList<Integer>();
		Arrays.sort(candidates);
		combinationSum(candidates, 0, 0, target, ret, solution);
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
		for (int i = start; i < candidates.length; i++) {
			solution.add(candidates[i]);
			combinationSum(candidates, i, sum + candidates[i], target, ret, solution);
			solution.remove(solution.size() - 1);
		}
	}

       
}