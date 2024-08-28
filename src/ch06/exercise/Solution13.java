package ch06.exercise;

public class Solution13 {
    public static void main(String[] args) {
        Member member1 = new Member();

        member1.setName("hong");
        System.out.println("member1.getName() = " + member1.getName());
    }
}

class Member {
    private String name;
    private String id;
    private String password;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}