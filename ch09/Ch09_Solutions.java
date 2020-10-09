import java.util.Arrays;

/**
 * Solutions to chapter 9 exercises.
 * @author ivorgilmartin
 */
public class Ch09_Solutions {

    /**
     * 9.2 Returns a histogram of the letters in a string.
     */
    public static int[] letterHist(String s) {
        char[] chars = s.toUpperCase().toCharArray();
        int[] hist = new int[26];
        int index;
        for (char ch : chars) {
            index = (int) ch - 65;// A is 65 in Unicode
            if (index > -1)
                hist[index]++;
        }
        return hist;
    }

    /**
     * 9.3.1 Returns 0 if the string has the same number of open and close
     * parentheses.
     */
    public static int count(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;
    }

    /**
     * 9.3.2 Returns 0 if the string has the same number of each character.
     */
    public static int count(String s, char a, char b) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == a) {
                count++;
            } else if (c == b) {
                count--;
            }
        }
        return count;
    }

    /**
     * 9.5 Checks if a word is abecedarian.
     */
    public static boolean isAbecedarian(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 9.6 Checks if a string is a doubloon.
     */
    public static boolean isDoubloon(String s) {
        boolean flag = true;
        int[] hist = letterHist(s);
        for (int i = 0; i < hist.length; i++) {
            if (hist[i] != 0 && hist[i] != 2) {
                flag = false;
            }
        }
        return flag;
    }

    /**
     * 9.7 Checks if two strings are anagrams of each other.
     */
    public static boolean isAnagram(String s1, String s2) {
        int[] hist1 = letterHist(s1);
        int[] hist2 = letterHist(s2);
        for (int i = 0; i < hist1.length; i++) {
            if (hist1[i] != hist2[i])
                return false;
        }
        return true;
    }

    /**
     * 9.8 Checks if "letters" can spell "word".
     */
    public static boolean canSpell(String letters, String word) {
        int[] lettersHist = letterHist(letters);
        int[] wordHist = letterHist(word);
        for (int i = 0; i < lettersHist.length; i++) {
            if (wordHist[i] > lettersHist[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(letterHist("abcz")));

        System.out.println(count("()"));
        System.out.println(count("zero", 'e', 'o'));

        System.out.println(isAbecedarian("chintz"));

        System.out.println(isDoubloon("murmur"));

        System.out.println(isAnagram("stop", "pots"));

        String letters = "zabselcrby";
        String word = "scrabble";
        System.out.println(canSpell(letters, word));
    }

}
