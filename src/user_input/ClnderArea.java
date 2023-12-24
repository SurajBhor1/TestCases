
package user_input;
import java.util.Scanner;
public class ClnderArea {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
System.out.println("Enter the radius R of cylinder in cm");
double R=sc.nextDouble();
System.out.println("Enter the value of height H in cm");
double H=sc.nextDouble();
double a=(2*3.14*R*H);
double b=(2*3.14*R*R);
double area=(a+b);
System.out.println("The are of cylinder is"+ area+ "sq Cm");
	}

}