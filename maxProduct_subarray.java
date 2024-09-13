// Given an integer array nums, find a 
// subarray
//  that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.
class Solution {
    public int maxProduct(int[] nums) {
       
       int maxp=nums[0];
       int minp=nums[0];
       int ans =nums[0];
       for(int i=1;i<nums.length;i++){
        if(nums[i]<0){
            int temp =maxp;
            maxp=minp;
            minp=temp;
        }
         minp=Math.min(nums[i],nums[i]*minp);
         maxp=Math.max(nums[i],nums[i]*maxp);
         ans =Math.max(ans,Math.max(maxp,minp));

       }
       return ans;
    }
