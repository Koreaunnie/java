package ch12.exercise.solution12;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2); // true
        System.out.println(obj3.equals(obj4)); // true
    }
}
