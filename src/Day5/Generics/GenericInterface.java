package Day5.Generics;
// subtyping of Generic Types
interface Container<T>{
    void set(T a);
    T get();
}

class Store<T> implements Container<T>{
    private T a;

    public void set(T a){
        this.a =a;
    }
    public T get(){
        return a;
    }
}

public class GenericInterface {
    public static void main(String[] args){
        Container<Integer> store = new Store<>();
        store.set(13);
        System.out.println(store.get());
    }
}
