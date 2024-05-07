import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        // boolean v1 = new ValidParentheses().isValid("()");
        // System.out.println(v1);

        // boolean v2 = new ValidParentheses().isValid("()[]{}");
        // System.out.println(v2);

        // boolean v3 = new ValidParentheses().isValid("(]");
        // System.out.println(v3);

        // boolean v4 = new ValidParentheses().isValid("([)]");
        // System.out.println(v4);

        // boolean v5 = new ValidParentheses().isValid("[");
        // System.out.println(v5);

        // boolean v6 = new ValidParentheses().isValid("((");
        // System.out.println(v6);

        boolean v7 = new ValidParentheses().isValid("){");
        System.out.println(v7);
        
    }

    public boolean isValid(String s) {
        if(s.length()<=1) {
            return false;
        }
        Deque<Character> list = new LinkedList<Character>();
        char[] chars = s.toCharArray();
        int count = 0;
        for(int i=0; i<chars.length; i++) {
            if(chars[i] == '{') {
                count+=1;
                list.addFirst('}');
            } else if(chars[i] == '(') {
                count+=1;
                list.addFirst(')');
            } else if(chars[i] == '[') {
                count+=1;
                list.addFirst(']');
            } else if(chars[i] == '}') {
                if(list.peekFirst() == null) {
                    return false;
                } else if(list.peekFirst() == '}') {
                    count-=1;
                    list.pop();
                } else {
                    return false;
                }
            } else if(chars[i] == ']') {
                if(list.peekFirst() == null) {
                    return false;
                } else if(list.peekFirst() == ']') {
                    count-=1;
                    list.pop();
                } else {
                    return false;
                }
            } else if(chars[i] == ')') {
                if(list.peekFirst() == null) {
                    return false;
                } else if(list.peekFirst() == ')') {
                    count-=1;
                    list.pop();
                } else {
                    return false;
                }
            }
        }
        return true && count == 0;
    }
}
