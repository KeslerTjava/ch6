import java.util.Scanner;
public class PigLatin {
	public static void main(String [] args) {
	Scanner in = new Scanner (System.in);
	String str = in.nextLine ();
	System.out.print(pigLatin(str));
}

    public static String pigLatin(String msg) {
        String newMsg = "";
        String word = "";

        for (int i = 0; i < msg.length(); i++) {
            String letter = msg.substring(i, i + 1);

            if (letter.equals(" ")) {
                if (word.length() > 2) {
                    word = word.substring(1) + word.substring(0, 1) + "ay";
                }

                newMsg += word + " ";
                word = "";
            } else {
                word += letter;
            }
        }
        if (word.length() > 2) {
            word = word.substring(1) + word.substring(0, 1) + "ay";
        }
        newMsg += word;
        return newMsg;
    }
}
