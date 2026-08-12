class Solution {
    public int singleNumber(int[] nums) {
      
      for(int i=0;i<nums.length;i++){
        int curr=nums[i];
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==curr){
                count++;
            }
            }
             if(count==1){
                return curr;
            }
        }
    
        return -1;
      
    }
}
