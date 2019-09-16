package FindAllPalindromePossible;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Varadharajan on 2019-09-16
 * @project name: GoldmansachsCoderPadQuestions
 */
public class FindAllPalindrome {

    public static int findAllPalindromesUsingBruteForceApproach(String input) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                if (isPalindrome(input.substring(i, j))) {
                    palindromes.add(input.substring(i, j));
                }
            }
        }
        return palindromes.size();
    }

    private static boolean isPalindrome(String input) {
        StringBuilder plain = new StringBuilder(input);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(input);
    }

    public static void main(String[] args) {
        findAllPalindromesUsingBruteForceApproach("122");
    }
}
