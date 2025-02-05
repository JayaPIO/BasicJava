package Day3;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args){
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
    }
}
