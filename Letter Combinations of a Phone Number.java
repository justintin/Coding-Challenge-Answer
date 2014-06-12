public class Solution {
    private char[][] map = new char[][] {{},{}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' },
			{ 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' },
			{ 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> ret = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		lc(digits, 0, sb, ret);
		return ret;
    }
    private void lc(String digits, int i, StringBuilder sb, ArrayList<String> ret){
        	if (i >= digits.length()) {
			ret.add(sb.toString());
		} else {
			int index = digits.charAt(i) - '0';
			
			int size = map[index].length;
			for (int j = 0; j < size; j++) {
			    if(index!=0&&index!=1){
				sb.append(map[index][j]);
				lc(digits, i + 1, sb, ret);
				sb.deleteCharAt(sb.length() - 1);}
				else{lc(digits, i + 1, sb, ret);}
				}
		}

    }
}
