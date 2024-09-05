package ch13.exercise.solution2;

import ch04.sec08.ContinueExample;

import java.awt.*;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.getItem();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.getItem();
    }
}

class Container<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void set(T item) {
        this.item = item;
    }
}

