public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> gray = new ArrayList<Integer>();
        if(n==0){
            gray.add(0);
            return gray;}
        else{
        long temp=0;
        gray.add(0);
        gray.add(1);
        for(int i=1;i<n;i++){
            int bit=1<<i;
            for(int j = gray.size()-1;j>=0;j--){
                gray.add(gray.get(j)+bit);
            }
        }
      return gray;  
    }
    }
}
