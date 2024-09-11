package leetcode.p844;

import java.util.Stack;

public class Solution {
    // 844. Backspace String Compare
    public boolean backspaceCompare(String s, String t) {
        // 두 개의 스택 만들고
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        // s의 각 문자를 스택에 push(#이면 pop)
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }

        // t의 각 문자를 스택에 push(#이면 pop)
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }

        // 두 스택의 내용물이 같은 지 확인
        if (stack1.size() != stack2.size()) {
            return false;
        }

        // 다르면 return false
        while (!stack1.isEmpty()) {
            Character c1 = stack1.pop();
            Character c2 = stack2.pop();

            if (!c1.equals(c2)) {
                return false;
            }
        }

        // 같으면 return true
        return true;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        String s = "ab#c";
        String t = "ad#c";

        System.out.println(test.backspaceCompare(s, t));
    }
}
