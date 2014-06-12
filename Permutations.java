public class Solution {
    
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> res =  new ArrayList<ArrayList<Integer>>();
          pur(num,0,res);
          return res;
        }
 public void pur(int[] num,int begin,ArrayList<ArrayList<Integer>> res){
     if(begin>num.length-1){
         ArrayList<Integer> temp = new ArrayList<Integer>();
         for(int i=0;i<num.length;i++){temp.add(num[i]);}
         res.add(temp);
     }
     for(int end=begin;end<num.length;end++){
         int t=num[begin];
         num[begin]=num[end];
         num[end]=t;
         pur(num,begin+1,res);
         t=num[begin];
         num[begin]=num[end];
         num[end]=t;
     }
     
 }       
    
}
