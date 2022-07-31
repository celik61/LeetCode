import java.util.Stack;

public class LeetCode20 {
    //https://leetcode.com/problems/valid-parentheses/
    public boolean isValid(String s) {

        Stack<Character> stack= new Stack();

        for(int i=0; i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
            }else if(!stack.isEmpty() && s.charAt(i)==']' && stack.peek()=='['){
                stack.pop();
            }else if(!stack.isEmpty() && s.charAt(i)=='}' && stack.peek()=='{'){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

}
