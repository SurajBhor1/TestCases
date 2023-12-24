package logical;

public class CharInString {

	public static void main(String[] args) {
		int count=0;
		char sp=' ';
		String str="The best of both world";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=sp ) {
				count=count+1;
			}
			
			
		}
		
		System.out.println(count);

	}

}
