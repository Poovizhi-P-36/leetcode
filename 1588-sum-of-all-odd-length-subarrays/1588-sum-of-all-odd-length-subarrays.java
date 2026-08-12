class Solution {
    public int sumOddLengthSubarrays(int[] nums) {
       int ans=0;
       for(int i=0;i<nums.length;i++){
        int sum=0;
        for(int j=i;j<nums.length;j++){
            sum=sum+nums[j];
            int length=j-i+1;
            if(length%2 != 0){
                ans=ans+sum;
            }
        }
       }
       return ans;
    }
}