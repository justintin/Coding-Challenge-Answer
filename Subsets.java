public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        	Arrays.sort(S);
		ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
		subsets.add(new ArrayList<Integer>());
		for (int i = 0; i < S.length; i++) {
			int size = subsets.size();
			for (int j = 0; j < size; j++) {
				ArrayList<Integer> subset = new ArrayList<Integer>(
						subsets.get(j));
				subset.add(S[i]);
				subsets.add(subset);
			}
		}
		return subsets;

    }
}
