package logical;

public class Perfect_num {
	int a=7;
	int per;
	int temp=0;
	int num=a;
	void show() {
		
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				
		temp=temp+i;
			}
//			if(temp!=0) {
//				per=temp+temp;
//			}
		}
		System.out.println(temp);
		if(temp==num) {
			System.out.println("number is perfect");
		}
		else {
			System.out.println("not perfect");
			per=0;
		}
			}
	
	
	public static void main(String[] args) {
		Perfect_num  n=new Perfect_num ();
		n.show();

	}

}
