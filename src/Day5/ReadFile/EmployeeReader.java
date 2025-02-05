package Day5.ReadFile;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EmployeeReader {
    public static void main(String[] args){
        try{
            File file = new File("emp.csv");
            file.createNewFile();
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();

                String[] details = line.split(",");
                // id,name,department
                int id = Integer.parseInt(details[0]);
                String name = details[1];
                String department = details[2];

                System.out.println("id: "+id);
                System.out.println("Name: "+ name);
                System.out.println("department: "+ department);

            }
            sc.close();
        }catch (IOException e){
             e.printStackTrace();
        }



    }
}
