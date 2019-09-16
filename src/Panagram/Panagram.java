package Panagram;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Varadharajan on 2019-09-10
 * @project name: GoldmansachsCoderPadQuestions
 */
public class Panagram {

    public static boolean isAlpha(String s) {
        return s != null && s.matches("^[a-zA-Z]*$");
    }


    private static boolean isPerfectAnagram(String str) {

        final Set set = new HashSet();

        IntStream.range(0, str.length())
                .forEach(index -> set.add(str.charAt(index)));

        return set.size() == 26 ? true : false;
    }

    public static boolean isPangramWithStreams(String str) {
        if (str == null) {
            return false;
        } else
            return str.toUpperCase()
                    .chars()
                    .filter(item -> ((item >= 'A' && item <= 'Z')))
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toMap(item -> item, k -> Boolean.TRUE, (p1, p2) -> p1))
                    .size() == 26;


    }


    public static void main(String[] args) {

        String str = "abcdefghijklmnopqrstuvwxyzzzzz";

        String str1 = "idhgfiu79ds7f;";

        if (str.length() < 26)
            System.out.println("failure for : :=> " + str);

        if (str1.length() < 26)
            System.out.println("failure for : :=> " + str1);

        if (isAlpha(str) && isPerfectAnagram(str) && isPangramWithStreams(str))
            System.out.println("success for : :=> " + str);
        else
            System.out.println("failure for : :=> " + str);

        if (isAlpha(str1) && isPerfectAnagram(str1) && isPangramWithStreams(str1))
            System.out.println("success for : :=> " + str1);
        else
            System.out.println("failure for : :=> " + str1);
    }
}
