// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

class Solution {
    public boolean isValid(String s) {

        int top=-1;
        char[] stack=new char[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['||s.charAt(i)=='('||s.charAt(i)=='{'){
                stack[++top]=s.charAt(i);
            }
            else if(top!=-1){
             if(s.charAt(i)==']') {
                if(stack[top]=='['){
                    top--;
                }
                else{
                    return false;
                }
             }
             else if(s.charAt(i)=='}') {
                if(stack[top]=='{'){
                    top--;
                }
                else{
                    return false;
                }
             }
            else if(s.charAt(i)==')') {
                if(stack[top]=='('){
                    top--;
                }
                else{
                    return false;
                }
             }
            }
            else{
                return false;
            }
        } 
       if(top==-1){
        return true;
       } 
       return false; 
    }
}
