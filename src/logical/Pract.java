package logical;

public class Pract {
	
	public static void ReverceNum() {
		int num=12345;
		int rev=0;
		int temp;
		int pal=num;
		while(num>0) {
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		System.out.println("reverce of num  "+rev);
		if(pal==rev) {
			System.out.println("number is palindrom");
		}
		else {
			System.out.println("number is not palindrom");
		}
	}
	
	public static void StringRev() {
		String s=new String("raju is good boy");
	int a=	s.length();
	String rev="";
		System.out.println(s.length());
		char d;
		for(int i=a-1;i>=0;i--) {
			d= s.charAt(i);
			rev=rev+d;
		}
		System.out.println("reve of string   "+rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pract.ReverceNum();
Pract.StringRev();

	}

}
