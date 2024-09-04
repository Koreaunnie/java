package ch12.lecture.p01object;

public class C11ToString {
    public static void main(String[] args) {
        MyClass11 o = new MyClass11();
        System.out.println(o);
    }
}

class MyClass11 {
    private String name;
    private String email;
    private String address;

    @Override
    public String toString() {
        return "MyClass11{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
