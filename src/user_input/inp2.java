// integer input identify zero,positive, negative,

package user_input;
import java.util.Scanner;
public class inp2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	

	System.out.println("enter the value");
	
	float a=sc.nextFloat();
	
	if(a==0) {
		System.out.println("zero");	
	}

	if(a>0&&a<1) {
		System.out.println("positive");	
		System.out.println("smaller");	
		
	}
	else if(a>0&&a>=100000) {
		System.out.println("positive");	
		System.out.println("larger");	
		
	}
	
	else if(a>0&&a>1) {
		System.out.println("positive");	
	}
	else {
		System.out.println("negative");		
	}
	}
	
	}


