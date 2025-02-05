import java.util.Scanner;
import java.util.regex.*;


  class SimpleInheritance{

      class TwoSum{
          protected int a;
          protected int b;

        TwoSum(int a, int b) {
            this.a = a;
            this.b = b;
        }

          public void sum(){
            System.out.println(a+b);
        }

    }

    class Sum extends TwoSum{
           private int c;



           Sum(int a, int b,int c){
               super(a,b);
               this.c = c;
           }
           public void sum3(){

               System.out.println(a+b+c);
           }
    }
}
class MultiLevelInheritance{
      class TwoMultiple{
          protected int num1;
          protected int num2;

          TwoMultiple(int num1, int num2){
              this.num1 = num1;
              this.num2 = num2;
          }

          public int mul(){
              return num1*num2;
          }

      }
      class ThreeMultiple extends TwoMultiple{
          protected int num3;

           int m2;

          ThreeMultiple(int num1, int num2,int num3) {
              super(num1, num2);
              m2=super.mul();
              this.num3 = num3;
          }



          public int mul3(){
               return m2*num3;
           }

      }
      class FourMultiple extends  ThreeMultiple{
          protected int num4;
          int mul3Res;
          FourMultiple(int num1, int num2, int num3, int num4){
              super(num1,num2, num3);
              this.num4 =num4;
              mul3Res = super.mul3();
          }

          public int mul4(){
              return mul3Res*num4;
          }
      }
}

     interface Bank {
        enum BankNames{
            SBI,
            BOB,

        }
        int rateOfInterest();
    }
    interface BankCode{
      int code();
    }

    class Sbi implements Bank {
        public int rateOfInterest() {
            System.out.println(BankNames.SBI);
            return 10;
        }
    }


    class Bob implements Bank,BankCode{
        public int rateOfInterest() {
            return 12;
        }
        public int code(){
            return 123;
        }
    }

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
  class Derived extends Example{
      public int mul(int a, int b){
          System.out.println("in derived class");
          return a+b;

      }
  }

  // encapsulation
class Student{

      private int id;

      public void setId(int id) {
          this.id = id;
      }
      public int getId(){
          return id;
      }
  }

  // Abstract class
abstract class Abs{
      public int a =7;
      abstract void display();
  }
  class Base extends Abs{
       void display(){
           System.out.println(a);
      }
  }

public class Day3 {
    public static void main(String[] args){
        // regex
        /*Create a regular expression that accepts alphanumeric characters only.
           Its length must be six characters long only.*/
        String str = "9999999999";
        System.out.println(Pattern.matches("[A-Za-z0-9]{6}",str));

        /*Create a regular expression that accepts 10 digit numeric characters
         starting with 7, 8 or 9 only.*/
        System.out.println(Pattern.matches("[7,8,9]{1,10}\\d{9}{10}",str));



        if (str.matches("[A-Za-z0-9]{6}")){
            System.out.println("validated successfully");
        }
        else{
            System.out.println("not validated");
        }


//        SimpleInheritance obj = new SimpleInheritance();
//        SimpleInheritance.TwoSum obj2 = obj.new TwoSum(3,2);
//        obj2.sum();
//        SimpleInheritance.Sum obj3=  obj.new Sum(3,2,2);
//        obj3.sum3();


        MultiLevelInheritance objM2 = new MultiLevelInheritance();
        MultiLevelInheritance.FourMultiple objM = objM2.new FourMultiple(2,2,2,2);
        int ans =  objM.mul4();
        System.out.println(ans);

//        Bank b = new Sbi();
//
//        int roi = b.rateOfInterest();
//        System.out.println(roi);
//
//         multiple inheritance
//
//        Bob bob = new Bob();
//        int roi = bob.rateOfInterest();
//        int c = bob.code();
//        System.out.println(roi+" " + c);

        // polymorphism
//        Example ex = new Example();
//        int ans1 = ex.mul(2,3);
//        double ans2 = ex.mul(3.4,1.2);
//        System.out.println(ans1 +" " +ans2);
//
//        ex = new Derived();
//        int res = ex.mul(2,3);
//        System.out.println(res);


        // encapsulation
//        Student st = new Student();
//        st.setId(101);
//        System.out.println(st.getId());


        // abstract class
//        Abs obj = new Base();
//        obj.display();
    }
}
