import java.util.*;
public class ass_2prac_2main
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    account obj=new account();
    int id=obj.getid();
    double Balance=obj.getBalance();
    double AIR=obj.getAIR();
    Date date=obj.getDate();
    double mir=obj.getMonthlyInterestRate();
    double monthlyinterest=obj.getMonthlyInterest();
    System.out.println("id : "+id);
    System.out.println("Balance : "+Balance);
    System.out.println("Annual interest rate : "+AIR);
    System.out.println("Date : "+date);
    System.out.println("Date : "+date);
    System.out.println("Monthly interest rate is  : "+mir);
    System.out.println("Monthly interest is : "+monthlyinterest);
    System.out.print("Enter w if you want to withdraw and d if you want to deposit : ");
    String a=sc.nextLine();
    if(a.compareTo("w")==0||a.compareTo("W")==0)
    {
        System.out.println("Enter amount you want to withdraw : ");
        double amountw=sc.nextDouble();
        obj.withdraw(amountw);
    }
    else if(a.compareTo("d")==0||a.compareTo("D")==0)
    {
        System.out.println("Enter amount you want to deposit : ");
        double amountd=sc.nextDouble();
        obj.deposit(amountd);
    }
}

}
