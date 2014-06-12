public class Solution {
    public int romanToInt(String s) {
        int res=0;
        int pre=getDigit(s.charAt(s.length()-1));
        res+=pre;
        for(int i=s.length()-2;i>=0;i--){
            int cur=getDigit(s.charAt(i));
            if(cur<pre){res-=cur;}
            else{res+=cur;}
            pre=cur;
        }
        return res;
    }
    	private int getDigit(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

}
