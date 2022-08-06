/*import java.util.*;
public class atm{
    private String id;
    private double balance;
    Scanner sc=new Scanner(System.in);
    atm()
    {
        balance=300;
    }
    String getid()
    {
        System.out.print("Enter id in form ACXXX(ex:AC001) : ");
        id=sc.next();
        return id; 
    }
    double getBalance()
    {
        System.out.print("Enter balance : ");
        balance=sc.nextDouble();
        return balance;
    }
    void withdraw(double w)
    {
        if(balance-w>300){
               balance=-w;
       System.out.println(""+w" rs successfully withdrawn");
       System.out.println("current balance : "+balance);}
       else{
        System.out.println("insufficient balance");
       }
    }
    void deposit(double d)
    {
        balance+=d;
        System.out.println(""+d" rs deposited successfully");
        System.out.println("current balance : "+balance);
    }
    void transfer(double w,atm obj)
    {
        if(balance-w>300)
        {
        balance-=w;
        obj.balance+=w;
        System.out.println(""+w"rs transferred successfully");}
        else{
            System.out.println("insufficient balance to transfer");
        }
    }

}*/
public class atm {
    private static int count;
    private final String id;
    private double balance;

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public atm() {
        count++;
        if (count < 10) {
            id = "AC00" + (count);
        } else {
            id = "AC0" + (count);
        }
        balance = 300;
    }

    public void withdraw(double money) {
        if (balance - money >= 300) {
            balance -= money;
            System.out.println(money + " Rs successfully withdrawn.");
            System.out.println("Remaining Balance is : " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw the amount.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "Rs deposited to your account.");
        System.out.println("Current Balance is : " + balance);
    }

    public void MoneyTransfer(atm obj, double amount) {
        if (balance - amount >= 300) {
            balance -= amount;
            obj.balance += amount;
            System.out.println(amount + " Rs successfully Transferred.");
            System.out.println("Remaining Balance is : " + balance);
        } 
        else {
            System.out.println("Insufficient balance to transfer the amount.");
        }
    }

} 