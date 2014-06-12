public class Solution {
    public int maxArea(int[] height) {
        if(height==null||height.length<2)return 0;
        int water;
        int left=0;
        int right=height.length-1;
        water=(right-left)*Math.min(height[left],height[right]);
        while(left<right){
            if(height[left]<height[right]){left++;}
            else{right--;}
            water=Math.max(water,(right-left)*Math.min(height[left],height[right]));
        }
        return water;
    }
}
