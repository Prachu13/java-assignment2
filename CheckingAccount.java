import java.util.*;
public class CheckingAccount extends account{
    protected double overdraft_limit=-100;
    CheckingAccount(int id,double balance,String date)
    {
        super(id,balance,date);
    }
    void withdraw(double amount)
    {
        if(balance-amount>=overdraft_limit)
        {
            super.withdraw(amount);
        }
        else{
            System.out.println("Over drawing is passing the given limit");
        }
    }
    String tostring()
    {
        return "CheckingAccount{"+ "mbalance="+ balance +'}';
    }

}