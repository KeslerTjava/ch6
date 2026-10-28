import java.util.Scanner;
public class PPAP{
	public static void main(String [] args) {
		Scanner in  = new Scanner (System.in);
		String word1 = in.nextLine();
		String word2 = in.nextLine();
		System.out.println(ppap(word1, word2));
	}
	public static String ppap(String a, String b) {
		String speech = "I have a " + a+ "," + " I have a " + b;
		String bC = b.substring(0,1).toUpperCase();
		String bs = b.substring(1);
		String result = " Uh! " + bC + bs+ " "+ a; 
		return speech + result;
}
}
