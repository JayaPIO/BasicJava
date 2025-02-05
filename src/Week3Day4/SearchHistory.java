package Week3Day4;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SearchHistory {
    public static void main(String[] args){
        LinkedHashSet<String> search = new LinkedHashSet<>();

        while (true) {
            System.out.println("enter query or exit ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            if(input.equals("exit")){
                break;
            }
            else{
                search.add(input);
            }
        }

        System.out.println(search);

    }
}
