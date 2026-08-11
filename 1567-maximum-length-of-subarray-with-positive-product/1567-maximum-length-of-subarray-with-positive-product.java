class Solution {
    public int getMaxLen(int[] nums) {
        int pos=0;
        int neg=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos=pos+1;
            if(neg>0){
                neg=neg+1;
            }
            }
            else if(nums[i]<0){
                int temp=pos;
                if(neg>0){
                    pos=neg+1;
                }else
            {
                pos=0;
            }
            neg=temp+1;
            }
            else{
                pos=0;
                neg=0;
            }
            if(pos>max){
                max=pos;
            }
        }
        return max;
    }
}