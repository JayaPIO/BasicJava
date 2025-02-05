package Day2.task;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      // Hello world program
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);
      // datatypes in java
        int dt_int = sc.nextInt();
        float dt_float = sc.nextFloat();
        double dt_double = sc.nextDouble();
       // String dt_str = sc.nextLine();
        long dt_long = sc.nextLong();
        short dt_short = sc.nextShort();
        boolean dt_bool = sc.nextBoolean();
        byte dt_byte = sc.nextByte();

        System.out.println(dt_int);
        System.out.println(dt_float);
        System.out.println(dt_double);
        System.out.println(dt_long);
        System.out.println(dt_short);
        System.out.println(dt_bool);
        System.out.println(dt_byte);

      // while loop -- Factorial of i
        int i =10;
        int fact =1;
        while(i>0){
            fact *= i;
            i--;
        }
        System.out.println(fact);

     // for loops
     for(int n =1; n<=10; n++){
         int num = n*5;
         System.out.println(num);
     }

     // if statement
        int age1 = 21;
     // user input

        int age = sc.nextInt();
        if(age>18){
            System.out.println("Eligible for voting");
        }
        else if(age<18){

        }
        else{
            System.out.println("not eligible for voting");
        }

        // do while loop  input positive integer from user until negative integer is provided
        int input_num = 0;
        do{
            System.out.println("enter a positive integer");
             input_num = sc.nextInt();
            System.out.println(input_num);
        }while(input_num>0);

        // switch case
        System.out.println("enter integer between 1 and 7");
        int day_num = sc.nextInt();
        switch(day_num){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thrusday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter valid integer");
        }

        // Arrays sum of array element
        System.out.println("enter size of array");
        int size = sc.nextInt();
        System.out.println("enter"+size+ " array elements");
        int[] arr = new int[size];
        for (int j = 0; j < size; j++) {
            arr[j] = sc.nextInt();
        }
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j]+" ");
            System.out.println();
        }
        // calculating and printing sum of array
        int sum_of_array = 0;
        for (int j = 0; j < size; j++) {
            sum_of_array += arr[j];
        }
        System.out.println(sum_of_array);

        // Array of string
        sc.nextLine();
        String[] str_array = new String[3];
        for (int j = 0; j < 3; j++) {
            //Scanner scanner = new Scanner(System.in);
            System.out.println("enter string ");
            str_array[j] = sc.nextLine();
        }
        for (int j = 0; j < 3; j++) {
            System.out.println(str_array[j]+" ");
        }

        // to string method
        String string = Arrays.toString(str_array);
        System.out.println(string);

        // String builder
        StringBuilder str_builder = new StringBuilder("hello");
        str_builder.append(" world!");
        System.out.println(str_builder);
    }
}