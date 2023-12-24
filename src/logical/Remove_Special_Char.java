package logical;

public class Remove_Special_Char {

	public static void main(String[] args) {
String s="SU@r$a%J";
//s.concat("SU@r$a%J");
String str=s.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(str);

	}

}
