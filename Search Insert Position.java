public class Solution {
    public int searchInsert(int[] A, int target) {
        int max,min;
        if((A==null)||(A!=null&&A.length==0)){return -1;}
        else{
            min=0;
            max=A.length-1;
            if(max==min){return padding(A[min],target);}
            while(min<max){
                if(target<A[min+(max-min)/2]){max=min+(max-min)/2;}
                else{
                    if(target>A[min+(max-min)/2])
                    {min=min+(max-min)/2+1;}
                    else{return min+(max-min)/2;}
                }
            }
            return min+padding(A[min],target);
        }

    }
    public int padding(int a,int target) {
            if(a>=target){return 0;}
            else{return 1;}
        }
}
