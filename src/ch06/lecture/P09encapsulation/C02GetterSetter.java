package ch06.lecture.P09encapsulation;

public class C02GetterSetter {
    public static void main(String[] args) {

    }
}

// 관습상, 필드는 특별한 이유가 없다면 private으로
// 필드값 변경(setter) / 읽기(getter) 메소드를 public으로 작성

class MyClass02 {
    private int age;
    private String name;
    private String email;
    private String address;
    private boolean married;
    private boolean enabled;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    // boolean의 getter 메소드는 is로 시작
    public boolean isMarried() {
        return married;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
