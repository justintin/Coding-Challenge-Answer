public class Solution {
    public int[] plusOne(int[] digits) {
        
        int add=1;
        
        for(int i=digits.length-1;i>=0;i--){
           int temp=add+digits[i];
           digits[i]=temp%10;
           add=temp/10;
           if(add==0){break;}
        }
        if(add!=0){
            int[] resm = new int[digits.length+1];
            resm[0]=add;
            for(int i=1;i<resm.length;i++){
                resm[i]=digits[i-1];
            }
            return resm;
        }
        else{return digits;}
    }
}
