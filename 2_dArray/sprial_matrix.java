class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int d = matrix.length-1;
        int r = matrix[0].length-1;
        int u=0,l=0,i=0,j=0,n=0;
        int a = (r+1)*(d+1);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            while(j<=r){
                list.add(matrix[i][j]);
                n++;
                j++;
            }
            if(n==a){
                break;
            }
            u++;
            j--;
            i=u;
            while(i<=d){
                list.add(matrix[i][j]);
                n++;
                i++;
            }
            if(n==a){
                break;
            }
            r--;
            i--;
            j=r;
            while(j>=l){
                list.add(matrix[i][j]);
                n++;
                j--;
            }
            if(n==a){
                break;
            }
            d--;
            j++;
            i=d;
            while(i>=u){
                list.add(matrix[i][j]);
                n++;
                i--;
            }
            if(n==a){
                break;
            }
            l++;
            i++;
            j=l;
        }
        return list; 
    }
}
