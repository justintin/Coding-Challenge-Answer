public class Solution {
    public int search(int[] A, int target) {
        int res = search(A,0,A.length-1,target);
        return res;
    }
    public int search(int[] A, int left, int right,int target){
        int mid=(left+right)/2;
        if(A[mid]==target){return mid;}
        if(left>right){return -1;}
        if(A[mid]>=A[left]){
            if(target>=A[left]&&target<=A[mid]){return search(A,left,mid-1,target);}
            else{return search(A,mid+1,right,target);}
        }
        else{
            if(target>=A[mid]&&target<=A[right]){return search(A,mid+1,right,target);}
            else{return search(A,left,mid-1,target);}
        }
    }
}
