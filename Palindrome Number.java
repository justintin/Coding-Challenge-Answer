public class Solution {
    public boolean isPalindrome(int x) {
        	if (x < 0)
			return false;
		int k = 1;
		while (x / k >= 10) {
			k *= 10;
		}
		while (x >= 1) {
			int left = x / k;
			int right = x - x / 10 * 10;
			if (left != right)
				return false;
			x = (x - x / k * k) / 10;
			k /= 100;
		}
		return true;

    }
}
