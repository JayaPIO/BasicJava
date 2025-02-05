package Week3Day3;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapImplement {

    public static void main(String[] args){
        TreeMap<String,Integer> map =new TreeMap<>();

        map.put("D",101);
        map.put("E",102);
        map.put("A",103);
        map.put("C",104);
        map.put("B",105);

        System.out.println(map);

        for (Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
        System.out.println();

        //submap
        SortedMap<String,Integer> subMap = map.subMap("A","D");
        for (Map.Entry<String,Integer> entry: subMap.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
        System.out.println();

        // tailmap
        SortedMap<String ,Integer> tailmap = map.tailMap("D");
        for (Map.Entry<String,Integer> entry: tailmap.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
        System.out.println();

        // headMap
        SortedMap<String , Integer> headmap = map.headMap("C");
        for (Map.Entry<String,Integer> entry: headmap.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
        System.out.println();

    }
}
