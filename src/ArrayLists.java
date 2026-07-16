import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add element in the last by default
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(1);
        System.out.println(list);

        //get / retrieve el from list
        int el = list.get(0);
        System.out.println(el);

        //add el in between
        list.add(3,5);
        System.out.println(list);

        //set/modify/update el in list
        list.set(1,10);
        System.out.println(list);

        //delete el
        list.remove(0);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loops
        for (int i = 0; i<list.size(); i++)
            System.out.println(list.get(i));

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
