class Solution {
    public int singleNumber(int[] nums) {
        int res=nums[0];
        if(nums.length==1){
            return res;
        }
        for(int i=1;i<nums.length;i++){
            res=res^nums[i];
        }
        return res;
    }
}