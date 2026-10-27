import java.util.Scanner;
public class Doubloon {
	public static void main(String [] args) {
	Scanner in = new Scanner (System.in);
	String str = in.nextLine ();
	System.out.print(isDoubloon(str));
}
	public static boolean isDoubloon ( String str){
		for( int i = 0; i < str.length(); i++) {
		char letter = str.charAt(i);
		if ( count(str , letter) % 2 != 0) {
			return false;
	} 
}  return true;
}
	public static int count( String s , char c) {
		int sum = 0;
		for( int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (letter == c) {
				sum++;
		}
	}  return sum;
}
}
