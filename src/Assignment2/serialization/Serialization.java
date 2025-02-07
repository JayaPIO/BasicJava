package Assignment2.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args){
        UserClass user = new UserClass(101,"Jane","12345");
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\JayaGokhlani\\IdeaProjects\\Java Basics\\src\\Assignment2\\serialization\\user.txt"); ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(user);
            System.out.println("user serialized");
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
