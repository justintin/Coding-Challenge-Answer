public class Solution {
    public String intToRoman(int num) {
        	String a[][] = {
				{ "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
				{ "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
				{ "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" },
				{ "M", "MM", "MMM", "", "", "", "", "", "" } };
       String res="";
       int key=0;
       while(num!=0){
           int d=num-num/10*10;
           if(d!=0){res=a[key][d-1]+res;}
           num=num/10;
           key++;
       }
       return res;
    }
}
