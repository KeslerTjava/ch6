public class Palindrome{
	 
	 public static void main(String [] args) {
		 System.out.println(isPalindrome("racecar"));
	 }
	public static boolean isPalindrome(String str) {
    str = str.toLowerCase();

    String nonLetters = ",.:;()[]{}!@#$%^&* ";
    String newStr = "";

    for (int i = 0; i < str.length(); i++) {
        String letter = str.substring(i, i + 1);

        if (nonLetters.contains(letter)) {
            // Ignore non-letter characters
        } else {
            newStr += letter;
        }
    }

    for (int i = 0; i < newStr.length() / 2; i++) {
        if (newStr.substring(i, i + 1).equals(
            newStr.substring(newStr.length() - 1 - i,
            newStr.length() - i))) {
            // Letters match
        } else {
            return false;
        }
    }

    return true;
}
}
