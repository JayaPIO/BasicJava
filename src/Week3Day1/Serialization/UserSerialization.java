package Week3Day1.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserSerialization {
    public static void main(String[] args){
        User user = new User("jaya","abc123");

        try (FileOutputStream fos = new FileOutputStream("userDetails.txt"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(user);

            System.out.println("object serialized sucessfully");
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }
}
