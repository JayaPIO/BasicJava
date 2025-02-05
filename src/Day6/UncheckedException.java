package Day6;

public class UncheckedException {
    public static void main(String[] args){

        divide(10,0);
    }
    public static void divide(int a, int b){
        try{
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception: divide by 0");
        }
    }
}
