import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.toString());
        Iterator<Integer> iterator= list.iterator();

        int idx=0;
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            if (idx == 0)


            iterator.remove();

            idx++;
        }


        System.out.println(list.toString());
//        Java 5
    }
}
