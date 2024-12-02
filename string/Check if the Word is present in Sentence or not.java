

import java.util.* ;
import java.io.*; 

public class Solution 
{

	public static boolean findWord(String s, String w) 
	{
          String regx = "[//s]";
		  String[] strarr = s.split(" ");
		    // System.out.println(s);
		  for(int i=0;i<strarr.length;i++){
			//   System.out.println(strarr[i]);
			 if(strarr[i].equals(w))
			  return true; 
		  }
		  return false;
	}
}
