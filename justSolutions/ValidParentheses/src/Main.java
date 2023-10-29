import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String str = "{}([{}{}][])[{}]";

        System.out.println(solution.isValid(str));
    }
}

class Solution {
    public boolean isValid(String s)
    {
        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if(!stack.isEmpty() && stack.peek() == map.get(ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}

/*
TODO: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
 */
