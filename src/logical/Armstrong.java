package logical;

public class Armstrong {

	public static void main(String[] args) {
		int num=1634;
        int temp;
        int arm=num;
int rev=0;
	while(num>0) {
		temp=num%10;
		rev=rev+temp*temp*temp*temp;
		num=num/10;
		
	}
	if(rev==arm) {
		
		System.out.println("number is armstrong number");
	}
	else {
		System.out.println("number is not armstrong");
	}
		
	}

}
