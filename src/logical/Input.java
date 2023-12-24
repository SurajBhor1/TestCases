package logical;

import java.util.Scanner;

public class Input {
public void Adiition() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num 1");
	int a=sc.nextInt();
	System.out.println("enter num2");
	int b=sc.nextInt();
	int c=a+b;
	
	System.out.println("sum of two number"+c);
	
}
public static void main(String[] args) {
	Input n=new Input();
	n.Adiition();
}
}
