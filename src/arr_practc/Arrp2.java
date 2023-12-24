package arr_practc;
import java.util.Scanner;
public class Arrp2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("put your age");	
	int ag=sc.nextInt();
	System.out.println("put your wight");
	int wt=sc.nextInt();	
	System.out.println("put your height");
	int ht=sc.nextInt();
	System.out.println("put your yob");
int yob=sc.nextInt();
	int[] info= {ag,wt,ht,yob};	
	
for(int infi:info) {
	
	System.out.println(infi);
}
	}

}
