import java.util.*;

public class Main {
  
   static int find(int[][] a){
     ArrayList<Integer> a1 = new ArrayList<>();
      for(int i=0;i<a[0].length;i++){
        a1.add(a[0][i]);
      }
      for(int j =0; j<a.length;j++){
        ArrayList<Integer> a2 = new ArrayList<>();
      for(int i=0;i<a[0].length;i++){
        a2.add(a[j][i]);
      }
      for(int i=0;i<a1.size();i++){
        if(!a2.contains(a1.get(i))){
          a1.remove(i);
        }
      }
      
      }
      if(a1.size()==0)
       return -1;
       return a1.get(0);
   }
    
    public static void main(String[] args) {
     int mat[][] = {{ 1, 2, 3, 4, 5 }, 
                   { 2, 4, 5, 8, 10 }, 
                   { 3, 5, 7, 9, 11 }, 
                   { 1, 3, 5, 7, 9 }}; 
    int result = find(mat); 
    if (result == -1) 
        System.out.println("No common element"); 
    else
        System.out.println("Common element is " + result); 
    } 
  }
