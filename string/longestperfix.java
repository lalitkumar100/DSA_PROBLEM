class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder perfix= new StringBuilder();
      int last=strs.length-1;
      if(last==0){
        if(strs[0].length()==0)
           return "";
         
         else{
            return strs[0];
         }
      }
        Arrays.sort(strs);
        for(int i=0;i<Math.min(strs[0].length(),strs[1].length());i++){
           if(strs[0].charAt(i)==strs[last].charAt(i)){
            perfix.append(strs[0].charAt(i));
           }
           else
             return perfix.toString();
        }
         return perfix.toString();
    }
}
