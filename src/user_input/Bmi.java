package user_input;
import java.util.Scanner;
public class Bmi {
	public static void main(String[] args) {
	System.out.println("enter your weight in KG");	
Scanner sc=new Scanner(System.in);
double w=sc.nextDouble();
System.out.println("enter your height in meter");
double h=sc.nextDouble();
double t=h*h;
double bmi=w/t;
if(bmi>25&&bmi<29.9) {
	System.out.println("you are overweight");	
}
else if(bmi>18.5&&bmi<24.9) {
	System.out.println("you are normal weight");	
}
else if(bmi>30) {
	System.out.println("you are obese");	
}
else if(bmi<18.5){
	System.out.println("you are under weight");	
	}	
}
	}


