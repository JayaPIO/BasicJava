package FileOperationsAssignment;

import java.io.*;

public class AppendText {
    public static void main(String[] args){
        String path = "C:\\Users\\JayaGokhlani\\IdeaProjects\\Java Basics\\src\\FileOperationsAssignment\\sourceFile";
        String pathWrite = "C:\\Users\\JayaGokhlani\\IdeaProjects\\Java Basics\\src\\FileOperationsAssignment\\Append.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            BufferedWriter bw = new BufferedWriter(new FileWriter(pathWrite,true));
            String line="";
            while ((line = br.readLine())!=null){
                bw.write(line+"\n");
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
