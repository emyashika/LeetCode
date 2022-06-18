class Solution {
    public int majorityElement(int[] nums) {
        int maj=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                maj=nums[i];
                count++;
            }
            else if(nums[i]==maj){
                count++;
            }
            else if(nums[i]!=maj){
                count--;
            }
        }
        for(int e:nums){
            if(e==maj){
                count++;
            }
        }
        return count>(nums.length/2)?maj:-1;
    }
}