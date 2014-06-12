public class Solution {
    public int longestConsecutive(int[] num) {
        int res=1;
        int max=1;
        Arrays.sort(num);
        for(int i=1;i<num.length;i++){
            if(num[i]-num[i-1]!=0){
            if(num[i]-num[i-1]==1){max++;
                if(max>res){res=max;}
            }
            else{max=1;}}
        }
        return res;
    }
}
