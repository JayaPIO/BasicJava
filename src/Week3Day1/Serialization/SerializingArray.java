package Week3Day1.Serialization;

import java.io.*;

public class SerializingArray {
    public static void main(String args[]){
        User[] users = {
                new User("abc","123"),
                new User("mon","456"),
                new User("aa","00"),
        };

        try {
            FileOutputStream fos = new FileOutputStream("userDetails.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(users);

            System.out.println("sucess");
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
