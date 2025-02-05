package Week3Day1.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializingArray {
    public static void main(String[] args){
        User[] users = null;
        try {
            FileInputStream fis = new FileInputStream("userDetails.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

             users = (User[]) ois.readObject();


        }  catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("sucessful");
        for(User user:users){
            user.display();
            user.displayPassword();
//            user.displayAge();
        }
    }
}
