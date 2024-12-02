import java.util.* ;
import java.io.*;

public class Solution {
	public static ArrayList<Character> firstNonRepeating(String stream) {
		// Write your code here

		Queue<Character> q =new LinkedList<>() ;
		HashMap<Character,Integer> map = new HashMap<>();
		ArrayList<Character> str = new ArrayList<>();
        
		for(int i=0;i<stream.length();i++){
        char ch =stream.charAt(i);

		q.add(ch);
		map.put(ch,map.getOrDefault(ch,0)+1);

		while(!q.isEmpty()){
			if(map.get(q.peek())>1){
                 q.poll();
			}
			else{
				break;
			}
		}
		if(!q.isEmpty()){
			str.add(q.peek());
		}
		


		}

        return str;
	}
}
