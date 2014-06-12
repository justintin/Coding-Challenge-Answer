public class Solution {
    public int maxProfit(int[] prices) {
      int i;
      int max=0;
      int min;
      if((prices==null)||(prices!=null&&prices.length==0)){return 0;}
      else{
          min=prices[0];     
      for(i=0;i<prices.length;i++){
         // if(prices[i]-min<0){min=prices[i];}
          if((prices[i]-min)>0){max+=prices[i]-min;}
          min=prices[i];
           }
      return max;
          }
    }
}
