// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place.

 
class Solution {
      int key =-12932;
    public void setZeroes(int[][] matrix) {

      

        for(int i=0;i<matrix.length;i++)
          for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                setkey(matrix,i,j+1,'r');
                setkey(matrix,i,j-1,'l');
                setkey(matrix,i-1,j,'u');
                setkey(matrix,i+1,j,'d');

            }
          }
           for(int i=0;i<matrix.length;i++)
          for(int j=0;j<matrix[0].length;j++)
              if(key==matrix[i][j])
                matrix[i][j]=0;
        
    }
    void setkey(int[][] matrix,int i,int j,char dir){

       if((i<matrix.length&&i>=0)&&(j<matrix[0].length&&j>=0)){
        if(matrix[i][j]!=0)
          matrix[i][j]=key;
        
        if(dir=='u')
           setkey(matrix,i-1,j,'u'); 
        else if(dir=='r')
           setkey(matrix,i,j+1,'r'); 
        else if(dir=='l')
           setkey(matrix,i,j-1,'l'); 
        else
         setkey(matrix,i+1,j,'d');   
        
        }
        else{
            return;
        }
        return;
       
    } 
}
