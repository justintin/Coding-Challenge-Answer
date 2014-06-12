public class Solution {
 public ArrayList<ArrayList<Integer>> combine(int n, int k) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> part = new ArrayList<Integer>();
    
    comb(res,part,1,n,k);
    return res;
}
private void comb(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> part,int begin,int n,int k){
    if(part.size()>=k){
        ArrayList<Integer> temp = new ArrayList<Integer>(part);
        res.add(temp);}
    else{
    for(int end=begin ;end<=n;end++){
          part.add(end);
          comb(res,part,end+1,n,k);
          part.remove(part.size()-1);
                }
}
}

}
