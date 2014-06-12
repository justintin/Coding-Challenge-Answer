public class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
        int temp;
        if(a==null||b==null||(a!=null&&a.length()==0)||(b!=null&&b.length()==0)){return null;}
        else{
            if(a.length()<b.length()){a=padding(a,b.length()-a.length());}
            else{b=padding(b,a.length()-b.length());}
        }
        char[] res = new char[a.length()];
        for(int n=a.length()-1;n>-1;n--){
            temp=a.charAt(n)+b.charAt(n)-48+carry;
            switch(temp){
                case 48:
                	res[n]='0';carry=0;break;
                case 49:
                   res[n]='1';carry=0;break;
                case 50:
                	res[n]='0';carry=1;break;
                case 51:
                    res[n]='1';carry=1;break;
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int n=0;n<a.length();n++){sb.append(res[n]);}
        String newStr = sb.toString();
        if(carry==1){newStr="1"+newStr;}
     return newStr;   
		}
	
	public String padding(String x,int n){
        while(n>0){x="0"+x;n--;}
        return x;
    }
}
