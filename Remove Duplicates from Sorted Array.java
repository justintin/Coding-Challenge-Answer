public class Solution {
    public int removeDuplicates(int[] A) {
      if(A==null||A.length==0){return 0;}
      else{
         int length=1;
         int index=0;
         int temp;
         while(index<A.length){
             temp=diff(index,index+1,A);
             if(temp==index){return length;}
             else{A[length]=A[temp];length++;index=temp;}
         }
         return length;
      }
    }
    public int diff(int origin,int next,int[] A){
        if(next==A.length){return origin;}
        else{if(A[next]!=A[origin]){return next;}
            else{return diff(origin,++next,A);}
        }
    }
}
