package ch17.lecture.p3intermediate;

import java.util.Comparator;
import java.util.List;

public class C07Sorted {
    public static void main(String[] args) {
        List<Book> list = List.of(
                new Book("java", 500),
                new Book("git", 300),
                new Book("html", 700),
                new Book("python", 600),
                new Book("sql", 400)
        );

        System.out.println("- 가격 순 - ");
        list.stream()
                .sorted((b1, b2) -> b1.getPrice() - b2.getPrice())
                .forEach(System.out::println);

        System.out.println("- 가격 순 - ");
        list.stream()
                .sorted(Comparator.comparingInt(Book::getPrice))
                .forEach(System.out::println);

        System.out.println("- 제목 순 -");
        list.stream()
                .sorted((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()))
                .forEach(System.out::println);

        System.out.println("- 제목 순 -");
        list.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .forEach(System.out::println);
    }
}

class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}