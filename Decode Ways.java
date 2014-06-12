public class Solution {
    public int numDecodings(String s) {
        if(s.length()==0) return 0;
        if(s.charAt(0)=='0')return 0;
        int[] ways = new int[s.length()+1];
        ways[0]=1;
        ways[1]=1;
        for(int i=2;i<s.length()+1;i++){
            if(s.charAt(i-1)=='0'){
                if(s.charAt(i-2)=='1'||s.charAt(i-2)=='2'){ways[i]=ways[i-2];}
                else{return 0;}
                }
            else{
                ways[i]=ways[i-1];
                if(combinable(s.substring(i-2,i))){ways[i]+=ways[i-2];}
            }
        }
        return ways[s.length()];
    }
    public boolean combinable(String s){
        if(s.charAt(0)=='0'){return false;}
        int code = Integer.parseInt(s);
        return code >=1 &&code<=26;
    }
}
