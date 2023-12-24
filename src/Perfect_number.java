
public class Perfect_number {
	int num=7;
	int b=0;
	int perf=num;
	public void show() {
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				b=b+i;
				}
		}
			if (b==perf) {
			System.out.println("number  "+num+"  is perfect number");
			}
			else {
				System.out.println("not perfect");
			}
			}

	public static void main(String[] args) {
		Perfect_number obj=new Perfect_number();
obj.show();
	}

}
