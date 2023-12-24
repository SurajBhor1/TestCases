package logical;

public class Palindrom {

	public static void main(String[] args) {
		int num=450;
		int a;
		int rev=0;
		int temp=num;
		while(num>0) {
			a=num%10;
			rev=rev*10+a;
			
			num=num/10;
			
			}
System.out.println("reverce of number"+rev);

if(temp==rev) {
	System.out.println("number"+temp+" is palindrom");
}
else {
	System.out.println(temp+"  number is not palindrom");
}
	}

}
