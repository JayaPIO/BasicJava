package FileOperationsAssignment;

import java.io.*;

public class writeFile {
    public static void main(String[] args){
        try{
            FileReader sourceFr = new FileReader("C:\\Users\\JayaGokhlani\\IdeaProjects\\Java Basics\\src\\FileOperationsAssignment\\sourceFile");
            BufferedReader sourceBr = new BufferedReader(sourceFr);

            FileWriter destFw = new FileWriter("C:\\Users\\JayaGokhlani\\IdeaProjects\\Java Basics\\src\\FileOperationsAssignment\\Destination");
            BufferedWriter destBr = new BufferedWriter(destFw);
            String line = null;
            while ((line = sourceBr.readLine()) != null){
                destBr.write(line + "\n");
            }
            System.out.println("sucessfully performed write operation");

            sourceBr.close();

            destBr.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
