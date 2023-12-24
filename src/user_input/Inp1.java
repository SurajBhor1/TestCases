// take 4 number and print greatest one

package user_input;
import java.util.Scanner;
public class Inp1 {
 public static void main(String[] args) {
Scanner sc= new Scanner(System.in);	
System.out.println("Enet a");
int a=sc.nextInt();
System.out.println("Enet b");
int b=sc.nextInt();
System.out.println("Enet c");
int c=sc.nextInt();

if(a>b&&b>c) {
	System.out.println("greatest number is"+a);	
}
if(b>c&&c>a) {
	
	System.out.println("greatest number is"+b);	
}
else {
	System.out.println("greatest number is"+c);	
	}
}

	}


