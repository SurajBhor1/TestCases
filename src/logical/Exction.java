package logical;

public class Exction {
public static void main(String[] args) {
	
	try {
		System.out.println("1");
		int a = 10;
		int b = 0;
	int c = a / b;
	System.out.println(c);
		}
		catch (Exception  e) {  
			e.printStackTrace();

		System.out.println(e);
		}
	finally {
		System.out.println("exception found successfully");
	}
	
}
}