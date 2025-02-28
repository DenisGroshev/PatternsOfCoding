package Regular;

public class Test {
    public static void main(String[] args) {
        /*
            \\d - одна цифра
            + - 1 or more
            * - 0 or more
            ? - 0 or 1 символов до

            ( | | |) - одна строка из множества строк


            [a-z]
         */

        String a="-4214";
        String b="4214";
        String c="+4214";

        System.out.println(a.matches("([-+])?\\d*"));
        System.out.println(b.matches("([-+])?\\d*"));
        System.out.println(c.matches("([-+])?\\d*"));

        String d="ddsadsad-2132131";

        System.out.println(d.matches("[a-zA-Z]+(\\+|-)?\\d+"));

        String e="Hello";
        String f="adsf";
        System.out.println(e.matches("[^abc]*"));
        System.out.println(f.matches("[^abc]*"));

        String url="http://www.google.com";
        String url1="http://www.yandex.ru";
        String url2="http://www.yanex.ua";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url1.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));


        String g="123";

        System.out.println(g.matches("\\d{2,}"));
        System.out.println(g.matches("\\d{2,4}"));
        System.out.println(g.matches("\\d{2}"));

        String hello="Hello";

        System.out.println(hello.matches(".*lo$"));
    }
}
