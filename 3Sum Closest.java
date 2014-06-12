public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int res=num[0]+num[1]+num[2];
        int diff=Integer.MAX_VALUE;
        int k=num.length-1;
        Arrays.sort(num);
        for(int i=0;i<k-1;i++){
            for(int j=i+1;j<k;){
                //if(j>i+1&&(num[j]==num[j-1])){j++;continue;}
                //if(k<num.length-1&&(num[k]==num[k+1])){k--;continue;}
                int sum = num[i]+num[j]+num[k];
                if(Math.abs(target-sum)<diff){
                    res=sum;
                    diff=Math.abs(target-sum);
                }
                if(target-sum==0){return res;}
                if(target-sum<0){k--;}
                else{j++;}
            }
        }
        return res;
    }
    
}
