class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=nums[0];
        int currmax=nums[0];
        int min=nums[0];
        int currmin=nums[0];
        for(int i=1;i<nums.length;i++){
            currmax=Math.max(nums[i],currmax+nums[i]);
            max=Math.max(max,currmax);
            currmin=Math.min(nums[i],currmin+nums[i]);
            min=Math.min(min,currmin);
        }
        return Math.max(max,Math.abs(min));
    }
}