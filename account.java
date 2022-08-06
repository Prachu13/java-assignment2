import java.util.*;
public class account{
    protected int id;
    protected double balance;
    protected double AIR;
    protected Date date = new Date();
    Scanner sc = new Scanner(System.in);
    account()
    {
        id=0;
        balance=500;
        AIR=7;
    }
    account(int ID,double Balance,String date)
    {
        ID=id;
        Balance=balance;
    }
    int getid()
    {
        System.out.print("Enter id : ");
        id=sc.nextInt();
        return id; 
    }
    double getBalance()
    {
        System.out.print("Enter balance : ");
        balance=sc.nextDouble();
        return balance;
    }
    double getAIR()
    {
        System.out.print("Enter Annual interest rate : ");
        AIR=sc.nextDouble();
        System.out.println("Annual Intreset Rate --"+AIR);
        return AIR;
    }
    Date getDate()
    {
        return date;
    }
    double getMonthlyInterestRate()
    {
        return (AIR/12);
    }
    double getMonthlyInterest()
    {
        return ((balance*(AIR/12)*1)/100);
    }
    void withdraw(double w)
    {
        balance-=w;
        System.out.println("Amount ["+w+"] withdrawn from id["+id+"]");
        System.out.println("Balance after withdrawal : "+balance);
    }   
    void deposit(double d)
    {
        balance+=d;
        System.out.println("Amount ["+d+"] deposited from id["+id+"]");
        System.out.println("Balance after deposit : "+balance);
    }
    
}
