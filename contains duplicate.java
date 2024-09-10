//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
//use hahmaps
//use put(),containskey
//fastest solutions 
class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashMap<Integer,Integer> arr = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        { if(arr.containsKey(nums[i]))
            return true;
        else
           arr.put(nums[i],1);
        
    }
   return false;
}
}   
