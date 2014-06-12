public class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuffer res= new StringBuffer();
        String[] token = s.split("\\s+");
        if(token.length!=0){
            for(int i=token.length-1;i>0;i--){
                res.append(token[i]);
                res.append(" ");
            }
            res.append(token[0]);
            return res.toString();
        }
        else return "";
    }
}
