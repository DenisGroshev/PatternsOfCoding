package Regular;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String a="Hello213213there21321hey213123";
        String [] words=a.split("\\d+");

        System.out.println(Arrays.toString(words));


        String b="Hello21321312there213213hey";
        String devides=b.replaceAll("\\d+", " ");
        System.out.println(devides);
        String devides2=b.replaceFirst("\\d+", " ");
        System.out.println(devides2);
    }
}
