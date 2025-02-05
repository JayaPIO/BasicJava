package Day5.Wildcards;

import java.util.*;

public class WildcardExample {
    public static void main(String[] args){
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(25);
        System.out.println(sum(list));
        print(list);
    }

    // upper bound
    public static double sum(List<? extends Number> numbers){
        double sum=0;
        for (Number num :numbers){
            sum += num.doubleValue();
        }
        return sum;
    }

    // lower bound

    public static void print(List<? super Integer> list){

        for (Object ele: list){
            System.out.println(ele);
        }
    }
}
