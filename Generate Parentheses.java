public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        dfs(n,0,0,0,sb,res);
        return res;
    }
    public void dfs(int n, int s, int e, int l, StringBuilder sb, ArrayList<String> res){
        if(e==n){res.add(sb.toString());}
        else{
            if(l>0&&e<n){
                sb.append(")");
                dfs(n,s,e+1,l-1,sb,res);
                sb.deleteCharAt(sb.length()-1);
                }
            if(s<n){
                sb.append("(");
                dfs(n,s+1,e,l+1,sb,res);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
