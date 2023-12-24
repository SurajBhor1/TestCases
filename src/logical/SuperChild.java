package logical;

import org.testng.annotations.Test;

public class SuperChild extends SuperParant {
	
	
SuperChild(){
		super();
	}
@Test
	public void check() {
		System.out.println("this is child class method");
		
	}
}
