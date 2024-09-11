package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("홍길동", 20),
                new Student("홍길동", 30)
        );

        /*
        // 방법 1
        Stream<Student> studentStream = list.stream();
        // 중간 처리 (학생 객체를 점수로 매핑)
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        // 최종 처리 (평균 점수)
        double avg = scoreStream.average().getAsDouble();
        */

        // 방법 2
        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println("평균 점수 : " + avg);
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
