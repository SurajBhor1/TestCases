package logical;

public class Table {
	int a=1;
	void table() {
		

		for(int j=1;j<=10;j++) {
		
		for (int i=1;i<=10;i++) {
			
			System.out.print("   "+a*i);
		
		}
		System.out.println();
		a=a+1;
		System.out.println("table for " +a+"==========");
	}
		
	}
	public static void main(String[] args) {
		Table t=new Table();
		t.table();
		

	}

}
