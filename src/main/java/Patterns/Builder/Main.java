package Patterns.Builder;

public class Main {
    public static void main(String[] args) {
        BookClass Golding=BookClass.builder()
                .title("Lord of the Flies")
                .countOfPages(320)
                .year(1954)
                .number(152032)
                .build();
        System.out.println(Golding.getCountOfPages());
        System.out.println(Golding.getTitle());
        System.out.println(Golding.getYear());
    }
}
