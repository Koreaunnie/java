package ch13.sec03.exam01;

public class GenericExample {
    // 제네릭 메소드
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        // 제네릭 메소드 호출
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        // 제네릭 메소드 호출
        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);

    }
}


class Box<T> {
    // 필드
    private T t;

    // Getter 메소드
    public T get() {
        return t;
    }

    // Setter 메소드
    public void set(T t) {
        this.t = t;
    }
}