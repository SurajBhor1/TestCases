package arr_practc;
import java.util.Arrays;
import java.util.Scanner;
public class Arrp3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of entries");
	int size=sc.nextInt();	
	int sum=0;
	int[] allelm=new int[size];
	System.out.println("Enter numbers one by one");	
		
	for(int i=0;i<size;++i) {
	allelm[i]=sc.nextInt();
	sum=sum+allelm[i];
		
}
	System.out.println("numers are"+ Arrays.toString(allelm));		
	System.out.println("sum is"+sum);		
	}

}
