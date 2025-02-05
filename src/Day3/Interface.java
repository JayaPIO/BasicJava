package Day3;

interface Bank {
    int rateOfInterest();
    default void displayBalance(){
        System.out.println("Balance : 0");
    }

}
interface BankCode{
    int code();


}

class Sbi implements Bank {
    public int rateOfInterest() {
        return 10;
    }

    public void displayBalance(){
        System.out.println("displaying balance from sbi class");
    }
}

class Bob implements Bank, BankCode {
    public int rateOfInterest() {
        return 12;
    }
    public int code(){
        return 123;
    }

}

public class Interface {
    public static void main(String[] args){
        Bank b = new Sbi();

        int roi = b.rateOfInterest();
        System.out.println(roi);

//        multiple inheritance

        Bob bob = new Bob();
        int roi2 = bob.rateOfInterest();
        int c = bob.code();
        System.out.println(roi2+" " + c);

        b.displayBalance();
        bob.displayBalance();
    }
}
