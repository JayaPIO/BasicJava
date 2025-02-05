package Week3Day1.Serialization;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    transient private String password;
    static int age = 21;

    User(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    public void display() {
        System.out.println(this.userName);
    }

    public void displayPassword() {
        System.out.println(this.password);
    }

    public void displayAge() {
        System.out.println(age);
    }
}
