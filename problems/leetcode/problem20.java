// CREDIT : Pratik-Shrivastava || https://leetcode.com/problems/valid-parentheses/solutions/2986468/simple-java-beats-100-runtime-easy-to-understand/
import java.util.Stack;

public class problem20{
    public static void main(String[] args){
        System.out.println(isValid("()[]{}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (char ch: s.toCharArray()){
            switch(ch){
                case '(':
                case '[':
                case '{':
                stack.push(ch);
                break;
                case ')':
                // THE pop operation delete the top elements from the array and returns it to you
                if (stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
                break;
                case ']':
                if (stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
                break;
                case '}':
                if (stack.isEmpty() || stack.pop() != '{'){
                    return false;
                }
                break;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}