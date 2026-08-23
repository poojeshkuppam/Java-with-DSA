import java.util.*;

class Solution {
    public int calculate(String s) {

        Stack<Integer> stack = new Stack<>();

        int result = 0;
        int num = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {

                num = num * 10 + (c - '0');
            }

            else if (c == '+') {

                result += sign * num;

                num = 0;
                sign = 1;
            }

            else if (c == '-') {

                result += sign * num;

                num = 0;
                sign = -1;
            }

            else if (c == '(') {

                stack.push(result);

                stack.push(sign);

                result = 0;
                sign = 1;
            }

            else if (c == ')') {

                result += sign * num;

                num = 0;

                int previousSign = stack.pop();

                int previousResult = stack.pop();

                result = previousResult + previousSign * result;
            }

        }

        result += sign * num;

        return result;
    }
}