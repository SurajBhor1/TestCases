package logical;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Calculater {
	@Test
	public void calculate() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter numbers to manipulate");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("choose operation");
		String operation =sc.next();
		switch (operation){
		case ("+"):
			System.out.println(a+b);
		break;
		case("-"):
			System.out.println(a-b);
		}
	}

}
