
// Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
// Since the result may be very large, so you need to return a string instead of an integer
//time complexity o(nlogn)
//space complexity o(n)

class Solution {
    public String largestNumber(int[] nums) {
    
      String[] str =new String[nums.length];
      for(int i=0;i<nums.length;i++){
        str[i]=Integer.toString(nums[i]);
      }   
      Arrays.sort(str,(a,b)->{
        return (b+a).compareTo(a+b);
      });
      if(str[0].equals("0")){
          return str[0];
      }
      StringBuilder ans = new StringBuilder();
      for(String s: str){
        ans.append(s);
      }
      return ans.toString();

        
        
    }
}
