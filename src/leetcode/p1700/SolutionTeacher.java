package leetcode.p1700;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionTeacher {
    public int countStudents(int[] num1, int[] num2) {

        Queue<Integer> students = new LinkedList<>();
        Queue<Integer> sandwiches = new LinkedList<>();

        for (int n : num1) {
            students.offer(n);
        }
        for (int n : num2) {
            sandwiches.offer(n);
        }

        int notEat = 0;

        while (!students.isEmpty()) {
            Integer student1 = students.peek();
            Integer sandwich1 = sandwiches.peek();

            if (student1.equals(sandwich1)) {
                students.poll();
                sandwiches.poll();
                notEat = 0;
            } else {
                student1 = students.poll();
                students.offer(student1);

                notEat++;
            }

            if (notEat == students.size()) {
                return students.size();
            }
        }

        return 0;
    }
}
