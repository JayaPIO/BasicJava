package FileOperationsAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PrintLongestWord {
    public static void main(String[] args){
        try {
            String path = "C:\\Users\\JayaGokhlani\\IdeaProjects\\Java Basics\\src\\FileOperationsAssignment\\Destination";

            Scanner sc = new Scanner(new File(path));
            int maxlen = 0;
            String longestWord = "";
            while (sc.hasNext()) {

                String word = sc.next();
                int length = word.length();
                if (length > maxlen) {
                    maxlen = length;
                    longestWord = word;
                }
            }
            System.out.println();
            System.out.println(longestWord);
            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
