public class Solution {
    public int reverse(int x) {
     int neg=0;
     int temp = 0;
     int ret = 0;
        if (x < 0){neg=1;x=-x;}
        while ((x/10!=0)|(x>0)){
            temp = temp*10+ x%10;
            if(temp<ret){return 0;}
            ret=temp;
            x = x / 10;
        }
        //ret =ret*10+x;
        if (neg==1) return -ret;
        return ret;
    }
}
