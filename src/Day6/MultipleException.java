package Day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

// bank application performs four functions - deposit, withdrawal, check balance, and account details
public class MultipleException {
    public static double balance = 100;
    public static void main(String[] args){
        try{
            deposite(100);
            withdraw(200);
            checkBalance();
            accountDetails();
            withdraw(200);

        }catch (InsufficientAmountException | InvalidAmountException e){
            System.out.println("Banking error: "+e.getMessage());
        }
        catch (FileNotFoundException e){
            System.out.println("Account file not found");
        }
        catch (IOException e){
            System.out.println("IO exception: "+e.getMessage());
        }


    }
    public static void deposite(int amount) throws InvalidAmountException{
        if(amount<=0){
            throw new InvalidAmountException("Invalid amount entered");
        }
        balance+=amount;
        System.out.println("amount added sucessfully");
    }
    public static void withdraw(int amount)  throws InvalidAmountException, InsufficientAmountException{
        if(amount<0){
            throw new InvalidAmountException("Invalid withdrawal amount ");
        }
        if(amount>balance){
            throw new InsufficientAmountException("Low balance");
        }
        balance -= amount;
        System.out.println("amount withdraw successfully");
    }

    public static void checkBalance(){
        System.out.println("Balance: "+balance);
    }

    public static void accountDetails() throws FileNotFoundException, IOException{
        String path = "C:\\Users\\JayaGokhlani\\IdeaProjects\\Java Basics\\src\\Day6\\Acounts.csv";
        Scanner sc = new Scanner(new File(path));
        while(sc.hasNextLine()){
            String[] str =sc.nextLine().split(",");

            System.out.print("Account No.: "+str[0]+" ");
            System.out.print("Account Holder: "+str[1]);
            System.out.println();
        }
        sc.close();
    }

    //custom exception
    static class InsufficientAmountException extends Exception{
        public InsufficientAmountException(String msg){
            super(msg);
        }
    }

    static class InvalidAmountException extends Exception{
        public InvalidAmountException(String msg){
            super(msg);
        }
    }



}
