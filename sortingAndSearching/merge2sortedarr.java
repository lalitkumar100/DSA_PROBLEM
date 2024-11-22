class Solution {
    
     static void  swapifgreater(int a[], int b[],int left ,int right){
           
           if(a[left]>b[right]){
               int temp= a[left];
               a[left]=b[right];
               b[right]=temp;
               }
       }
    
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n =a.length;
        int m =b.length;
        int len =m+n;
        int gap =(len/2)+(len%2);
        
        while(gap>0){
            int left =0;
            int right =left +gap;
            while(right<len){
                if(left<n&&right>=n){
                    swapifgreater(a,b,left,right-n);
                }
                else if (left>=n){
                     swapifgreater(b,b,left-n,right-n);
                }
                else{
                      swapifgreater(a,a,left,right);
                }
                left++;
                right++;
            }
            if(gap==1){
                break;
            }
            gap =(gap/2)+(gap%2);
        }
    }
}
