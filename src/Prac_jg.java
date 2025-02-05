import java.util.*;

public class Prac_jg {
    public static class Example{

        protected int a;
        protected int b;
        private int value;
        // constructor
        Example(int a,int b){
            this.a =a;
            this.b = b;
        }
        //setter
        public void setValue(int val){
            this.value = val;
        }
        // getter
        public int getValue(){
            return value;
        }
        public void sum(){
            System.out.println(a+b);
        }
        public void diff(){
            System.out.println(a-b);
        }

    }
    public static class Example2 extends Example{
        private int c;

        Example2(int a, int b, int c){
            super(a,b);
            this.c =c;
        }

        public void mul(){
            System.out.println(a*b*c);
        }

    }
    public static void main(String args[]) {
        // String builder
//        StringBuilder sb = new StringBuilder("Initial string");
//        System.out.println(sb);
//
//        // append
//        sb.append(" append");
//        System.out.println(sb);
//
//        //insert
//        sb.insert(7," insert");
//        System.out.println(sb);
//
//        //replace
//        sb.replace(0,7,"Replace");
//        System.out.println(sb);
//
//        //delete
//        sb.delete(8,15);
//        System.out.println(sb);
//
//        // reverse
//        sb.reverse();
//        System.out.println(sb);
//
//        sb.reverse();
//
//        //capacity
//        int cap = sb.capacity();
//        System.out.println(cap);
//
//        // length
//        int len = sb.length();
//        System.out.println(len);
//
//        // char at
//        char ch =sb.charAt(2);
//        System.out.println(ch);
//
//        // substring
//        String sub_str = sb.substring(3,6);
//        System.out.println(sub_str);
//
//        //set char at
//        sb.setCharAt(0,'P');
//        System.out.println(sb);
//
//        // index of
//        int idx = sb.indexOf("string");
//        System.out.println(idx);
//
//        // last index of
//        int idx1 = sb.lastIndexOf("a");
//        System.out.println(idx1);
//
//        String str = sb.toString();
//        System.out.println(str);

//        StringBuffer sf = new StringBuffer("Initial String");
//
//        //append
//        sf.append(" appended");
//        System.out.println(sf);
//
//        // insert
//        sf.insert(4," insert ");
//        System.out.println(sf);
//
//        // replace
//        sf.replace(0,1,"rep");
//        System.out.println(sf);

        // string format
//        String str = "PIO";
//
//        String sf= String.format("Welcome to %s", str);
//        System.out.println(sf);


        // classes and object
        Example ex1 = new Example(2,3);

        ex1.sum();
        ex1.diff();

        Example2 ex2 = new Example2(2,3,2);
        ex2.mul();

       // setter and getter
        ex1.setValue(15);
        int res = ex1.getValue();
        System.out.println(res);
    }

}
