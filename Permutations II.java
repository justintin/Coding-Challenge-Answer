public class Solution {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
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
         if(isunique(num,begin,end)){
         int t=num[begin];
         num[begin]=num[end];
         num[end]=t;
         pur(num,begin+1,res);
         t=num[begin];
         num[begin]=num[end];
         num[end]=t;}
     }
     
 } 
 public boolean isunique(int[] num, int begin,int end){
     for(int i=begin;i<end;i++){
         if(num[i]==num[end])return false;
     }
     return true;
 }
}
