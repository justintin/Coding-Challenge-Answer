public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        
        
        Arrays.sort(num);
        for(int i=0;i<num.length-2;i++){
            int k = num.length-1;
            if (i>0&&num[i]==num[i-1])
				continue;
            for(int j=i+1;j<k;){
                
                int sum=num[i]+num[j]+num[k];
                if(sum==0){
                    if (j!=i+1&&num[j]==num[j-1]) {
						j++;
						continue;
					}
					if (k!=num.length-1&&num[k]==num[k+1]){
						k--;
						continue;
					}
                    ArrayList<Integer> element = new ArrayList<Integer>();
                    
                    element.add(num[i]);
                    element.add(num[j]);
                    element.add(num[k]);
                    res.add(element);
                    k--;
                    j++;
                }
                else{
                    if(sum>0){k--;}
                    else{j++;}
                }
            }
        }
        return res;

/*
ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		int a, b, c, k, l;
		for (int i = 0; i <= num.length - 3; i++) {
			if (i > 0 && num[i] == num[i - 1])
				continue;
			a = num[i];
			k = i + 1;
			l = num.length - 1;
			while (k < l) {
				b = num[k];
				c = num[l];
				if (a + b + c == 0) {
					if (k != i + 1 && num[k] == num[k - 1]) {
						k++;
						continue;
					}
					if (l != num.length - 1 && num[l] == num[l + 1]) {
						l--;
						continue;
					}
					ArrayList<Integer> item = new ArrayList<Integer>();
					item.add(a);
					item.add(b);
					item.add(c);
					result.add(item);
					l--;
					k++;
				} else if (a + b + c > 0) {
					l--;
				} else {
					k++;
				}
			}
		}
		return result;
*/
    }
}
