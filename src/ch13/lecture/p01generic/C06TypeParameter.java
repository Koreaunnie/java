package ch13.lecture.p01generic;

public class C06TypeParameter {
    public static void main(String[] args) {
        MyClass6<String, Integer> box1 = new MyClass6<>();
        var box2 = new MyClass6<Double, Long>();

        box1.setItem1("java");
        box1.setItem2(500);

        box2.setItem1(3.14);
        box2.setItem2(999L);

        String item1 = box1.getItem1();
        Integer item2 = box1.getItem2();

        Double item3 = box2.getItem1();
        Long item4 = box2.getItem2();

    }
}

class MyClass6<T, U> {
    private T item1;
    private U item2;

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public U getItem2() {
        return item2;
    }

    public void setItem2(U item2) {
        this.item2 = item2;
    }
}