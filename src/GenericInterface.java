interface Container<T>{
    void add(T item);
    T get();
}
class GenericContainer implements Container<String>{
    private String item;
    public void add(String item){
        this.item = item;
    }
    public String get(){
        return item;
    }

}
public class GenericInterface {
    public static  void main(String[] args){

    }
}
