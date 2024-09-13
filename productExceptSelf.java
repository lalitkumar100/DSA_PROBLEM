
//o(n) time complexity
//o(n) space complexity
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int p1=1;
        int p2 =find(nums,1,nums[0]);
         nums[0]=p1*p2;
         return nums;
    }

   int find(int[] nums, int i ,int p1){
        if(i==nums.length-1){
            int p2=nums[i];
            nums[i]=p1;
            return p2;
        }
        else{
            int p2 =find(nums,i+1,p1*nums[i]);
            int p =nums[i];
            nums[i]=p2*p1;
            return p2*p;
        }
    }
}
