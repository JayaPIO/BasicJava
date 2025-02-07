package Assignment2.serialization;

import Week3Day1.Serialization.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args){
        try (FileInputStream fis = new FileInputStream("C:\\Users\\JayaGokhlani\\IdeaProjects\\Java Basics\\src\\Assignment2\\serialization\\user.txt"); ObjectInputStream ois = new ObjectInputStream(fis)){
            UserClass user = (UserClass) ois.readObject();
            System.out.println(user.getUserName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
