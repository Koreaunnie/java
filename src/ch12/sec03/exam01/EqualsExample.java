package ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        System.out.println(System.identityHashCode(obj1));
        System.out.println(System.identityHashCode(obj2));
        System.out.println(System.identityHashCode(obj3));

        if (obj1.equals(obj2)) {
            System.out.println("obj1과 obj2는 동등합니다.");
        } else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }

        if (obj1.equals(obj3)) {
            System.out.println("obj1과 obj3는 동등합니다.");
        } else {
            System.out.println("obj1과 obj3는 동등하지 않습니다.");
        }
    }
}

class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            if (id.equals(target.id)) {
                return true;
            }
        }
        return false;
    }
}