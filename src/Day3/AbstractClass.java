package Day3;

abstract class Abs{
    public int a =7;
    abstract void display();
}
class Base extends Abs {
    void display(){
        System.out.println(a);
    }
}

public class AbstractClass {

    public static void main(String[] args){
        Abs obj = new Base();
        obj.display();
    }
}
