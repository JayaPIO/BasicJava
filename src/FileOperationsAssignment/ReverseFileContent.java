package FileOperationsAssignment;

import java.io.*;
import java.util.Scanner;

public class ReverseFileContent extends Exception {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\JayaGokhlani\\IdeaProjects\\Java Basics\\src\\FileOperationsAssignment\\SourceFile");
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\JayaGokhlani\\IdeaProjects\\Java Basics\\src\\FileOperationsAssignment\\ReverseFile"));

            StringBuilder sb = new StringBuilder();
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                sb.append(line + '\n');
                sb.reverse();

                bw.write(sb.toString() + "\n");
            }

            sc.close();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
