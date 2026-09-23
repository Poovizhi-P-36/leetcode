class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int ans=0;
       int right=height.length-1;;
        while(left<right){
            int top=Math.min(height[left],height[right]);
            int widht=right-left;
            int area=top*widht;
            if(area>ans){
                ans=area;
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}