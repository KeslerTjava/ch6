public class Abecedarian {
public static boolean isAbecedrian ( String str) {
	char letter = str.charAt(0);
	for ( int i = 0; i < str.length()-1 ; i++) {
		if ( str.charAt(i) < str.charAt(i+1)) {
		 return true;
	 }
 } return false;
}
 }
