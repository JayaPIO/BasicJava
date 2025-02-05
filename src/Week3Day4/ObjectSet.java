package Week3Day4;

import java.util.HashSet;

class Payment{
   private Integer paymentid;
   private int accountNo;
   private String accountHolder;

   Payment(int paymentid, int accountNo,String accountHolder){
       this.paymentid = paymentid;
       this.accountHolder = accountHolder;
       this.accountNo = accountNo;
   }

   public String toString(){
       return "[ "+paymentid+ " "+accountNo+" "+accountHolder+" ]";
   }

   public int getAccountNo(){
       return accountNo;
   }

   public String getAccountHolder(){
       return accountHolder;
   }

   // hashcode override
    public int hashCode(){
       return paymentid.hashCode();
    }


    // equals override
    public boolean equals(Object o){
       return ((accountNo == ((Payment) o).getAccountNo()) && (accountHolder.equals(((Payment) o).getAccountHolder())));
    }


}

public class ObjectSet {
    public static void main(String[] args){
        HashSet<Payment> set = new HashSet<>();

        set.add(new Payment(101,100001,"A"));
        set.add(new Payment(102,10002,"B"));
        set.add(new Payment(103,100003,"C"));
        set.add(new Payment(102,10002,"B"));

        System.out.println("set: "+set);

        // with reference
//        Payment p =new Payment(1,01,"D");
////
//        set.add(p);
//        set.add(p);

        System.out.println("set: "+set);

        if (set.contains(new Payment(102,10002,"B"))){
            System.out.println("payment already done");
        }
        else{
            set.add(new Payment(102,10002,"B"));
            System.out.println("payment added");
        }



    }

}
