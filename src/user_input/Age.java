package user_input;
import java.util.Scanner;
public class Age {
public static void main(String[] args) {
int a=2022;
System.out.println("Enter your birth year");
Scanner Sc=new Scanner(System.in);
int b=Sc.nextInt();
int age=a-b;  
if(b>2022||b<=0) {
System.out.println("invalid input");	
	}

	else if(age<18){
		System.out.println("Your age is"+age+"you are not adult");
	}
	else {
		System.out.println("your age is"+age+"you are adult");
	}
	

}
}


