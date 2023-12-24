package user_input;
import java.util.Scanner;
public class Abcd {
public void percentage(){
	System.out.println("Enter the marks for marathi");
	Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble();
	System.out.println("Enter the marks for english");
	double b=sc.nextDouble();
	System.out.println("Enter the marks for hindi");
	double c=sc.nextDouble();
	double d=a+b+c;
	double p=(d/300)*100;
	System.out.println("percentage for yor language"+p);
}
public static void main(String[] args) {
	Abcd obj=new Abcd();
	obj.percentage();
	
}
}
