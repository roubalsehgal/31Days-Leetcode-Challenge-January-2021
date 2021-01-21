class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' || s.charAt(i)==']' ||  s.charAt(i)=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    if(!isMatch(stack.pop(), s.charAt(i))){
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else
            return false;
    }
    
    private static boolean isMatch(char ch1, char ch2){
        if(ch1=='(' && ch2==')'){
            return true;
        }
        else if(ch1=='[' && ch2==']'){
            return true;
        }
        else if(ch1=='{' && ch2=='}'){
            return true;
        }
        else{
            return false;
        }
        
    }
}
