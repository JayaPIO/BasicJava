package Assignment2.recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class Recursion {
    public static BigInteger factorial(int num){

        if(num<0){
            throw new IllegalArgumentException();
        }
        if(num==0 ||num==1){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(num).multiply(factorial(num-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        try {
            System.out.println(factorial(num));
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
    }
}
