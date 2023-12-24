package user_input;
import java.util.Scanner;
public class Percntg {
public static void main(String[] args) {

Scanner Sc=new Scanner(System.in);
System.out.println("enter your sub marks English");
int english=Sc.nextInt();
System.out.println("enter your sub marks marathi");
int marathi=Sc.nextInt();
System.out.println("enter your sub marks maths");
int maths=Sc.nextInt();
System.out.println("enter your sub marks scince");
int science=Sc.nextInt();
System.out.println("enter your sub marks geo");
int geo=Sc.nextInt();
System.out.println("enter your sub marks sports");
int sports=Sc.nextInt();

int []sub= {english,marathi,maths,science,geo,sports};
int sum=0;
//int ttl=600;
for(int subject:sub) {
	
	sum+=subject;
	
}
double fract=((sum/600));
//double percnt=(fract*100);

System.out.println(fract);
}




	}


