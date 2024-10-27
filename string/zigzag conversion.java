class Solution {
    public String convert(String s, int numRows) {
          int h=0;
          int cont=numRows-2;
          int col=0;
          boolean set= true;

          if(numRows==1){
            return s;
          }
          while(h<s.length()){
            if(set==true&&cont==numRows-2){
               cont=0;
                set=false;
                h+=numRows;
                col++;
                System.out.println("if = "+col);
            }
            else{ 
                cont++;              
                set=true;
                h++;
                col++;
                System.out.println("else = "+col);
            }
          }






        System.out.println(col);

        char[][] mat = new char[numRows][col];
          int i=0;
          int l=0;
          int k=0;
          while(i<s.length()){
           
            while(k<numRows&&i<s.length()){
                 System.out.println("1 insert"+k+""+l+"] = "+s.charAt(i));

                mat[k++][l]=s.charAt(i++);
             
            }
            k--;
           
           while(s.length()>i&&k>0){
            System.out.println("2 insert"+(k-1)+""+(l+1)+"] = "+s.charAt(i));
             mat[--k][++l]=s.charAt(i++);
              
           }
           k++;
          }
          StringBuilder str = new StringBuilder();

          for(int m =0;m<numRows;m++){
          for(int n=0;n<col;n++){
            
            if(mat[m][n]!='\u0000')
               str.append(mat[m][n]);
            System.out.print(" "+mat[m][n]);
           
           
          }
          System.out.println();
        }
         System.out.println(str.toString());  
    
    return str.toString();
    }
}
