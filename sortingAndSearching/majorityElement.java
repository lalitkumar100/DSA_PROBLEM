class Solution {
    static int majorityElement(int arr[]) {
        
      HashMap<Integer, Integer> set = new HashMap<>();
       
       for(int i=0;i<arr.length;i++){
           int n=arr[i];
          set.put(n,1+set.getOrDefault(n,0));
          if(set.get(arr[i])>arr.length/2){
              return arr[i];
          }
       }
       return -1;
        
        // your code here
    }
}
