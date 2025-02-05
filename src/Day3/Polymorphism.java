package Day3;
// compile time polymorphism
class Example{
    public int mul(int a, int b){
        return a*b;
    }
    public double mul(double c, double d){
        return c*d;
    }
}
// run time polymorphism
class Derived extends Example {
    public int mul(int a, int b){
        System.out.println("in derived class");
        return a+b;

    }
}
public class Polymorphism {
    public static void main(String[] args){
        Example ex = new Example();
        int ans1 = ex.mul(2,3);
        double ans2 = ex.mul(3.4,1.2);
        System.out.println(ans1 +" " +ans2);

        ex = new Derived();
        int res = ex.mul(2,3);
        System.out.println(res);
    }
}
