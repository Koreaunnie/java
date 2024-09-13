package ch17.exercise.solution08;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> map1 = new HashMap<>();
        // 고전적 방법
        for (Member m : list) {
            String job = m.getJob();
            if (map1.containsKey(job)) {
                List<Member> members = map1.get(job);
                members.add(m);
            } else {
                List<Member> members = new ArrayList<>();
                map1.put(job, members);
                members.add(m);
            }
        }
        System.out.println(map1);

        System.out.println();

        // stream
        Map<String, List<Member>> map2 = list.stream()
                .collect(Collectors.groupingBy(Member::getJob));
        System.out.println(map2);
    }
}

class Member {
    private String name;
    private String job;

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}