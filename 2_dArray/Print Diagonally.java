//{ Driver Code Starts
//Initial Template for Java
// Give a N * N square matrix A, return all the elements of its anti-diagonals from top to bottom
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDiagonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDiagonal(int N, int A[][])
    {
        ArrayList<Integer> set = new ArrayList<>();
        int n =A.length;
        int i=0;
        int j=0;
         set.add(A[i][j++]);
       while(j<n){
           int seti=i;
           int setj=j;
           while(seti!=j+1){
            //   System.out.println(seti"=seti setj="set)
               set.add(A[seti][setj]);
               seti++;
               setj--;
           }
           j++;
       }
       j--;
       i++;
       while(i<n){
            int seti=i;
           int setj=j;
           while(seti!=j+1){
               set.add(A[seti][setj]);
               seti++;
               setj--;
           }
           i++;
       }
      return set;  // code here 
    }
}
