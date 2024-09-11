package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        // TreeSet 컬렉션 생성
        TreeSet<Person> treeSet = new TreeSet<Person>();

        // 객체 저장
        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("김자바", 25));
        treeSet.add(new Person("박지원", 31));

        // 객체를 하나씩 가져오기
        for (Person person : treeSet) {
            System.out.println(person.name + ": " + person.age);
        }
    }
}

class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (age < o.age) return -1;
        else if (age == o.age) return 0;
        else return 1;
    }
}