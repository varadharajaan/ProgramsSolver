package FirstNonRepeatingCharacter;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Varadharajan on 2019-09-06
 * @project name: GoldmansachsCoderPadQuestions
 */
public class MaximumRepeatingCharacter {


    public static void main(String[] args) {

        String str = "geeksforgeeks";
        System.out.println(getMaximumRepeatingCharacter(str));

    }

    private static String getMaximumRepeatingCharacter(String input) {

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        char[] chArr = input.toCharArray();

        for(int i=0;i<input.length();i++) {
            if (map.containsKey(input.charAt(i))) {
                char ch = input.charAt(i);
                map.computeIfPresent(ch, MaximumRepeatingCharacter::apply);
            }else {
                map.putIfAbsent(input.charAt(i),1);
            }
        }

        Optional<Map.Entry<Character, Integer>> maxEntry = map.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        return Character.toString(maxEntry.get().getKey());

    }

    private static int apply(Object k, Object v) {

        return (int) v+1;
    }


    private static Integer apply(Character k, Integer v) {
        return v +1;
    }
}
