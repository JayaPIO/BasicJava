package Day5.ReadFile;
import java.io.*;
import java.io.BufferedReader;

public class FileReaderEx {
    public static void main(String[] args){
        try{
            FileReader fr =
                    new FileReader("C:\\Users\\JayaGokhlani\\IdeaProjects\\Java Basics\\src\\student.csv");
            BufferedReader bf = new BufferedReader(fr);

            String line = null;

            while((line=bf.readLine()) != null){
                String[] stuDetails = line.split(",");

                // id, name
                int id = Integer.parseInt(stuDetails[0]);
                String name = stuDetails[1];

                System.out.println("id: "+id);
                System.out.println("name: "+name);

            }
            fr.close();
            bf.close();

        }
        catch(IOException exp){
            exp.printStackTrace();
        }
    }
}
