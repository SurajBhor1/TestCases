package logical;

import org.testng.annotations.Test;

public class SuperChild extends SuperParant {

	SuperChild() {
		super();
	}

	@Test
	public void check() {
		System.out.println("this is child class method");

	}

	@Test
	public void palNum() {
		int a = 22432;
		int act = a;
		int rev = 0;
		while (a > 0) {
			int temp = a % 10;
			rev = rev * 10 + temp;
			a = a / 10;
		}
		System.out.println("reverce of given num:  " + rev);
		if (act == rev) {
			System.out.println("given number is palindrom");
		} else {
			System.out.println("not palindrom");
		}
		
	}
	@Test
	public void prfctNum() {
		int a=3;
		boolean check=true;
		for(int i=2;i<45;i++) {
			if(a%i==0) {
				check=false;
			}
			}
		if(check==false) {
			System.out.println("number is not perfect");
		}
		else {
			check=true;
		}
	}
}
