
class Solution {
    public boolean isPalindrome(String s) {

        String s1=s.replaceAll("\\W+","");
        String s2=s1.toLowerCase();
        String s3=s2.replaceAll("_","");
        int l=0;
        int r=s3.length()-1;
        while(l<r){
            if(s3.charAt(l)==s3.charAt(r)){
                l++;
                r--;
                continue;
            }
            else
             return false;
        }
        return true;
        
    }
}
