public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        
        if(num.length<4){return res;}
        Arrays.sort(num);
        for (int i=0;i<num.length-3;i++){
            if(i!=0&&(num[i]==num[i-1])){continue;}
            for(int j=i+1;j<num.length-2;j++){
                if(j!=i+1&&(num[j]==num[j-1])){continue;}
                int k=j+1;
                int e=num.length-1;
                while(k<e){
                if(k!=j+1&&(num[k]==num[k-1])){k++;continue;}
                if(e!=num.length-1&&(num[e]==num[e+1])){e--;continue;}
                if(num[i]+num[j]+num[k]+num[e]==target){
                    ArrayList<Integer> element = new ArrayList<Integer>();
                    element.add(num[i]);
                    element.add(num[j]);
                    element.add(num[k]);
                    element.add(num[e]);
                    res.add(element);
                    k++;
                    e--;
                    }
                else if(num[i]+num[j]+num[k]+num[e]>target){e--;}
                else if(num[i]+num[j]+num[k]+num[e]<target){k++;}
                }
            }
        }
        return res;
    }
}
