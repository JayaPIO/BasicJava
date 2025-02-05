package Week3Day2;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorOnArrayList {
    public static void main(String[] args){
        ArrayList<Integer>  list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            int element = iterator.next();
            System.out.println("element: "+ element);
            if (element ==3){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
