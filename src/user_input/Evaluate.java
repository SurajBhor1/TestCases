package user_input;
import java.util.Scanner;
public class Evaluate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("type the value for a");
int a=sc.nextInt();
System.out.println("type the value for b");
int b=sc.nextInt();
System.out.println("type the value for c13");
int c=sc.nextInt();
if(a==b&b==c){
	System.out.println("numbers are eqal");
}
else {
	System.out.println("not equal");
}
	}

}
