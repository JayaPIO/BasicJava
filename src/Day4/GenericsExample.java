package Day4;

import java.util.*;

public class GenericsExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("abc");
        int a = (Integer)list.get(0);
        String b =(String)list.get(1);
        System.out.println(a);
        System.out.println(b);
    }


}
