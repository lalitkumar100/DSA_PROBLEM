class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        int ans =0;
       Arrays.sort(arr);
         for(int i=0;i<n-2;i++){
             int j=i+1;
             int k =n-1;
             while(j<k){
                 if(arr[i]+arr[k]+arr[j]>=sum){
                     k--;
                 }
                 else{
                    ans +=(k-j);
                    j++;
                 }
             }
         }
        return ans;
    }
}
