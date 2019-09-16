package longestUniformSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author Varadharajan on 2019-09-11
 * @project name: GoldmansachsCoderPadQuestions
 */
public class LongestUniformSubString {

    public static void main(String[] args) {

        String s = "geeksforgeeks";
        longestUniformLength(s);
        String str = getUniqueCharacterSubstring(s);
        System.out.println(str);
    }

    private static void longestUniformLength(String s) {
        int j = 0;
        int lenSubstr = 0;
        HashSet<Character> subset = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!subset.contains(c)) {
                subset.add(c);
                lenSubstr = Math.max(lenSubstr, subset.size());
            } else {
                while (j < i) {

                    if (s.charAt(j) == c) {
                        j++;
                        break;
                    } else {
                        subset.remove(s.charAt(j));
                        j++;
                    }
                }

                subset.add(c);
            }
        }
        System.out.println("Original String = " + s);
        System.out.println("Length of Longest substring = " + lenSubstr);
    }

    private static  String getUniqueCharacterSubstring(String input) {
        int intial = 0;
                int fin=0;
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
                intial =start;
                fin = end;
            }
            visited.put(currChar, end);
        }

        System.out.println("start index-->"+ intial + " ::end index-->"+fin);

        return output;
    }
}
