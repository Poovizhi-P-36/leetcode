class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int max=nums[0];
        int min=nums[0];
        int currmax=nums[0];
        int currmin=nums[0];
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
              if(i>0){
    currmax=Math.max(nums[i],currmax+nums[i]);
            max=Math.max(max,currmax);
    currmin=Math.min(nums[i],currmin+nums[i]);
            min=Math.min(min,currmin);
              }
        }
                if(max<0){
                    return max;
                }
                int cir=total-min;
            
            return Math.max(max,cir);
              
        }
}

