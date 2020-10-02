/**
 * 9.4 Recursion exercise.
 * @author ivorgilmartin
 */
public class Recurse {

    /**
     * 9.4.2 Displays the letters of a string, one on each line.
     */
    public static void printString(String s) {
        if(length(s) == 0)return;
        System.out.println(first(s));
        printString(rest(s));
    }

    /**
     * 9.4.3 Displays a string backwards, one character per line.
     */
    public static void printBackward(String s) {
        if(length(s) == 0)return;
        printBackward(rest(s));
        System.out.println(first(s));
    }

    /**
     * 9.4.4 Reverses a string, returns a new string.
     */
    public static String reverseString(String s) {
        if(length(s) != 0) { 
            return reverseString(rest(s)) + first(s);
        }
        return "";
    }

    /**
     * 9.4.5 Checks if a word is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        if(length(s) == 1) return true;
        if(length(s) == 2 && first(s) == first(rest(s))) return true;
        if(length(s) > 2) return isPalindrome(middle(s));
        return false;
    }

    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }

    public static void main(String[] args) { 
        String s = "coffee";
        System.out.println(s);
        System.out.println(first(s));
        System.out.println(rest(s));
        System.out.println(middle(s));
        System.out.println(length(s));

        printString(s);
        printBackward(s);
        String reversed = reverseString(s);
        System.out.println(reversed);
        String pal = "palindromeemordnilap";
        System.out.println(isPalindrome(pal));	
    }


}
