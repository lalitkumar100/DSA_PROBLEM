class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        for(int i=0;i<Math.max(n,m);i++){
            
            if(i<m){
                if(a[0][i]=='O')
                  trans(a,0,i);
                if(a[n-1][i]=='O')
                  trans(a,n-1,i);
            }
            if(i<n){
                if(a[i][0]=='O')
                 trans(a,i,0);
                 if(a[i][m-1]=='O')
                 trans(a,i,m-1);
            }
        }
     for(int i=0;i<n;i++)
         for(int j=0;j<m;j++){
             if(a[i][j]=='O')
                 a[i][j]='X';
             if(a[i][j]=='#'){
                  a[i][j]='O';
             }    
         }
            
         return a;   
    }
     static  void trans(char[][] a,int i,int j){
         a[i][j]='#';
         if(i-1<a.length&&i-1>=0&&j<a[0].length&&j>=0){
            if(a[i-1][j]=='O')
             trans(a,i-1,j);
         }
         if(i+1<a.length&&i+1>=0&&j<a[0].length&&j>=0){
            if(a[i+1][j]=='O')
             trans(a,i+1,j);
         }
         if(i<a.length&&i>=0&&j+1<a[0].length&&j+1>=0){
            if(a[i][j+1]=='O')
             trans(a,i,j+1);
         }
         if(i-1<a.length&&i-1>=0&&j-1<a[0].length&&j-1>=0){
            if(a[i][j-1]=='O')
             trans(a,i,j-1);
         }
     }
}
