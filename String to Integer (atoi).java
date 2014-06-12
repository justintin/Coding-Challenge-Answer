public class Solution {
    public int atoi(String str) {
        str = str.trim();
        int len = str.length();
        if(len==0){return 0;}
        int i=0;
        boolean neg = false;
        if(str.charAt(0)=='-'){neg=true;i++;}
        else if(str.charAt(0)=='+'){i++;}
        long MIN_VALUE = Integer.MIN_VALUE;
		long MAX_VALUE = Integer.MAX_VALUE;
		long num = 0;
		boolean finished = false;
        for(;i<len&&!finished;i++){
            char c = str.charAt(i);
            if(c>='0'&&c<='9'){
                num*=10;
                num+=c-'0';}
            else{finished = true;}
            if(neg&&(0-num)<MIN_VALUE){ return Integer.MIN_VALUE;}
            else if(!neg&&num>MAX_VALUE){return Integer.MAX_VALUE;}
        }
        //return neg ? new Long(0 - num).intValue() : new Long(num).intValue();
        return neg ? 0-(int)num: (int)num;

    }
}
