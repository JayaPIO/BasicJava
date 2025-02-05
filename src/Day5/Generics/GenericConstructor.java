package Day5.Generics;

public class GenericConstructor {

    <T> GenericConstructor(T value){
        System.out.println("value: "+ value);
        System.out.println("Type: " + value.getClass().getName());
    }

    public static void main(String[] args){
        GenericConstructor obj = new GenericConstructor(25);
        GenericConstructor obj2 = new GenericConstructor("Hello");
    }
}
