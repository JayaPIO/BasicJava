package Week3Day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListImplementaion {
    public static void main(String[] args){
//        Collection<Integer> list = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        //list.add(1,5);
        //list.ensureCapacity(10);
        System.out.println(list);

        list.remove(2); // index
        System.out.println(list);

        list.add(5);
        list.add(2);
        System.out.println(list);
        list.remove(2); //  object
        System.out.println(list);

        // searching in arrayList
        System.out.println(list.contains(2));
        System.out.println(list.indexOf(2));

        // set and get
        list.set(2,22);
        System.out.println(list);
        System.out.println(list.get(2));

        //
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(20);

        System.out.println(list);
        System.out.println(list2);

//        list.addAll(list2);
        System.out.println(list);

//        list2.removeAll(list);
        System.out.println(list2);

        list.retainAll(list2);
        System.out.println(list);

    }
}
