import java.util.Scanner;
public class ass_2prac_1main {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter radius : ");
     double r=sc.nextDouble();
     circle obj=new circle(r);
     double Area=obj.getArea();
     double peri=obj.getPerimeter();
     System.out.println(Area);
     System.out.println(peri);  
}
}
