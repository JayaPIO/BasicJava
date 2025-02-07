package Assignment2.serialization;

import java.io.Serializable;

public class UserClass implements Serializable {
    private static final long serialVersionUID=1221;
    int rollNo;
    String userName;
    String password;

    UserClass(int rollNo, String userName, String password){
        this.rollNo = rollNo;
        this.userName = userName;
        this.password = password;
    }

    public int getRollNo(){
        return rollNo;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
}
