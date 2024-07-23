package easy;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        LocalDateTime l = LocalDateTime.now();
        String s = "(])";

        System.out.println(isValid(s));
        LocalDateTime l2 = LocalDateTime.now();
        l2.minusNanos(l.getNano());
    }

    private static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        char[] c = s.toCharArray();

        stack.push(c[0]);

        for (int i = 1; i < c.length; i++) {

            switch (c[i]) {

                case '(':
                    stack.push(c[i]);
                    break;

                case ')':
                    if (!stack.empty() && stack.peek().equals('(')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;

                case '[':
                    stack.push(c[i]);
                    break;

                case ']':
                    if (!stack.empty() && stack.peek().equals('[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;

                case '{':
                    stack.push(c[i]);
                    break;

                case '}':
                    if (!stack.empty() && stack.peek().equals('{')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return stack.size() == 0;
    }

}
