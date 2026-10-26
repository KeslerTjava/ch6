import java.util.Scanner;
public class Abecedarian {

public static void main(String [] args) {
Scanner in = new Scanner (System.in);
String inputstring = in.nextLine ();
System.out.print(isAbecedrian(inputstring));

}
public static boolean isAbecedrian ( String str) {
	boolean ans = true;
	for ( int i = 0; i < str.length()-1 ; i++) {
		if ( str.charAt(i) > str.charAt(i+1)) {
		 ans = false;
	 }
 } return ans;
}
 }

