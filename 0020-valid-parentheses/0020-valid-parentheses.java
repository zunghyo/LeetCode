import java.util.*;

class Solution {
    public boolean isValid(String s) {
        boolean result = false;
        Stack<Character> stack = new Stack<>();
        
        int i = 0;
        while(i < s.length()) {
            Character current = s.charAt(i);
            
            if(!stack.isEmpty() && stack.peek()=='(' && current==')') {
                stack.pop();
            } else if(!stack.isEmpty() && stack.peek()=='{' && current=='}') {
                stack.pop();
            } else if(!stack.isEmpty() && stack.peek()=='[' && current==']') {
                stack.pop();
            } else {
                stack.push(current);
            }
            i++;
        }
        if(stack.isEmpty()) result = true;
        
        return result;
    }
}