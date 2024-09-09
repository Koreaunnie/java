package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<Member> set = new HashSet<>();

        // Member 객체 저장
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30)); // 인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장

        // 저장된 객체 수 출력
        System.out.println("총 객체 수 : " + set.size());
    }
}

class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode 재정의
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // equals 재정의
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }
}