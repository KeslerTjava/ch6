import java.util.Scanner;
public class Doubloon {
	public static void main(String [] args) {
	Scanner in = new Scanner (System.in);
	String inputstring = in.nextLine ();
	System.out.print(isDoubloon(inputstring));
}
	public static boolean isDoubloon ( String str){
		boolean ans = false;
		for ( int i = 0; i < str.length()-1 ; i++) {
			if ( str.Indexof(i,0) == str.substring(i+1));
			ans = true;
		} return ans;
	} 
}
