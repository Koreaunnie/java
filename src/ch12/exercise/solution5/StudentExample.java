package ch12.exercise.solution5;

import java.util.HashSet;
import java.util.Objects;

public class StudentExample {
    public static void main(String[] args) {
        // Student를 저장하는 HashSet 생성
        HashSet<Student> hashSet = new HashSet<Student>();

        // Student 저장
        hashSet.add(new Student("1"));
        hashSet.add(new Student("1")); // 같은 학번이므로 중복 저장이 안 됨
        hashSet.add(new Student("2"));

        // 저장된 Student 수 출력
        System.out.println("저장된 Student 수: " + hashSet.size());
    }
}

class Student {
    private String studentNum;

    public Student(String StudentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentNum);
    }
}