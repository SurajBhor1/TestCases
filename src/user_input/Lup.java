package user_input;
import java.util.Scanner;
public class Lup {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of age");
int a=sc.nextInt();
System.out.println("enter the value of age");
int b=sc.nextInt();

int[] age= {a,b};

int sum=0;
for(int t:age) {
	sum+=t;
}
int l=age.length;
double average=(sum/l);

System.out.println("average of ypur age is"+average);
	}

}
