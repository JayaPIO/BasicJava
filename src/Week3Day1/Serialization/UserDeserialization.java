package Week3Day1.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserDeserialization {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("userDetails.txt"); ObjectInputStream ois = new ObjectInputStream(fis)){
            User userdetail = (User) ois.readObject();
            userdetail.display();
            userdetail.displayPassword();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
