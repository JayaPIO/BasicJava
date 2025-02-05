package Day5.Generics;
 class Pair<K,V>{
    private K key;
    private V value;

    Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}
public class MultipleGenerics {
    public static void main(String[] args){
        Pair<Integer,String> pair = new Pair<>(1,"hello");
        System.out.print(pair.getKey() + " ");;
        System.out.println(pair.getValue());


    }
}
