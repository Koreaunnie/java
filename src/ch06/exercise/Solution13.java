package ch06.exercise;

public class Solution13 {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member();
        member1.name("hong");
    }
}

class Member {
    public void name(String name) {
        System.out.println(name);
    }

    public void id(String id) {
        System.out.println(id);
    }

    public void password(String password) {
        System.out.println(password);
    }

    public void age(int age) {
        System.out.println(age);
    }
}