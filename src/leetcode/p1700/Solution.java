package leetcode.p1700;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    // 1700. Number of Students Unable to Eat Lunch
    public int countStudents(int[] num1, int[] num2) {
        Queue<Integer> students = new LinkedList<>();
        Queue<Integer> sandwiches = new LinkedList<>();

        for (int n : num1) {
            students.offer(n);
        }
        for (int n : num2) {
            sandwiches.offer(n);
        }

        int count = 0;  // 무한 루프 방지를 위한 카운트

        // 큐가 비어 있지 않으면 반복
        while (!students.isEmpty() && count < students.size()) {
            if (students.peek() == sandwiches.peek()) {
                // 학생과 샌드위치가 일치하면 둘 다 제거
                students.poll();
                sandwiches.poll();
                count = 0; // 샌드위치가 일치하면 카운트를 초기화
            } else {
                // 일치하지 않으면 학생을 큐의 뒤로 이동
                students.offer(students.poll());
                count++;  // 일치하지 않을 때마다 카운트 증가
            }
        }
        return students.size();
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};

        System.out.println(test.countStudents(students, sandwiches));
    }
}
